import java.sql.SQLOutput;

public class B extends A{
    private int k;

    public B(int a, int b, int c, int d){
        super(a, b ,c);
        this.k = d;
    }
    public void imprimeValores(){
        System.out.println("X = " + this.x);
        System.out.println("Y = " + this.y);
        System.out.println("K = " + this.k);
        System.out.println("Z = NÃO VISÍVEL");
        System.out.println("Z = " + getZ());

    }
}
