package banco;

public class ContaPoupanca extends Conta {

    @Override
    public double atualiza(double taxa) {
        return super.atualiza(taxa * 3);
    }

    @Override
    protected double getSaldo() {
        return super.getSaldo();
    }

}
