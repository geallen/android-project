package tr.edu.iyte.todoapplicationwithmenus;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Date;

public class TodoAdapter extends RecyclerView.Adapter<TodoAdapter.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mdeadline;
        public TextView mstatus;

        public ViewHolder(View v) {
            super(v);
            mstatus = (TextView)v.findViewById(R.id.todo_task_status);
            mdeadline = (TextView)v.findViewById(R.id.todo_task_deadline);
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
        String status = TodoManager.getInstance().getTodo(position).getmstatus().toString();
        Date deadline = TodoManager.getInstance().getTodo(position).getmdeadline();
        holder.mstatus.setText(status);
        holder.mdeadline.setText(deadline.toString());
    }

    @Override
    public int getItemCount() {
        return TodoManager.getInstance().nTodos();
    }
}
