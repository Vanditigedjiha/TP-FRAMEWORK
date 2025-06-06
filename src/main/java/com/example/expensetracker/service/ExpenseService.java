package com.example.expensetracker.service;

import com.example.expensetracker.model.Expense;
import com.example.expensetracker.repository.ExpenseRepository;
<<<<<<< HEAD
import org.springframework.stereotype.Service;

import java.util.List;

@Service
=======

import java.util.List;

>>>>>>> d8953709a5544e0b0b3fefce8dcf1bd4a19d39ab
public class ExpenseService {
    private final ExpenseRepository repository;

    public ExpenseService(ExpenseRepository repository) {
        this.repository = repository;
    }

    public List<Expense> getAllExpenses() {
        return repository.findAll();
    }

    public Expense getExpenseById(Long id) {
<<<<<<< HEAD
        return repository.findById(id).orElse(null);
=======
        return repository.findById(id);
>>>>>>> d8953709a5544e0b0b3fefce8dcf1bd4a19d39ab
    }

    public Expense saveExpense(Expense expense) {
        return repository.save(expense);
    }

    public void deleteExpense(Long id) {
        repository.deleteById(id);
    }
<<<<<<< HEAD

    // ✅ Méthode ajoutée : récupère les dépenses par catégorie
    public List<Expense> getExpensesByCategory(String category) {
        return repository.findByCategory(category);
    }
=======
>>>>>>> d8953709a5544e0b0b3fefce8dcf1bd4a19d39ab
}
