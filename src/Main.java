public class Main {
    public static void main(String[] args) {

        Car  c = new Car("Mersides","s390","black",1984,4,2.3);
        Jeep jeep = new Jeep("BMW","E34","gray",1989,6,3.6,true);


        SportsCar sportsCar = new SportsCar("BMW","E34","gray",1989,6,3.6,true);
        sportsCar.speed();
        sportsCar.maxSpeed();
        Sedan sedan = new Sedan("BMW","E34","gray",1989,6,3.6,true) {
            @Override
            public void speed() {

            }
        };
        sedan.maxSpeed();
        sedan.speed();






































    }
}