package banco;

public class Conta {

    private double saldo;

    // Necessário alterar a visibilidade desse método
    protected double getSaldo() {
        return saldo;
    }

    public void deposita(double valor) {
        this.saldo = saldo + valor;
    }

    public void saca(double valor) {
        this.saldo = saldo - valor;
    }

    public double atualiza(double taxa) {
        return this.saldo = saldo * taxa;
    }

}
