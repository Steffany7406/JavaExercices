// Lista de Array completa com tratamento de erros do usuário.

import java.util.Scanner;
import java.util.ArrayList;

public class ListaAB {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        ArrayList<Double> A = new ArrayList<>();
        ArrayList<Double> B = new ArrayList<>();
        
            System.out.println("Bem-vindo ao Loop Game!");
        
         while(true) {
            System.out.println(" Digite Loop para continuar ou 'sair' para encerrar: ");
            String input = entrada.nextLine();
            
            if (input.equalsIgnoreCase("sair")){
                break; // sai do loop se digitar sair 
            }
        
            for (int i = 0; i < 10; i++) {  // Corrigido para iterar de 0 a 9
                System.out.println("Digite o número que deseja armazenar: ");
            
            if (entrada.hasNextDouble()) {
               double num = entrada.nextDouble(); 
            
            if (num > 0) {
                if (!A.contains(num)){
                    A.add(num);
                    System.out.println("O número foi adicionado em A");
                } else{
                    System.out.println("O número já foi adicionado em A. Tente outro.");
                }
            } else if (num < 0) {
                if (!B.contains(num)){
                    B.add(num);
                    System.out.println("O número foi adicionado em B");
                } else {
                    System.out.println("O número já foi adicionado em B. Tente outro.");
                }
            } else {
                System.out.println("Zero não é armazenado em nenhuma das listas.");
            }
            } else {
                System.out.println("Entrada invalida. Digite apenas números.");
                entrada.next();
            }
            }
        }
        
        entrada.close();
        
        System.out.println("Lista A: " + A);
        System.out.println("Lista B: " + B);
    }
}
