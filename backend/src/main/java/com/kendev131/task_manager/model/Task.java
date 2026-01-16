package com.kendev131.task_manager.model;

import jakarta.persistence.Column;

import java.time.LocalDateTime;

//@Entity
//@Table(name = "tasks");
public class Task {

    private String title;
    private String description;
    private boolean completed;
    @Column(name = "due_date")
    private LocalDateTime dueDate;


    // Getters & Setters

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }


}
