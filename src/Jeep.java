public class Jeep extends Car{
    private boolean ABS;
    public Jeep(String ma, String mo, String co, int y, int pl,double v,boolean g){
        super(ma, mo, co, y, pl, v);
        this.ABS=g;
    }
    public void sum(){
        sumAll();
        if (ABS = true){
            price+=2600;
        }else price+=1040;
        System.out.println(price);
    }

    /////////////////////////////////////////////////////////////5///////////////////////////////////////////////
    @Override
    public void sound(){
        System.out.println("Врууууууммммм");// перевизначення методу sound
    }

    public void sound(int k){//перевантаження метода sound
        for (int i = 0;i<k;i++){

            sound();
        }
    }


}
