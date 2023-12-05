package banco;

public class AtualizadorDeContas {
    private double saldoTotal = 0;
    private double selic;

    public AtualizadorDeContas(double selic) {
        this.selic = selic;
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(double saldoTotal) {
        this.saldoTotal = saldoTotal;
    }

    
    public void roda(Conta conta) {
        double saldoAtual = conta.getSaldo();
        System.out.println(saldoAtual);// saldo antes da atualização
        double atualizacao = saldoAtual * selic;// atualizar
        System.out.println(atualizacao);
        saldoTotal = atualizacao + saldoAtual;
        System.out.println(saldoTotal);
    }

}
