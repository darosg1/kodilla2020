package com.kodilla.good.patterns.challenges.FoodToDoor;

public class Processor{
    private Producer producer;
    private SalesInformation salesInformation;

    public Processor(Producer producer, SalesInformation salesInformation) {
        this.producer = producer;
        this.salesInformation = salesInformation;
    }

    public void process (Order order) {
        boolean isSold = producer.process(order.getUser(), order.getProduct(), order.getDateOfOrder());

        if (isSold) {
            salesInformation.inform(order, isSold);
            System.out.println("Potwierdzenie zostało wygenerowane automatycznie");
            System.out.println();
        }
    }
}

