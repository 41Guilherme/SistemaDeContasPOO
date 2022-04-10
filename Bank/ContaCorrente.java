package Bank;

import utils.Data;
import utils.Pessoa;

public class ContaCorrente extends Conta {

    private double taxa;

    public ContaCorrente(double saldo, Pessoa cliente, Data DataCriacao) {
        super(saldo, cliente, DataCriacao);
        this.taxa = 0.05;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        if (taxa < 1 && taxa > 0 ) {
            this.taxa = taxa;
        }

    }

    @Override
    public boolean fazerDeposito(double value) {
        if (value <= 0) {
            return false;
        }
        this.saldo += (value *(1 + taxa));
        return true;
       
    }

    @Override
    public boolean fazerTransferencia(double value, Conta destino) {
        if (value > saldo || value <= 0){
            return false;
        }

        this.fazerSaque(value*(1 + taxa));
        destino.fazerDeposito(value);
        return true;
    }
    
}
