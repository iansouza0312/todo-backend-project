package br.iafesou.todolistproject.service;

import br.iafesou.todolistproject.model.Task;
import br.iafesou.todolistproject.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    private TaskRepository taskRepository;
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> list() {

    }

    public List<Task> create() {

    }

    public List<Task> update() {

    }

    public List<Task> delete() {

    }
}
