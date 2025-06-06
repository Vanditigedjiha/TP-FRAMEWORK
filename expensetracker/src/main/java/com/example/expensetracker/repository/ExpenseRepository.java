package com.example.expensetracker.repository;

import com.example.expensetracker.model.Expense;
<<<<<<< HEAD
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

// Interface étendue à JpaRepository pour bénéficier des méthodes CRUD auto-générées
public interface ExpenseRepository extends JpaRepository<Expense, Long> {
    List<Expense> findByCategory(String category);  // ✅ méthode personnalisée
=======
import java.util.List;

public interface ExpenseRepository {
    List<Expense> findAll();
    Expense save(Expense expense);
    Expense findById(Long id);
    void deleteById(Long id);
>>>>>>> d8953709a5544e0b0b3fefce8dcf1bd4a19d39ab
}
