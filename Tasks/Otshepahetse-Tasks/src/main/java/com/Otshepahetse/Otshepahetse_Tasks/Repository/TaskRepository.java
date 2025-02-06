package com.Otshepahetse.Otshepahetse_Tasks.Repository;

import com.Otshepahetse.Otshepahetse_Tasks.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
