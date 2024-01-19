import java.util.LinkedList;

public class ChangeElement {
    public static void main(String[] args) {
        LinkedList<String> ll =new LinkedList<>();
        ll.add("Tharuka");
        ll.add("madusanka");
        ll.add("gawesh");
        ll.add("pawani");
        ll.add("modeepa");
        System.out.println("Befor"+ll);
        ll.set(4,"sachinth");
        System.out.println("After"+ll);


    }

}
