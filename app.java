package Contas;
import java.util.ArrayList;
public class App{
    public static void main(String[] args){

        ContaCorrente gabriel = new ContaCorrente(2000);
        ArrayList<ContaCorrente> contas = new ArrayList<ContaCorrente>();
        contas.add(gabriel);


        gabriel.depositar(15000);
        gabriel.sacar(2000);
        System.out.println(gabriel.getSaldo);
    }
}
