package app;

import java.util.ArrayList;
public class App{
    public static void main(String[] args){
        ArrayList<ContaCorrente> contas = new ArrayList<ContaCorrente>();
        contas.add(gabriel);

        gabriel.depositar(15000);
        gabriel.sacar(2000);
        System.out.println(contas.getsaldo(gabriel));
    }
}
