import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by MacLap on 2/8/16.
 */
public class ToDo {
    public static void main(String[] args) {
        ArrayList<ToDoItem> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Create to-do item");
            System.out.println("2. Toggle to-do item");
            System.out.println("3. List to-do items");

            String option = scanner.nextLine();

            if (option.equals("1")){
                System.out.println("Enter your to-do item:");
                String text = scanner.nextLine();

                ToDoItem item = new ToDoItem(text, false);
                items.add(item);
            }

            else if (option.equals("2")) {
                System.out.println("Enter the number of the item you would like to toggle");
                int itemNum = Integer.valueOf(scanner.nextLine());
                ToDoItem item = items.get(itemNum - 1);
                item.isDone = !item.isDone;
            }

            else if (option.equals("3")) {
                int i = 1;
                for (ToDoItem item : items) {
                    String checkBox = "[ ] ";
                    if (item.isDone){
                            checkBox = "[x] ";
                    }

                    System.out.println(checkBox + i + ". " + item.text);
                    i++;
                }
                System.out.println();
            }

            else {
                System.out.println("Invalid option");
            }
        }
    }
}
