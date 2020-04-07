package app;

public class ContaCorrente {
    private double saldo;
    private double limite;
    
    public ContaCorrente(){
        this.saldo = 0;
    }

    public ContaCorrente(double valor){
        this.saldo = valor;
    }

    public ContaCorrente(double valor, double limite){
        this.saldo = valor;
        this.limite  = limite;
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
