package com.example.expensetracker.controller;

import com.example.expensetracker.model.Expense;
import com.example.expensetracker.service.ExpenseService;
<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {

    private final ExpenseService service;

    @Autowired
=======

import java.util.List;

public class ExpenseController {
    private final ExpenseService service;

>>>>>>> d8953709a5544e0b0b3fefce8dcf1bd4a19d39ab
    public ExpenseController(ExpenseService service) {
        this.service = service;
    }

<<<<<<< HEAD
    // ➕ Ajouter une dépense
    @PostMapping
    public Expense saveExpense(@RequestBody Expense expense) {
        return service.saveExpense(expense);
    }

    // 📃 Lister toutes les dépenses
    @GetMapping
=======
>>>>>>> d8953709a5544e0b0b3fefce8dcf1bd4a19d39ab
    public List<Expense> getAllExpenses() {
        return service.getAllExpenses();
    }

<<<<<<< HEAD
    // 🔍 Obtenir une dépense par ID
    @GetMapping("/{id}")
    public Expense getExpenseById(@PathVariable Long id) {
        return service.getExpenseById(id);
    }

    // ❌ Supprimer une dépense
    @DeleteMapping("/{id}")
    public void deleteExpense(@PathVariable Long id) {
        service.deleteExpense(id);
    }

    // 🔍 Filtrer par catégorie
    @GetMapping("/category/{category}")
    public List<Expense> getExpensesByCategory(@PathVariable String category) {
        return service.getExpensesByCategory(category);
=======
    public Expense getExpenseById(Long id) {
        return service.getExpenseById(id);
    }

    public Expense saveExpense(Expense expense) {
        return service.saveExpense(expense);
    }

    public void deleteExpense(Long id) {
        service.deleteExpense(id);
>>>>>>> d8953709a5544e0b0b3fefce8dcf1bd4a19d39ab
    }
}
