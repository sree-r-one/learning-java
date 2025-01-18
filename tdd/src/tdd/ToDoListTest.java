package tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;

class ToDoListTest {
    private ToDoList toDoList;

    @BeforeEach
    public void setUp() {
        toDoList = new ToDoList();
    }

    @Test
    public void testAddTask() {
        Task task = new Task("Test Task");
        toDoList.addTask(task);
        assertEquals(task, toDoList.getTask("Test Task"), "Task should be added to the list");
    }

    @Test
    public void testCompleteTask() {
        Task task = new Task("Complete Me");
        toDoList.addTask(task);
        toDoList.completeTask("Complete Me");
        assertTrue(toDoList.getStatus("Complete Me"), "Task should be marked as complete");
    }

    @Test
    public void testGetStatus() {
        Task task = new Task("Check Status");
        toDoList.addTask(task);
        assertFalse(toDoList.getStatus("Check Status"), "Task should initially be incomplete");
        toDoList.completeTask("Check Status");
        assertTrue(toDoList.getStatus("Check Status"), "Task should be marked as complete");
    }

    @Test
    public void testRemoveTask() {
        Task task = new Task("Remove Me");
        toDoList.addTask(task);
        Task removedTask = toDoList.removeTask("Remove Me");
        assertEquals(task, removedTask, "Removed task should be the same as the added task");
        assertNull(toDoList.getTask("Remove Me"), "Task should no longer exist in the list");
    }

    @Test
    public void testGetCompletedTasks() {
        Task task1 = new Task("Task 1");
        Task task2 = new Task("Task 2");
        toDoList.addTask(task1);
        toDoList.addTask(task2);
        toDoList.completeTask("Task 2");
        Collection<Task> completedTasks = toDoList.getCompletedTasks();
        assertEquals(1, completedTasks.size(), "Only one task should be completed");
        assertTrue(completedTasks.contains(task2), "Completed tasks should include Task 2");
        assertFalse(completedTasks.contains(task1), "Completed tasks should not include Task 1");
    }
}
