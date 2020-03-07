package com.kodilla.good.patterns.challenges.zakupy;

public class Application {
    public static void main (String []args){

        OrderRetriever orderRetriever = new OrderRetriever();
        Order order = orderRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(new EmailInformationService(), new ArticleSales(), new DataSalesRepository());
        productOrderService.process(order);
    }
}
