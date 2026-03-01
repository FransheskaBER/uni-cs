package exercises;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(Task newTask) {
        tasks.add(newTask);
    }

    public boolean addTaskAtPosition(int index, Task newTask) {
        try {
            tasks.add(index, newTask);
            return true;          
        } catch (IndexOutOfBoundsException ex) {
            return false;
        }
    }

    public Task removeTask(int index) {
        try {
            Task removed = tasks.remove(index);
            return removed;          
        } catch (IndexOutOfBoundsException ex) {
            return null;
        }
    }

    public boolean moveTask(int fromIndex, int toIndex) {
        try {
            Task removed = tasks.remove(fromIndex);
            tasks.add(toIndex, removed);
            return true;
        } catch (IndexOutOfBoundsException ex) {
            return false;
        }
    }

    public Task getHighestPriorityTask() {
        if (tasks.isEmpty()) {
            return null;
        }

        Task highestPriorityTask = tasks.get(0);;

        for (Task task : tasks) {
            if (task.getPriority() < highestPriorityTask.getPriority()) {
                highestPriorityTask = task;
            }
        }
        return highestPriorityTask;
    }

    public void printAllTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println(i + ": " + tasks.get(i));
            }
        }
    }

    public int getTaskCount() {
        return tasks.size();
    }
}
