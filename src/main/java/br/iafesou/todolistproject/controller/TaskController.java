package br.iafesou.todolistproject.controller;

import br.iafesou.todolistproject.model.Task;
import br.iafesou.todolistproject.service.TaskService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
    private TaskService taskService;
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    List<Task> list() {
        return taskService.list();
    }
    @PostMapping
    List<Task> create(@RequestBody @Valid Task todo) {
        return taskService.create(todo);
    }
    @PutMapping
    List<Task> update(@RequestBody Task todo) {
        return taskService.update(todo);
    }
    @DeleteMapping("{id}")
    List<Task> delete(@PathVariable("id") Long id) {
        return taskService.delete(id);
    }
}
