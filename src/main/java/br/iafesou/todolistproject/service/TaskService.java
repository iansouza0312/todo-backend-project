package br.iafesou.todolistproject.service;

import br.iafesou.todolistproject.model.Task;
import br.iafesou.todolistproject.repository.TaskRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    private TaskRepository taskRepository;
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> list() {
        Sort orderedTasks = Sort.by("priority").descending().and(Sort.by("name").ascending());
        return taskRepository.findAll(orderedTasks);
    }

    public List<Task> create(Task todo) {
        taskRepository.save(todo);
        return list();
    }

    public List<Task> update(Task todo) {
        taskRepository.save(todo);
        return list();
    }

    public List<Task> delete(Long id) {
        taskRepository.deleteById(id);
        return list();
    }
}
