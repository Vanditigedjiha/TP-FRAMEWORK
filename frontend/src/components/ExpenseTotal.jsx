import React from 'react';

function ExpenseTotal({ total }) {
  if (total === null) return null;

  return (
    <div style={{ marginTop: 20 }}>
      <h3>Total des dépenses sur la période : {total.toFixed(2)} €</h3>
    </div>
  );
}

export default ExpenseTotal;
