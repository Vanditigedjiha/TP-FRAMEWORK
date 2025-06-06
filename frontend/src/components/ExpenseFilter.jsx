import React from 'react';

function ExpenseFilter({ category, onCategoryChange, dateRange, onDateRangeChange }) {
  return (
    <div style={{ marginTop: 20 }}>
      <h2>Filtrer les dépenses</h2>

      <div>
        <label>Par catégorie: </label>
        <input
          type="text"
          value={category}
          onChange={e => onCategoryChange(e.target.value)}
          placeholder="Ex: Alimentation"
        />
      </div>

      <div style={{ marginTop: 10 }}>
        <label>Période: </label>
        <input
          type="date"
          value={dateRange.start}
          onChange={e => onDateRangeChange({ ...dateRange, start: e.target.value })}
        />
        {' - '}
        <input
          type="date"
          value={dateRange.end}
          onChange={e => onDateRangeChange({ ...dateRange, end: e.target.value })}
        />
      </div>
    </div>
  );
}

export default ExpenseFilter;
