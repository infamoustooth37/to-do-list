import java.util.ArrayList;

public class TaskCollection extends ArrayList<Task> {
    String collectionName;

    public TaskCollection(String collectionName) {
        this.collectionName = collectionName;
    }
    public String getCollectionName() {
        return collectionName;
    }
    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }
    public void printCollection(){
        for(Task task : this){
            System.out.println(task);
        }
    }

    public void createTask(String name){
        Task task = new Task(this, name);
        add(task);
    }
    public void createTask(String name, String description){
        Task task = new Task(this, name,description);
        add(task);
    }


}
