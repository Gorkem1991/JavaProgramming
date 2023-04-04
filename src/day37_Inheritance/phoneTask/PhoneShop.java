package day37_Inheritance.phoneTask;

public class PhoneShop {
    public static void main(String[] args) {

        Iphone iphone = new Iphone("IphoneX","6.7 inches",1200,"Black");

        Samsung samsung = new Samsung("Galaxy S19","6 inches",900,"White");

        Nokia nokia = new Nokia("Bick","4 inches",50,"Gray");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);


        iphone.call(911);
        iphone.text(123456789);
        iphone.faceTime(789456123);
        iphone.faceTime("yahoo@gmail.com");

        System.out.println("-------------------------");

        samsung.call(911);
        samsung.text(123456789);
        samsung.freeze();


        System.out.println("-----------------");
        nokia.call(911);
        nokia.text(123456789);
        nokia.selfDefense();

    }
}
