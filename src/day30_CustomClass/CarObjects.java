package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setInfo("Maserati", "Granturismo","Black",2022, 12000);

        Car car2 = new Car();
        car2.setInfo("Lamborghini", "Aventador","Orange",2015, 450000);

        Car car3 = new Car();
        car3.setInfo("Ferrari", "458 Italia","Red",2021, 350000);

        //Car [] cars = {car1,car2,car3};
        ArrayList<Car> carList = new ArrayList<>();
        carList.addAll(Arrays.asList(car1,car2,car3));

        for (Car each:carList)
        {
            System.out.println(each.brand + ": " + each.price);
        }

        System.out.println("--------------------");

        carList.removeIf(p-> p.brand.equals("Ferrari")&& p.year > 2005 && p.year<2022);
        carList.removeIf(p-> p.brand.equals("Lamborghini") && p.year > 2014 && p.year<2020);

        System.out.println(carList);

    }
}
