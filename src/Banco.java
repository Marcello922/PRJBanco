import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> listacontas = new ArrayList<>();

    public void addContaCorrente(ContaCorrente c){
        listacontas.add(c);
        System.out.println("Adicionado conta corrente nº " + c.nconta);
    }

    public void addContaPoupanca(ContaPoupanca c){
        listacontas.add(c);
        System.out.println("Adicionado conta poupança nº " + c.nconta);
    }

    public List<Conta> getContas(){
        return listacontas;
    }
}
