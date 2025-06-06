import React from 'react';

function ExpenseList({ expenses }) {
  if (!expenses.length) return <p>Aucune dépense à afficher.</p>;

  return (
    <div>
      <h2>Dépenses</h2>
      <table border="1" cellPadding="8" style={{ width: '100%', borderCollapse: 'collapse' }}>
        <thead>
          <tr>
            <th>Description</th>
            <th>Montant</th>
            <th>Catégorie</th>
            <th>Date</th>
          </tr>
        </thead>
        <tbody>
          {expenses.map(({ id, description, amount, category, date }) => (
            <tr key={id}>
              <td>{description}</td>
              <td>{amount.toFixed(2)} €</td>
              <td>{category}</td>
              <td>{date}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}

export default ExpenseList;
