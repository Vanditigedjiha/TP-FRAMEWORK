import React, { useState } from 'react';

const API_BASE = 'http://localhost:8080/api/expenses';

function ExpenseForm({ onAdd }) {
  const [description, setDescription] = useState('');
  const [amount, setAmount] = useState('');
  const [category, setCategory] = useState('');
  const [date, setDate] = useState('');

  const handleSubmit = async (e) => {
    e.preventDefault();

    if (!description || !amount || !category || !date) {
      alert('Merci de remplir tous les champs');
      return;
    }

    const expense = {
      description,
      amount: parseFloat(amount),
      category,
      date,
    };

    try {
      const res = await fetch(API_BASE, {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(expense),
      });

      if (res.ok) {
        setDescription('');
        setAmount('');
        setCategory('');
        setDate('');
        onAdd();
      } else {
        alert('Erreur lors de l\'ajout de la dépense');
      }
    } catch (error) {
      alert('Erreur réseau');
      console.error(error);
    }
  };

  return (
    <form onSubmit={handleSubmit}>
      <h2>Ajouter une dépense</h2>
      <div>
        <input
          type="text"
          placeholder="Description"
          value={description}
          onChange={e => setDescription(e.target.value)}
        />
      </div>
      <div>
        <input
          type="number"
          step="0.01"
          placeholder="Montant"
          value={amount}
          onChange={e => setAmount(e.target.value)}
        />
      </div>
      <div>
        <input
          type="text"
          placeholder="Catégorie"
          value={category}
          onChange={e => setCategory(e.target.value)}
        />
      </div>
      <div>
        <input
          type="date"
          value={date}
          onChange={e => setDate(e.target.value)}
        />
      </div>
      <button type="submit">Ajouter</button>
    </form>
  );
}

export default ExpenseForm;
