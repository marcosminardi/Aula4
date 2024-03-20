public class Conta {
    long numero;
    double saldo;
    public Conta(long n){
        this.numero = n;
        this.saldo = 0;
    }
    public void depositar(double valor){
        if ( valor > 0)
            this.saldo = this.saldo + valor;
        System.out.println("Depósito efetuado com sucesso!");
    }
    public boolean sacar(double valor){
        if ( valor > 0 &&(saldo - valor) >= 0){
            this.saldo = this.saldo - valor;
            System.out.println("Saque efetuado com sucesso!");
            return true;


        }
        else
            return false;

    }

    public double consultarSaldo(){
        return this.saldo;
    }
    public long obterNumero(){
        return this.numero;

    }
}
