public interface IConta {
    void sacar(double valor);

    void transferir(double valor, int agencia, Conta conta);

    void depositar(double valor);
}
