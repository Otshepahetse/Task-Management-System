package com.Otshepahetse.Otshepahetse_Tasks.Service;


import com.Otshepahetse.Otshepahetse_Tasks.Model.Task;
import com.Otshepahetse.Otshepahetse_Tasks.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public Task createTask(Task task){
        return taskRepository.save(task);
    }

    public List<Task>getAllTasks(){
       return taskRepository.findAll();
    }

    public Task getTaskById(Long id){
        return taskRepository.findById(id).orElseThrow(()->new RuntimeException("Not Found!"));
    }

    public Task updateTask(Long id,Task updatedTask){
        Task existingTask = getTaskById(id);
        existingTask.setTaskLabel(updatedTask.getTaskLabel());
        existingTask.setTaskDiscription(updatedTask.getTaskDiscription());
        existingTask.setStatus(updatedTask.getStatus());
        existingTask.setDueDate(updatedTask.getDueDate());

        return taskRepository.save(existingTask);
    }

    public void deleteTask(Long id){
        taskRepository.deleteById(id);
    }

}
