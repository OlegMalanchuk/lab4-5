public class Car {

    protected String marc;
    protected String model;
    protected int year;
    protected String colour;
    protected double price;
    protected double volume;
    protected int places;

    public Car(String ma, String mo, String co, int y, int pl, double v) {
        this.colour = co;
        this.marc = ma;
        this.model = mo;
        this.year = y;
        this.volume = v;
        this.places = pl;
    }

    protected double sumAll(){
        if((marc == "BMW")||(marc=="Mersides")){
            price+=2000;
        }else price+=0;

        if (year>2000){
            price+=3700;
        }else price+=1400;

        if (colour =="black")price+=500;
        else price+=300;

        if (volume < 2.0){price+=1000;}
        else if ((volume >2.0)&&(volume<3.5)){
            price+=2000;
        }
        else price+=3500;

        if (places == 4){price+=600;
        }
        else if ((places>4)||(price<9)){
            price+=1200;
        }
        else {price+=-999999999;
        System.out.println("занадто багато мість");}
        return price;
    }


}