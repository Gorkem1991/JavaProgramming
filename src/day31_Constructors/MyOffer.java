package day31_Constructors;

import day30_CustomClass.Car;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffer {
    public static void main(String[] args) {
        Offer offer1 = new Offer();
        Offer offer2 = new Offer();
        Offer offer3 = new Offer();
        Offer offer4 = new Offer();
        Offer offer5 = new Offer();
        Offer offer6 = new Offer();
        Offer offer7 = new Offer();


        offer1.setInfo("Lisbon", "Teleperformance","CSR",12000,true,true,true,true);
        offer2.setInfo("Nicosia", "EUC","SDET",85000,true,false,false,false);
        offer3.setInfo("London", "Tesco","Clerk",11000,false,false,false,true);
        offer4.setInfo("Poto", "TP2","Supervisor",13000,true,false,true,false);
        offer5.setInfo("Madrid", "Microsoft","Developer",35000,false,false,false,false);
        offer6.setInfo("Rome", "Google","SDET",450000,false,false,true,true);
        offer7.setInfo("Athens", "Apple","HR",110000,true,true,false,true);


        Offer[] list = {offer1,offer2,offer3,offer4,offer5,offer6,offer7};

        ArrayList<Offer> offerList = new ArrayList<>(Arrays.asList(list));

        ArrayList<Offer> fullTimeOffers = new ArrayList<>(Arrays.asList(list));
        fullTimeOffers.removeIf(p->p.isFullTime == false);

        ArrayList<Offer> localOffers = new ArrayList<>(Arrays.asList(list));
        fullTimeOffers.removeIf(p-> !p.location.equals("Madrid"));

        ArrayList<Offer> offersWithBenefits = new ArrayList<>(Arrays.asList(list));
        offersWithBenefits.removeIf(p->p.hasBenefit == false && p.hasPTO ==false);

        ArrayList<Offer> sdetOffers = new ArrayList<>(Arrays.asList(list));
        sdetOffers.removeIf(p->p.jobTitle != "SDET");

        ArrayList<Offer> offersWith100k = new ArrayList<>(Arrays.asList(list));
        offersWith100k.removeIf(p->p.salary < 100000);


    }







}
