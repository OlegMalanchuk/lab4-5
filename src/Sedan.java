
public class Sedan extends Car {
    private boolean navigation;

    public Sedan(String ma, String mo, String co, int y, int pl, double v,boolean n){
        super(ma, mo, co, y, pl, v);
        this.navigation=n;
    }
    public void sum(){
        sumAll();
        if (navigation = true){price+=2900;}
        else price+=0;
        System.out.println(price);
    }



}
