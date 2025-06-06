import React, { useState, useEffect } from 'react';
import ExpenseForm from './components/ExpenseForm';
import ExpenseList from './components/ExpenseList';
import ExpenseFilter from './components/ExpenseFilter';
import ExpenseTotal from './components/ExpenseTotal';
import './App.css';

const API_BASE = 'http://localhost:8080/api/expenses';

function App() {
  const [expenses, setExpenses] = useState([]);
  const [categoryFilter, setCategoryFilter] = useState('');
  const [dateRange, setDateRange] = useState({ start: '', end: '' });
  const [total, setTotal] = useState(null);

  const fetchAllExpenses = () => {
    fetch(API_BASE)
      .then(res => res.json())
      .then(data => setExpenses(data))
      .catch(console.error);
  };

  const fetchByCategory = (category) => {
    if (!category) return fetchAllExpenses();

    fetch(`${API_BASE}/category/${encodeURIComponent(category)}`)
      .then(res => res.json())
      .then(data => setExpenses(data))
      .catch(console.error);
  };

  const fetchBetweenDates = (start, end) => {
    if (!start || !end) return fetchAllExpenses();

    fetch(`${API_BASE}/between?start=${start}&end=${end}`)
      .then(res => res.json())
      .then(data => setExpenses(data))
      .catch(console.error);
  };

  const fetchTotalBetweenDates = (start, end) => {
    if (!start || !end) {
      setTotal(null);
      return;
    }

    fetch(`${API_BASE}/total?start=${start}&end=${end}`)
      .then(res => res.json())
      .then(data => setTotal(data))
      .catch(console.error);
  };

  useEffect(() => {
    fetchAllExpenses();
  }, []);

  return (
    <div className="app-container">
      <h1 className="app-title">Suivi des Dépenses Personnelles</h1>

      <ExpenseForm
        onAdd={() => {
          fetchAllExpenses();
          setCategoryFilter('');
          setDateRange({ start: '', end: '' });
          setTotal(null);
        }}
      />

      <ExpenseFilter
        category={categoryFilter}
        onCategoryChange={(cat) => {
          setCategoryFilter(cat);
          if (cat) fetchByCategory(cat);
          else fetchAllExpenses();
          setTotal(null);
          setDateRange({ start: '', end: '' });
        }}
        dateRange={dateRange}
        onDateRangeChange={(range) => {
          setDateRange(range);
          if (range.start && range.end) {
            fetchBetweenDates(range.start, range.end);
            fetchTotalBetweenDates(range.start, range.end);
          } else {
            fetchAllExpenses();
            setTotal(null);
          }
          setCategoryFilter('');
        }}
      />

      <ExpenseTotal total={total} />
      <ExpenseList expenses={expenses} />
    </div>
  );
}

export default App;
