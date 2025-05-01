package com.taskmanager.backend.repository;

import com.taskmanager.backend.model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TaskRepository extends MongoRepository<Task, String> {
    // Basic CRUD ready
}
