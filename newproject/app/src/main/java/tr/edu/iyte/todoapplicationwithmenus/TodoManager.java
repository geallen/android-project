package tr.edu.iyte.todoapplicationwithmenus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class TodoManager {
    private ArrayList<TodoItem> mItems;

    static private TodoManager mInstance = new TodoManager();

    static public TodoManager getInstance() {
        return mInstance;
    }

    private TodoManager() {
        mItems = new ArrayList<TodoItem>();
    }

    public List<TodoItem> getTodos() {
        return mItems;
    }

    public TodoItem getTodo(int position) { return mItems.get(position); }

    public int nTodos() { return mItems.size(); }

    public void addTodo(String task, TodoItem.Priority priority,Date deadline,TodoItem.Status status) {
        TodoItem t = new TodoItem(task, priority,deadline,status);
        mItems.add(t);
    }
}

