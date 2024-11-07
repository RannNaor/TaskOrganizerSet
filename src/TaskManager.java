import java.util.ArrayList;

public class TaskManager {
    private ArrayList<Catagory> categories;

    public TaskManager() {
        categories = new ArrayList<>();
    }

    public void addCategory(Catagory category) {
        categories.add(category);
    }

    public void displayAllCategories() {
        for (Catagory category : categories) {
            category.displayAllTasks();
        }
    }
}
