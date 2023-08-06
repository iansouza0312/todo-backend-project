package br.iafesou.todolistproject.controller;

import br.iafesou.todolistproject.model.Task;
import br.iafesou.todolistproject.service.TaskService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
    private TaskService taskService;
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    List<Task> list() {
        return taskService.list();
    }
    List<Task> create(Task todo) {
        return taskService.create(todo);
    }
    List<Task> update(Task todo) {
        return taskService.update(todo);
    }
    List<Task> delete(Long id) {
        return taskService.delete(id);
    }
}
