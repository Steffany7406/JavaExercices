public class CaminhaoEncapsulamento {
    private String modelo;
    private double capacidadeCarga;

    public CaminhaoEncapsulamento(String modelo, double capacidadeCarga) {
        this.modelo = modelo;
        this.capacidadeCarga = capacidadeCarga;
    }

    public String getModelo() {
        return modelo;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        if (capacidadeCarga < 0) {
            throw new IllegalArgumentException("A Capacidade de Carga não pode ser negativa.");
        }
        this.capacidadeCarga = capacidadeCarga;
    }

    public static void main(String[] args){

        CaminhaoEncapsulamento caminhao = new CaminhaoEncapsulamento("Volks Constellation 25.460",  74.0);

        System.out.println("Modelo: "+caminhao.getModelo());
        System.out.println("Capacidade de Carga: "+caminhao.getCapacidadeCarga()+" toneladas");

        caminhao.setModelo("Constelation 4805");
        caminhao.setCapacidadeCarga(30.3); 
    }
}