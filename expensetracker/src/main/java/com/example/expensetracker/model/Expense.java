package com.example.expensetracker.model;

<<<<<<< HEAD
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private double amount;
    private String category; // ✅ Ajout du champ catégorie

    public Expense() {}

    public Expense(Long id, String description, double amount, String category) {
        this.id = id;
        this.description = description;
        this.amount = amount;
        this.category = category;
    }

    // Getters and Setters

=======
public class Expense {
    private Long id;
    private String description;
    private double amount;

    public Expense() {}

    public Expense(Long id, String description, double amount) {
        this.id = id;
        this.description = description;
        this.amount = amount;
    }

>>>>>>> d8953709a5544e0b0b3fefce8dcf1bd4a19d39ab
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
<<<<<<< HEAD

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
=======
>>>>>>> d8953709a5544e0b0b3fefce8dcf1bd4a19d39ab
}
