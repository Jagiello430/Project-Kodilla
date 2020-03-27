package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    ProductDao productDao;
    @Autowired
    ItemDao itemDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product computer = new Product("Acer");
        Item invoice = new Item(new BigDecimal(5000),2,new BigDecimal(10000));
        Item invoice1 = new Item(new BigDecimal(4500),3,new BigDecimal(13500));
        computer.getItems().add(invoice);
        computer.getItems().add(invoice1);
        invoice.setProduct(computer);
        invoice1.setProduct(computer);

        //When
        productDao.save(computer);
        itemDao.save(invoice);
        int id = computer.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        productDao.deleteById(id);
    }
}
