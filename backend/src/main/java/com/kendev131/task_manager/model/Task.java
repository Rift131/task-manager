package com.kendev131.task_manager.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Objects;

//@Entity
//@Table(name = "tasks");
public class Task {
    /*Column annotations are setting up how the database will treat each of these properties.
     * These annotations are specific to the Java Persistence API. They will work with any relational
     * SQL database (PostgreSQL, MySQL, Oracle, SQL Server, etc. For NoSQL, non-relational type
     * databases, different annotations entirely would be needed (MongoDB).  */

    /*CONSTRUCTOR*/
    @Column(nullable = false) // In the database, this field is not allowed to be null
    private String title;
    @Column(columnDefinition = "TEXT") // JPA Annotation telling the database to use type TEXT which allows unlimited length
    private String description;
    private boolean completed;
    @Column(name = "due_date") // JPA annotation that tells the database how to store this field (table column name will be "due_date")
    private LocalDateTime dueDate;
    @Column(name = "created_at")
    private LocalDateTime createdAt;


    /* GETTERS & SETTERS */

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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /* EQUALS & HASH CODE */

    /* Custom "Equals and Hash Code" methods solve the problem of Java comparing objects in memory
    * instead of content. These methods define what makes two objects equal. These two methods are
    * needed when you use entities in HashSet or HashMap, compare entities for equality, using
    * JPA/Hibernate collections and testing for duplicates,
    * */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return completed == task.completed && Objects.equals(title, task.title) && Objects.equals(description, task.description) && Objects.equals(dueDate, task.dueDate) && Objects.equals(createdAt, task.createdAt);
    }

    /* Java has a critical rule: If two objects are equal (according to equals()), they MUST have
    * the same hashCode(). Hash-based collections like "HashSet" adn "HashMap" rely on this rule.
    * */
    @Override
    public int hashCode() {
        return Objects.hash(title, description, completed, dueDate, createdAt);
    }
}
