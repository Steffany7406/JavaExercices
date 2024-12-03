/* )Faça um programa que gera e escreve os números ímpares dos números lidos 
entre 100 e 200.*/

public class Impares {
    public static void main(String[] args) {
        int num = 100;
        while (num <= 200) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
            num++;
        }
    }
}