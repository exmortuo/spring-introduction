package pl.dominisz.springintroduction.service;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Random;

@Data
public class PayUCreditCardProcessor implements CreditCardProcessor {

  private Random random = new Random();

  @Override
  public ChargeResult charge(CreditCard creditCard, BigDecimal amount) {
    int number = random.nextInt(3);

    if(number==1) {
      System.out.println("Card " + creditCard.getNumber() + " charged for " + amount);
      return new ChargeResult(true, "");
    } else if(number == 2) {
      System.out.println("Card " + creditCard.getNumber() + " charge failed");
      return new ChargeResult(false, "Empty account");
    } else {
      throw new UnreachableException("PayU server npot responding");
    }
  }
}
