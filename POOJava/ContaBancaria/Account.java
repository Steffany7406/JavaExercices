interface ContaBancarian {
    void depositar(double valor);
    void sacar(double valor);
    double consultarSaldo();
}

class AContaCorrente implements ContaBancarian {
    public String titular;
    private double saldo;
    
    public AContaCorrente(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }
    
    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depositado: R$"+ valor +". Saldo atual: R$"+ saldo);
        } else{
            System.out.println("O valor depositado deve ser positivo.");
        }
    }
    
    @Override
    public void sacar(double valor){
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$"+ valor +". Saldo atual: R$"+ saldo);
        } else {
            System.out.println("Saque inválido. Verifique o valor!");
        }
    }
    
    @Override
    public double consultarSaldo() {
        return saldo;
    }
    
    public String getTitular() {
        return titular;
    }
}

public class Account {
    public static void main(String[] args) {
        ContaBancarian conta = new AContaCorrente("Ivan Kromberg");
        
        conta.depositar(1000);
        conta.sacar(298);
        System.out.println("Saldo atual: R$"+ conta.consultarSaldo());
        conta.depositar(-50);
    }
}