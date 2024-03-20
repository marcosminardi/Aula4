import java.sql.SQLOutput;

public class testaConta {
    public static void main(String[] args) {
        ContaCorrente minhaconta = new ContaCorrente(1234, 1000 );
        ContaCorrente contaLuiza = new ContaCorrente(2234, 7200);


        minhaconta.alterarLimite(1500);
        System.out.println("Conta: " + minhaconta.numero);
        System.out.println("Limite: " + minhaconta.consultarLimite());
        System.out.println("Saldo Total: " + minhaconta.consultarSaldo());
        System.out.println("");

        contaLuiza.alterarLimite(12000);
        System.out.println("Conta: " + contaLuiza.numero);
        System.out.println("Limite: " + contaLuiza.consultarLimite());
        System.out.println("Saldo total: " + contaLuiza.consultarSaldoTotal());

        

    }


}
