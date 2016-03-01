/**
 * Created by MacLap on 2/8/16.
 */
public class ToDoItem {
    public String text;
    public boolean isDone;
    public int id;

    public ToDoItem(int id, String text, boolean isDone) {
        this.text = text;
        this.isDone = isDone;
        this.id = id;
    }
}
