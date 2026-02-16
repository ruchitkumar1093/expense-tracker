package com.ruchit.expensetracker.service;

import com.ruchit.expensetracker.model.Expense;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExpenseService {

    private final List<Expense> expenses = new ArrayList<>();
    private Long currentId = 1L;

    public Expense addExpense(Expense expense) {
        expense.setId(currentId++);
        expenses.add(expense);
        return expense;
    }

    public List<Expense> getAllExpenses() {
        return expenses;
    }
}
