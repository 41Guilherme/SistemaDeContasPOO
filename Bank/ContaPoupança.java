package Bank;

import utils.Data;
import utils.Pessoa;

public class ContaPoupança extends Conta{

    public ContaPoupança(double saldo, Pessoa cliente, Data DataCriacao) {
        super(saldo, cliente, DataCriacao);
    }

    
    @Override
    public boolean fazerDeposito(double value) {
        if (value <= 0) {
            return false;
        }
        this.saldo += value;
        return true;
    }

    @Override
    public boolean fazerTransferencia(double value ,Conta destino) {
        if (value > saldo || value <= 0){
            return false;
        }

        this.fazerSaque(value);
        destino.fazerDeposito(value);
        return true;
    }
    
}
