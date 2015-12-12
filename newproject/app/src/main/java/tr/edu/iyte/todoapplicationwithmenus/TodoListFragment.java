package tr.edu.iyte.todoapplicationwithmenus;

import android.app.Activity;
import android.app.Fragment;
import android.app.ListFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by gamze on 06.12.2015.
 */
public class TodoListFragment extends ListFragment {
/*  public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextView;
        public ViewHolder(View v) {
            super(v);
            mTextView = (TextView)v.findViewById(R.id.todo_task);
        }
    }

    @Override
    public TodoAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                               .inflate(R.layout.todo_list_item, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        String todoText = TodoManager.getInstance().getTodo(position).getTask();
        holder.mTextView.setText(todoText);
    }

    @Override
    public int getItemCount() {
        return TodoManager.getInstance().nTodos();
    }*/
    private RecyclerView recyclerView;
   // private static final String ARG_ACCEPT_EMPTY = "ARG_ACCEPT_EMPTY";


    private TodoAdapter adapter;
  /*  public static TodoListFragment newInstance(boolean acceptEmpty) {
        TodoListFragment fragment = new TodoListFragment();
        Bundle args = new Bundle();
        args.putBoolean(ARG_ACCEPT_EMPTY, acceptEmpty);
        fragment.setArguments(args);
        return fragment;
    }*/

    public TodoListFragment() {
        // Required empty public constructor
    }



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.todolistfragment,container,false);

        recyclerView = (RecyclerView) rootView.findViewById(R.id.todo_list);
        adapter = new TodoAdapter();
       // RecyclerView.LayoutManager lm = new LinearLayoutManager(getActivity());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));


//        final Button addButton = (Button)rootView.findViewById(R.id.add_todo_button);
//        final EditText editText = (EditText)rootView.findViewById(R.id.todo_edit_text);
        return rootView;
    }








}
