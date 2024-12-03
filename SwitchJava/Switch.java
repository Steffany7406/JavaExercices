/*O swith serve para alternar entre dois valores, em vez de usar um if/else. 
 * Muito util para casos especificos , como por exemplo, alternar entre dois valores de um objeto. */

import java.util.Scanner;

public class Switch {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Digite o mês do seu nascimento: ");
        String mes = scanner.nextLine();

        scanner.close();
        switch (mes) { // Usando switch para verificar o mês
            case "Janeiro":
                System.out.println("De 01 á 21 seu signo é Capricórnio.");
                break;
            case "Fevereiro":
                System.out.println("De 22 á 28 seu signo é Aquário.");
                break;
            case "Março":
                System.out.println("De 01 á 20 seu signo é Peixes.");
                break;
            case "Abril":
                System.out.println("De 21 á 30 seu signo é Áries.");
                break;
            case "Maio":
                System.out.println("De 01 á 20 seu signo é Touro.");
                break;
            case "Junho":
                System.out.println("De 21 á 30 seu signo é Gêmeos.");
                break;
            case "Julho":
                System.out.println("De 01 á 22 seu signo é Câncer.");
                break;
            case "Agosto":
                System.out.println("De 23 á 31 seu signo é Leão.");
                break;
            case "Setembro":
                System.out.println("De 01 á 22 seu signo é Virgem.");
                break;
            case "Outubro":
                System.out.println("De 23 á 31 seu signo é Libra.");
                break;
            case "Novembro":
                System.out.println("De 01 á 21 seu signo é Escorpião.");
                break;
            case "Dezembro":
                System.out.println("De 22 á 31 seu signo é Sagitário.");
            default:
                throw new AssertionError("Digite um mês válido!");
        }
        
    }
}
