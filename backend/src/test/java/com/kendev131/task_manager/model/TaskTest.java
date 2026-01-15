package com.kendev131.task_manager.model;

import org.junit.jupiter.api.Test;
import org.springframework.scheduling.config.Task;

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
}
