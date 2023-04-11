package day43_Abstraction.car;

public final class Tesla extends Car{
    public Tesla(String model, String color, int year, double price) {
        super("Tesla", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Say \"start\"");
    }
    public final void autoPilot()
    {
        System.out.println(getBrand() + "" + getBrand() + " has auto pilot feature");
    }

}
