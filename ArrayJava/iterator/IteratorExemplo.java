import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExemplo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Maçã");
        list.add("Banana");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}