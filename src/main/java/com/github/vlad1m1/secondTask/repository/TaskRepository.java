package com.github.vlad1m1.secondTask.repository;

import com.github.vlad1m1.secondTask.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByCompleted(boolean completed);

    List<Task> findByCompletedAndDescriptionContainingIgnoreCase(boolean completed, String keyword);
}
