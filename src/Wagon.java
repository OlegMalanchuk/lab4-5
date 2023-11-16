public class Wagon extends Car{
    private double volumeTrunk;


    public Wagon(String ma, String mo, String co, int y, int pl, double v,double vT){
        super(ma, mo, co, y, pl, v);
        this.volumeTrunk=vT;
    }
    public void sum(){
        sumAll();
        if (volumeTrunk <30){
            price +=600;
        }
        else price+=890;
        System.out.println(price);
    }
}
