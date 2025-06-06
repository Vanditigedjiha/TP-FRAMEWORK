package com.example.expensetracker.repository;

import com.example.expensetracker.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

// Interface étendue à JpaRepository pour bénéficier des méthodes CRUD auto-générées
public interface ExpenseRepository extends JpaRepository<Expense, Long> {
    List<Expense> findByCategory(String category);  // ✅ méthode personnalisée
}
