package day37_Inheritance.phoneTask;

public final class Iphone extends Phone{
    public Iphone(String model,String size,double price,String color)
    {
        super("Apple",model,size,price,color);
    }

    public final void faceTime(long phoneNumber)
    {
        System.out.println(brand + "" + model + "  "+ " is having facetime wth phone " + phoneNumber);
    }
    public void faceTime(String email)
    {
        System.out.println(brand + "" + model + "  "+ " is having facetime wth phone " + email);


        System.out.println(Iphone.hasBattery);
        System.out.println(Samsung.hasBattery);
        System.out.println(Nokia.hasBattery);
    }



}
