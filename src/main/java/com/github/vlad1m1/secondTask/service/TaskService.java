package com.github.vlad1m1.secondTask.service;

import com.github.vlad1m1.secondTask.entity.Task;

import java.util.List;
import java.util.Optional;

public interface TaskService {
    List<Task> getAllTasks();

    Optional<Task> getTaskById(Long Id);

    Task createTask(Task task);

    Task updateTask(Long Id, Task taskDetails);

    void deleteTask(Long id);

    Task updateTaskStatus(Long id, boolean completed);

    List<Task> getTasksByStatus(boolean completed);
}
