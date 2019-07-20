package pl.dominisz.springintroduction.service;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Order {

  BigDecimal amount;

  public Order(BigDecimal amount) {
    this.amount = amount;
  }

}
