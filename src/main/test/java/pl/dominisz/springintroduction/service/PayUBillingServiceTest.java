package pl.dominisz.springintroduction.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class PayUBillingServiceTest {

  @Test
  public void shouuldCreateSuccessfulRecipient(){

    Order order = new Order(BigDecimal.TEN);

    CreditCard creditCard = new CreditCard("0123456789", "owner", "123", 12, 2020);
    PayUBillingService payUBillingService = new PayUBillingService();

    Receipt receipt = payUBillingService.chargeOrder(order, creditCard);

    Assertions.assertTrue(receipt.isSuccessfull());
    Assertions.assertEquals(receipt.getAmount(), BigDecimal.TEN);
  }
}