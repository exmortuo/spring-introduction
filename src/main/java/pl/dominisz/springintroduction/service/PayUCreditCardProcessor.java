package pl.dominisz.springintroduction.service;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class PayUCreditCardProcessor implements CreditCardProcessor {
    @Override
    public ChargeResult charge(CreditCard creditCard, BigDecimal amount) {
        return null;
    }
}
