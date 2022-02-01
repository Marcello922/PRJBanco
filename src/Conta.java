import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public abstract class Conta implements IConta{

    private static int CONTADORAGENCIA = 1;
    protected static int CONTADORCONTA = 1;

    protected int nconta;
    protected double saldo;

    public Conta() {
        saldo = 0;

        this.nconta = CONTADORCONTA++;
    }

    public void sacar(double valor) {
        if(saldo >= valor){
            saldo -= valor;
            System.out.println("Saque de: "+" R$ \n Saldo restante: " + saldo);
        } else{
            System.out.println("Saldo insuficiente para completar o saque!");
        }
    }

    public void transferir(double valor, int agencia, Conta conta) {
        if(this.saldo >= valor){
            saldo -= valor;
            conta.saldo += valor;
            System.out.println("Transferência realizada em " + LocalDateTime.now() + " de valor: " + valor + "R$ da conta "
                    + this.nconta + "para " + conta.nconta);
        } else{
            System.out.println("Saldo insuficiente para completar a transferência!");
        }
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depósito realizado na conta: " + nconta + " no valor de " + valor + "R$");
    }
}
