package day38_Inheritance.carTask;

public class ParkingLot {
    public static void main(String[] args) {
        Toyota toyota = new Toyota("Camry",2020,20000,"Gray",123456);
        Tesla tesla = new Tesla("model s",2022,94990,"Black",46873);
        BMW bmw = new BMW("X6",2020,50990,"White",46873);



        bmw.start();
    }
}
