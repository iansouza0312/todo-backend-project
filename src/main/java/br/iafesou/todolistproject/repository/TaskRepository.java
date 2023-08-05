package br.iafesou.todolistproject.repository;

import br.iafesou.todolistproject.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long>{
}
