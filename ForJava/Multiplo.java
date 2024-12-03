/* 
Faça um programa que conte de 1 até 100 e a cada múltiplo de 10 exiba uma 
mensagem: "Múltiplo de 10”
 */


public class Multiplo {
    public static void main(String[] args) {
        
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " Multiplo de 10");
            } else {
            	System.out.println(i);
            }
        }
    }
}

/* A compilation of functional exercises in Java.

Status = Always in Progress
See More:

Biblio Java = (https://github.com/Steffany7406/BiblioJAVA)
Java Projects = (https://github.com/Steffany7406/JavaProjects) */