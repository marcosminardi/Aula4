public class A {

    protected int x, y;
    private int z;
    public A(int a, int b, int c){
        this.x = a;
        this.y = b;
        this.z = c;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public int getZ(){
        return this.z;
    }

    public void setX(int a){
        this.x = a;
    }

    public void setY(int a){
        this.y = a;
    }

    public void setZ(int a){
        this.z = a;
    }

    public void imprimeValores(){
        System.out.println("X =" + this.x);
        System.out.println("Y =" + this.y);
        System.out.println("Z =" + this.z);
    }
}
