//package Java08;

class Retangulo {
    public double  altura;
    public double largura;

    public Retangulo(int altura, int largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public double getArea(){
        return altura * largura;
    }
}

public class Calculando {
    public static void main(String[] args) {
        Retangulo ret = new Retangulo(154, 207);
        System.out.println("\nA área do Retângulo é "+ ret.getArea());
    }
}