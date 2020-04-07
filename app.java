package app;
import java.util.ArrayList;
public class App{
    public static void main(String[] args){
        ContaCorrente[] Contas;
        Contas = new ContaCorrente[10];
        ContaCorrente Gabriel = new ContaCorrente();
        
        Gabriel.depositar(15000);
        Gabriel.sacar(2000);
        System.out.println(Gabriel.saldo);
    }
}
