package tr.edu.iyte.todoapplicationwithmenus;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by gamze on 06.12.2015.
 */
public class ListActivity extends AppCompatActivity {
    private ArrayList<String> todoItems = new ArrayList<String>();
    private ArrayAdapter<String> todoAdapter;

    private static final String ARG_ACCEPT_EMPTY = "ARG_ACCEPT_EMPTY";

    private boolean mAcceptEmpty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_activity);

        todoAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, todoItems);



        TodoListFragment frag = new TodoListFragment();
        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.activity_layout, frag, "Fragmentss");
        transaction.commit();

        frag.setListAdapter(todoAdapter);


    }

    private void add_new_todo(String task,TodoItem.Priority priority,Date deadline,TodoItem.Status status) {

        TodoManager.getInstance().addTodo(task, priority, deadline, status);
        todoAdapter.notifyDataSetChanged();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater mi = getMenuInflater();
        mi.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add_todo_action:
             //   NewTodoDialogFragment fragment = new NewTodoDialogFragment();
             //   fragment.show(getSupportFragmentManager(), null);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }




   }
