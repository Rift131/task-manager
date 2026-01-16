package com.kendev131.task_manager.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;




class TaskTest {

    @Test
    void taskShouldHaveRequiredFields() {
        // Arrange and Act
        Task task = new Task();
        task.setTitle("Buy groceries");
        task.setDescription("Milk, eggs, bread");
        task.setCompleted(false);

        // Assert
        assertEquals("Buy groceries", task.getTitle());
        assertEquals("Milk, eggs, bread", task.getDescription());
        assertFalse(task.isCompleted());
    }

    @Test
    void testShouldHaveDueDate() {
        // Arrange
        Task task = new Task();
        LocalDateTime dueDate = LocalDateTime.of(2026, 1, 20, 14, 30);

        // Act
        task.setDueDate(dueDate);

        // Assert
        assertEquals(dueDate, task.getDueDate);
    }
}
