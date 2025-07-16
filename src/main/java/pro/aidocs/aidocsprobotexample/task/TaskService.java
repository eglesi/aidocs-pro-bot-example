package pro.aidocs.aidocsprobotexample.task;

import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class TaskService {

    private final Map<Long, Task> taskStorage = new HashMap<>();
    private final AtomicLong idCounter = new AtomicLong();

    public List<Task> getAllTasks() {
        return new ArrayList<>(taskStorage.values());
    }

    public Task getTaskById(Long id) {
        return taskStorage.get(id);
    }

    public Task addTask(Task task) {
        long id = idCounter.incrementAndGet();
        task.setId(id);
        taskStorage.put(id, task);
        return task;
    }

    public boolean deleteTask(Long id) {
        return taskStorage.remove(id) != null;
    }

    public Task updateTask(Long id, Task updatedTask) {
        Task existing = taskStorage.get(id);
        if (existing == null) return null;

        existing.setTitle(updatedTask.getTitle());
        existing.setDescription(updatedTask.getDescription());
        existing.setDone(updatedTask.isDone());
        return existing;
    }
}
