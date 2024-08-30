public class Task {
    int taskNum;
    String taskName;
    String taskDesc;
    TaskCollection collection;

    public Task(TaskCollection collection, String taskName) {
        this.collection = collection;
        this.taskNum = collection.size()+1;
        this.taskName = taskName;
        this.taskDesc = "";
    }

    public Task(TaskCollection collection, String taskName, String taskDesc) {
        this.collection = collection;
        this.taskNum = collection.size() + 1;
        this.taskName = taskName;
        this.taskDesc = taskDesc;
    }

    @Override
    public String toString() {
        if (taskDesc.isEmpty()) {
            return taskNum + ": " + taskName;
        }else {
            return taskNum + ": " + taskName + " - " + taskDesc;
        }
    }
}
