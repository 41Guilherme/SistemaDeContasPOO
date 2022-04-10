package Bank;
import utils.Pessoa;
import utils.Data;

public abstract class Conta {

    protected double saldo;
    private Pessoa cliente;
    private Data DataCriacao;

    public Conta(double saldo, Pessoa cliente, Data DataCriacao){
        this.saldo = saldo;
        this.cliente = cliente;
        this.DataCriacao = DataCriacao;
    }

    public abstract boolean fazerDeposito(double value);

    public abstract boolean fazerTransferencia(double value, Conta destino);

    public boolean fazerSaque(double value) {
        if (value > saldo || value <= 0){
            return false;
        }
        this.saldo -= value;
        return true;
    }

    public double checarSaldo(){
        return this.saldo;
    }

    public String getData(){
        return DataCriacao.getData();
    }

    public Pessoa getPessoa(){
        return this.cliente;
    }

    @Override
    public String toString() {
        return "Conta [DataCriacao=" + DataCriacao.getData() + ", cliente=" + cliente.getName() + ", saldo=" + saldo + "]";
    }

    
}
