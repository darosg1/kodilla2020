package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import jdk.nashorn.internal.ir.Optimistic;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.math.BigDecimal;
import java.util.Optional;

@RunWith (SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave(){
        //Given
        Invoice invoice = new Invoice ("04/04/2020");
        Product product = new Product ("MS Office");
        Item item1 = new Item (product, new BigDecimal ( 299 ), 1, new BigDecimal(299 ));
        Item item2 = new Item (product, new BigDecimal ( 299), 2, new BigDecimal ( 598 ));

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        //When
        invoiceDao.save(invoice);
        Optional<Invoice> result = invoiceDao.findById(invoice.getId());
        //Then
        Assert.assertTrue(result.isPresent());
        //CleanUp
        invoiceDao.deleteById(invoice.getId());
     }
}
