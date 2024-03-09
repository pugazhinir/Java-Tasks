import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Task {
    private String title;
    private String description;
    private LocalDate dueDate;
    private String category;
    private boolean completed;

    public Task(String title, String description, LocalDate dueDate, String category) {
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.category = category;
        this.completed = false;
    }

    // Getters and setters

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}

public class TaskManager {
    private List<Task> tasks;
    private Scanner scanner;

    public TaskManager() {
        tasks = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void markTaskAsCompleted(int index) {
        Task task = tasks.get(index);
        task.setCompleted(true);
        System.out.println("Task '" + task.getTitle() + "' marked as completed.");
    }

    public void removeTask(int index) {
        Task removedTask = tasks.remove(index);
        System.out.println("Task '" + removedTask.getTitle() + "' removed successfully.");
    }

    public void displayTasks() {
        System.out.println("Tasks:");
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            System.out.println((i + 1) + ". " + task.getTitle() + " - " + (task.isCompleted() ? "Completed" : "Pending"));
        }
    }

    public void displayTasksByCategory(String category) {
        List<Task> filteredTasks = tasks.stream()
                .filter(task -> task.getCategory().equalsIgnoreCase(category))
                .collect(Collectors.toList());
        System.out.println("Tasks in category '" + category + "':");
        for (Task task : filteredTasks) {
            System.out.println("- " + task.getTitle());
        }
    }

    public void displayTasksByStatus(boolean completed) {
        List<Task> filteredTasks = tasks.stream()
                .filter(task -> task.isCompleted() == completed)
                .collect(Collectors.toList());
        System.out.println((completed ? "Completed" : "Pending") + " Tasks:");
        for (Task task : filteredTasks) {
            System.out.println("- " + task.getTitle());
        }
    }

    public void displayTaskDetails(int index) {
        Task task = tasks.get(index);
        System.out.println("Task Details:");
        System.out.println("Title: " + task.getTitle());
        System.out.println("Description: " + task.getDescription());
        System.out.println("Due Date: " + task.getDueDate());
        System.out.println("Category: " + task.getCategory());
        System.out.println("Status: " + (task.isCompleted() ? "Completed" : "Pending"));
    }

    public void run() {
        boolean running = true;
        while (running) {
            System.out.println("\nTask Management Application");
            System.out.println("1. Add Task");
            System.out.println("2. Mark Task as Completed");
            System.out.println("3. Remove Task");
            System.out.println("4. Display Tasks");
            System.out.println("5. Display Tasks by Category");
            System.out.println("6. Display Tasks by Status");
            System.out.println("7. View Task Details");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            
            switch (choice) {
                case 1:
    System.out.print("Enter task title: ");
    String title = scanner.nextLine();
    System.out.print("Enter task description: ");
    String description = scanner.nextLine();
    System.out.print("Enter due date (YYYY-MM-DD): ");
    String dueDateStr = scanner.nextLine().trim(); // Trim the input string
    try {
        LocalDate dueDate = LocalDate.parse(dueDateStr);
        System.out.print("Enter category: ");
        String category = scanner.nextLine();
        Task task = new Task(title, description, dueDate, category);
        addTask(task);
        System.out.println("Task added successfully.");
    } catch (DateTimeParseException e) {
        System.out.println("Invalid date format. Please enter the date in YYYY-MM-DD format.");
    }
    break;
             case 2:
                    displayTasks();
                    System.out.print("Enter task number to mark as completed: ");
                    int taskNumber = scanner.nextInt();
                    if (taskNumber >= 1 && taskNumber <= tasks.size()) {
                        markTaskAsCompleted(taskNumber - 1);
                    } else {
                        System.out.println("Invalid task number.");
                    }
                    break;
                case 3:
                    displayTasks();
                    System.out.print("Enter task number to remove: ");
                    int removeIndex = scanner.nextInt();
                    if (removeIndex >= 1 && removeIndex <= tasks.size()) {
                        removeTask(removeIndex - 1);
                    } else {
                        System.out.println("Invalid task number.");
                    }
                    break;
                case 4:
                    displayTasks();
                    break;
                case 5:
                    System.out.print("Enter category to display tasks: ");
                    String cat = scanner.nextLine();
                    displayTasksByCategory(cat);
                    break;
                case 6:
                    System.out.print("Enter status (completed or pending): ");
                    String statusInput = scanner.nextLine().toLowerCase();
                    boolean status = statusInput.equals("completed");
                    displayTasksByStatus(status);
                    break;
                case 7:
                    displayTasks();
                    System.out.print("Enter task number to view details: ");
                    int taskIndex = scanner.nextInt();
                    if (taskIndex >= 1 && taskIndex <= tasks.size()) {
                        displayTaskDetails(taskIndex - 1);
                    } else {
                        System.out.println("Invalid task number.");
                    }
                    break;
                case 8:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
        System.out.println("Task Management Application closed.");
    }

    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        taskManager.run();
    }
}
