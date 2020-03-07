package com.kodilla.good.patterns.challenges.zakupy;

public class ProductOrderService {

    private InformationService informationService;
    private OrderService orderService;
    private SalesRepository salesRepository;

    public ProductOrderService(final InformationService informationService, final OrderService orderService, final SalesRepository salesRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.salesRepository = salesRepository;
    }

    public void process(final Order order) {

        boolean isSold = orderService.sale(order.getUser(), order.getProduct(), order.getDateOfSale());

        if (isSold) {
            informationService.inform(order.getUser(), order.getDateOfSale(), order.getProduct(), isSold);
            salesRepository.createSalesRepository(order.getUser(), order.getProduct(), order.getDateOfSale());
        } else {
            informationService.inform(order.getUser(), order.getDateOfSale(), order.getProduct(), isSold);
        }
    }
}