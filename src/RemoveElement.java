import java.util.LinkedList;

public class RemoveElement {
    public static void main(String[] args) {
        LinkedList<String> ll =new LinkedList<>();
        ll.add("Tharuka");
        ll.add("madusanka");
        ll.add("gawesh");
        ll.add("pawani");
        ll.add("modeepa");
        System.out.println("Befor"+ll);
        String str = ll.remove(2);
        System.out.println("RemovedElimnet"+str);
        System.out.println("adter"+ll);



    }

}
