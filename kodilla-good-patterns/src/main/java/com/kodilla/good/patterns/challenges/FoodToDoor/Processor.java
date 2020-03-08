package com.kodilla.good.patterns.challenges.FoodToDoor;

public class Processor{
    private SalesInformation salesInformation;

    public Processor(SalesInformation salesInformation) {
        this.salesInformation = salesInformation;
    }
    public void process (Order order) {
        boolean isSold = Producer.process(order.getUser(), order.getProduct(), order.getDateOfOrder());

        if (isSold) {
            salesInformation.inform(order, isSold);
            System.out.println("Potwierdzenie zostało wygenerowane automatycznie");
            System.out.println();
        }
    }
}

