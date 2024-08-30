import gui.ToDoListDashboard;

public class Main {
    public static void main(String[] args) {
        // Container for all the collections

        TaskCollection test = new TaskCollection("test");
        test.createTask("first task");
        test.createTask("second task", "a second task");
        test.createTask("third task");

        test.printCollection();

        startGUI();
    }
    public static void startGUI(){
        new ToDoListDashboard();
    }
}