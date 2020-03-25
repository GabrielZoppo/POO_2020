package app;

public class App{
    public static void main(String[] args) throws Exception {
        ContaCorrente gabriel = new ContaCorrente(5000);
        gabriel.depositar(1500);
        gabriel.sacar(2000);
        system.out.println(gabriel.saldo);
    }
}
