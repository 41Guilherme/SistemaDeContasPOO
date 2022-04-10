import Bank.*;
import utils.*;

public class Main{

    public static void main(String[] args) {

        Data Hoje = new Data(10, 4, 2022);
        Pessoa cliente1 = new Pessoa("11122233344", "Guilherme");
        Pessoa cliente2 = new Pessoa("55566677788", "Bruno");

        Conta Conta1 = new ContaCorrente(250.25, cliente1, Hoje);
        Conta Conta2 = new ContaPoupança(322.75, cliente2, Hoje);
        
        Conta2.fazerSaque(200.20);
        Conta2.fazerTransferencia(45.79, Conta1);
        Conta1.fazerDeposito(120.20);
        
        System.out.println(Conta1.toString());
        System.out.println(Conta2.toString());
    }

}
