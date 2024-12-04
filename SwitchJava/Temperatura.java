/* Escreva um programa que, com base em uma temperatura em graus celsius, a converta e exiba em Kelvin (K), 
Réaumur (Re), Rankine (Ra) e Fahrenheit (F), seguindo as fórmulas: 
F = C * 1.8 + 32; K = C + 273.15; Re = C * 0.8; Ra = C * 1.8 + 32 + 459.67 */
import java.util.Scanner;

public class Temperatura
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double C, K, F, Re, Ra;
        
        System.out.println("Vamos converter as temperaturas?");
        System.out.println("Lembre-se: Digite F para Fahrenheit, K para Kelvin, Re para Rankine ou Ra para Réaumur");
        System.out.println("Digite a em qual fórmula deseja saber a temperatura: ");
        String formula = input.nextLine();
        
        C = 2.43;
        F = C * 1.8 + 32;
        K = C + 273.15;
        Re = C * 0.8;
        Ra = C * 1.8 + 32 + 459.67;
        
         switch(formula){
            case "F":
                System.out.println("A temperatura em Fahrenheit é: " + F);
                break;
            case "K":    
                System.out.println("A temperatura em Kelvin é: "+ K);
                break;
            case "Re":    
                System.out.println("A temperatura em Rankine é: "+ Re);
                break;
            case "Ra":    
                System.out.println("A temperatura em Reaumur é: "+ Ra);
                break;
            default:
                System.out.println("Por favor, digite uma fórmula válida.");
                break;
         }
    }
}
