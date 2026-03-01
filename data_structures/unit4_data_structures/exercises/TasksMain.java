package exercises;

public class TasksMain {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        manager.addTask(new Task("Buy groceries", 2));
        manager.addTask(new Task("Finish homework", 1));
        manager.addTask(new Task("Call dentist", 3));
        manager.addTask(new Task("Clean room", 5));

        System.out.println("All Tasks:");
        manager.printAllTasks();
        System.out.println("");

        System.out.println("Added Task at position 1");
        manager.addTaskAtPosition(1, new Task("Water plants", 4));
        System.out.println("All Tasks:");
        manager.printAllTasks();
        System.out.println("");

        System.out.println("Moved task from index 2 to index 0");
        manager.moveTask(2, 0);
        System.out.println("Removed task at index 3");
        manager.removeTask(3);
        System.out.println("All Tasks:");
        manager.printAllTasks();
        System.out.println("");

        System.out.println("Highest priority task: " + manager.getHighestPriorityTask());
        System.out.println("Total tasks: " + manager.getTaskCount());
    }
}
