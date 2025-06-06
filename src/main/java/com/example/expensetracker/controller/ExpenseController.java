package com.example.expensetracker.controller;

import com.example.expensetracker.model.Expense;
import com.example.expensetracker.service.ExpenseService;

import java.util.List;

public class ExpenseController {
    private final ExpenseService service;

    public ExpenseController(ExpenseService service) {
        this.service = service;
    }

    public List<Expense> getAllExpenses() {
        return service.getAllExpenses();
    }

    public Expense getExpenseById(Long id) {
        return service.getExpenseById(id);
    }

    public Expense saveExpense(Expense expense) {
        return service.saveExpense(expense);
    }

    public void deleteExpense(Long id) {
        service.deleteExpense(id);
    }
}
