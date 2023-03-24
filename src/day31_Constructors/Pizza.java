package day31_Constructors;

public class Pizza {
    public char size;
    public int numberOfCheeseTopping;
    public int numberOfPepperoniTopping;

    public Pizza(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }
    public double calcCost()
    {
        double totalCost=0;
        if(size =='S')
        {
            totalCost = 10 + (numberOfCheeseTopping*2)+ (numberOfPepperoniTopping*2);
        }
        else if(size =='M')
        {
            totalCost = 12 + (numberOfCheeseTopping*2)+ (numberOfPepperoniTopping*2);
        }
        else
        {
            totalCost = 14 + (numberOfCheeseTopping*2)+ (numberOfPepperoniTopping*2);
        }
        return totalCost;
    }


    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping+
                ", total price =$" + calcCost()+
                '}';
    }
}
