import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class main {
    static Banco banco = new Banco();
    public static void main(String[] args) {
        banco.addContaPoupanca(new ContaPoupanca());
        banco.addContaCorrente(new ContaCorrente());
        banco.getContas().get(0).depositar(200);
        banco.getContas().get(1).depositar(200);
        banco.getContas().get(0).transferir(100,1,banco.getContas().get(1));
    }
}