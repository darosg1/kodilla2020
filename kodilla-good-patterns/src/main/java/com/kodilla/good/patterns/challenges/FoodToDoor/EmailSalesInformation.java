package com.kodilla.good.patterns.challenges.FoodToDoor;

public class EmailSalesInformation implements SalesInformation {
    public void inform(Order order, boolean isSold){
        if (isSold){
            System.out.println("Użytkowniku "+order.getUser().getFirstName()+" "+order.getUser().getSurname()+", username "+
                    order.getUser().getUserName()+" zamówienie zostało złożone pomyślnie w dniu "+ order.getDateOfOrder());
            System.out.println("Zamówione produkty: " + order.getProduct().getProductName()+" w ilości: "+order.getProduct().getQuantity()+", w cenie jednostkowej PLN: "+order.getProduct().getPrice());
            System.out.println("Adres do wysyłki: "+ order.getUser().getAddress());
            System.out.println("Faktura dla: " +order.getUser().getUserName() +
                    " zostanie wygenerowana i wysłana na adres e-mailowy: "+order.getUser().getEmail());
        }else{
            System.out.println("Użytkowniku "+order.getUser().getFirstName()+" "+order.getUser().getSurname()+" "+
                    "zamównienie nie zostało przyjęte");
            System.out.println("Data odrzucenia: "+order.getDateOfOrder());
        }
    }
}
