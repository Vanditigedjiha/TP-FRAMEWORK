package com.example.expensetracker.repository;

import com.example.expensetracker.model.Expense;
import java.util.List;

public interface ExpenseRepository {
    List<Expense> findAll();
    Expense save(Expense expense);
    Expense findById(Long id);
    void deleteById(Long id);
}
