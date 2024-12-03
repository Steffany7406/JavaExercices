import java.util.ArrayList; //import the ArrayList class

public class UsaArray{
    public static void main(String[] args) { 
        ArrayList<Integer> lista = new ArrayList<>(); //Este é um array dinâmico , ou seja, ele pode crescer ou diminuir de tamanho.
        lista.add(24); //Adiciona um elemento ao array.
        lista.add(32);
        lista.add(12);
        lista.add(5);
        lista.remove(2); //Remove o elemento na posição 2.
        lista.add(8);
        lista.add(18);
        lista.add(4);
        lista.get(4); //Retorna o elemento na posição 4.
        //lista.clone(); //Cria uma cópia do array.

        System.out.println(lista); //Imprime o array.
    }
} 
// Posição do Array
//   0  1  2  3   4   5   6
// [24, 12, 32, 5, 8, 18, 4] Array antes do remove
// [24, 32, 5, 8, 18, 4] Array depois do remove
