import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Collection<String> vogais = new ArrayList<>();

        vogais.add("A");
        vogais.add("E");
        vogais.add("I");
        vogais.add("O");
        vogais.add("U");

        for (String vog : vogais){
            System.out.println("Lista Atual: "+ vog);
        }
    }
}