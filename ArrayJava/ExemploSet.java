import java.util.HashSet;
import java.util.Set;

public class ExemploSet {
    public static void main(String[] args) {
        Set<String> conjunto = new HashSet<>();
        conjunto.add("João");
        conjunto.add("Maria");
        conjunto.add("João"); // não adiciona, pois já existe
        conjunto.add("Pedro");

        System.out.println("Nomes: "+ conjunto); 
    }
}