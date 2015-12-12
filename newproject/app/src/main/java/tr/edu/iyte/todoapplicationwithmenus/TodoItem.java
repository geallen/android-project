package tr.edu.iyte.todoapplicationwithmenus;


import java.util.Date;

public class TodoItem {

    public enum Priority {
        Low,
        Medium,
        High
    }

    public enum Status{
        NotDone,
        Done,
        Late
    }
    private String mTask;
    private Date mdeadline;
    private Priority mPriority;
    private Status mstatus;

    public TodoItem(String mTask, Priority mPriority, Date mdeadline, Status mstatus) {
        this.mTask = mTask;
        this.mdeadline = mdeadline;
        this.mPriority = mPriority;
        this.mstatus = mstatus;
    }

    public String getmTask() {
        return mTask;
    }

    public Date getmdeadline() {
        return mdeadline;
    }

    public Priority getmPriority() {
        return mPriority;
    }

    public Status getmstatus() {
        return mstatus;
    }

    @Override
    public String toString() {
        return "TodoItem{" +
                "mTask='" + mTask + '\'' +
                ", mdeadline=" + mdeadline +
                ", mPriority=" + mPriority +
                ", mstatus=" + mstatus +
                '}';
    }
}