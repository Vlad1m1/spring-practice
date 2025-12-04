package com.github.vlad1m1.secondTask.dto;

import com.github.vlad1m1.secondTask.entity.Task;

public class TaskDtoService {
    public TaskDTO convertToDto(Task task) {
        TaskDTO dto = new TaskDTO();
        dto.setDescription(task.getDescription());
        dto.setCompleted(task.isCompleted());
        return dto;
    }

    public Task convertToEntity(TaskDTO dto) {
        Task task = new Task();
        task.setDescription(dto.getDescription());
        task.setCompleted(dto.isCompleted());
        return task;
    }

    public void updateEntityFromDto(Task task, TaskDTO dto) {
        task.setDescription(dto.getDescription());
        task.setCompleted(dto.isCompleted());
    }
}
