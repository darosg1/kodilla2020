package com.kodilla.pattern2.decorator.taxiportal;

import java.math.BigDecimal;

public class MyTaxiNetworkDecorator extends AbstractTaxiOrderDecorator{
    public MyTaxiNetworkDecorator(TaxiOrder taxiOrder){
        super(taxiOrder);
    }
    @Override
    public BigDecimal getCost(){
        //hardcoded stub cost = 30
        return super.getCost().add(new BigDecimal(30));
    }
    @Override
    public String getDescription(){
        return super.getDescription() + " by MyTaxi Network";
    }
}
