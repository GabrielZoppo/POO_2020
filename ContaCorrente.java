package app;

public class ContaCorrente {
    private double saldo;

    public ContaCorrente(double valor){
        this.saldo = valor;
    }

    public double getSaldo(){
        return saldo;
    }

    public double depositar(double valor){
        
        if(valor <=0){
            return saldo;
        }
        saldo = saldo + valor;
        return saldo;
        }

    public double sacar(double valor){
        if(valor <=0){
            return saldo;
        }
        saldo = saldo - valor;
        return saldo;
        }
    }
