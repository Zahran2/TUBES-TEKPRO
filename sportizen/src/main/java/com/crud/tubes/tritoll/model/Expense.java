package com.crud.tubes.tritoll.model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("expense")
public class Expense {
    @Id
    private String id;
    @Field(name = "name")
    @Indexed(unique = true)
    private String expenseName;
    @Field(name = "contact")
    private String expenseContact;
    @Field(name = "typeField")
    private ExpenseField expenseCategory;
    @Field(name = "date")
    private String expenseDate;
    @Field(name = "timeStart")
    private String expenseTime;
    @Field(name = "duration")
    private int expenseDuration;
    // @Field(name = "price")
    // private double expensePrice;

    public Expense(String id, String expenseName, String expenseContact, ExpenseField expenseCategory,
            String expenseDate,
            String expenseTime, int expenseDuration) {
        LocalDate temp;
        this.id = id;
        this.expenseName = expenseName;
        this.expenseContact = expenseContact;
        this.expenseCategory = expenseCategory;
        temp = LocalDate.parse(expenseDate);
        this.expenseDate = temp.toString();
        this.expenseTime = expenseTime;
        this.expenseDuration = expenseDuration;
        // this.expensePrice = expensePrice.getPrice();
    }

    public String getId() {
        return id;
    }

    public String getExpenseName() {
        return expenseName;
    }

    public String getExpenseContact() {
        return expenseContact;
    }

    public ExpenseField getExpenseCategory() {
        return expenseCategory;
    }

    public String getExpenseDate() {
        return expenseDate;
    }

    public String getExpenseTime() {
        return expenseTime;
    }

    public int getExpenseDuration() {
        return expenseDuration;
    }

    // public double getExpensePrice() {
    //     return expensePrice;
    // }

    public void setId(String id) {
        this.id = id;
    }

    public void setExpenseName(String expenseName) {
        this.expenseName = expenseName;
    }

    public void setExpenseContact(String expenseContact) {
        this.expenseContact = expenseContact;
    }

    public void setExpenseCategory(ExpenseField expenseCategory) {
        this.expenseCategory = expenseCategory;
    }

    public void setExpenseDate(String expenseDate) {
        this.expenseDate = expenseDate;
    }

    public void setExpenseTime(String expenseTime) {
        this.expenseTime = expenseTime;
    }

    public void setExpenseDuration(int expenseDuration) {
        this.expenseDuration = expenseDuration;
    }

    // public void setExpensePrice(double expensePrice) {
    //     this.expensePrice = expensePrice;
    // }

}