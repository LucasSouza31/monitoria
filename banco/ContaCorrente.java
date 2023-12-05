package banco;

public class ContaCorrente extends Conta {

    @Override
    public double atualiza(double taxa) {
        return super.atualiza(2 * taxa);
    }

    @Override
    public void deposita(double valor) {
        super.deposita(valor - 0.10);
    }

    @Override
    protected double getSaldo() {
        return super.getSaldo();
    }

}
