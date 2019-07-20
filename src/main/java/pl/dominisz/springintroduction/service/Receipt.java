package pl.dominisz.springintroduction.service;

import java.math.BigDecimal;

public class Receipt {

    private BigDecimal amount;
    private boolean successfull;
    private String message;

    public Receipt(BigDecimal amount, boolean successfull, String message) {
        this.amount = amount;
        this.successfull = successfull;
        this.message = message;
    }

    public Receipt(BigDecimal amount){
        this.amount = amount;
        this.successfull = true;
        this.message = "";
    }

    public static Receipt forSuccessfulCharge(BigDecimal amount) {
    return new Receipt(amount);
  }

  public static Receipt forDeclinedCharge(String declineMessage) {
    return new Receipt(BigDecimal.ZERO, false, declineMessage);
  }

  public static Receipt forSystemFailure(String message) {
    return new Receipt(BigDecimal.ZERO, false, message);
  }

  public String toString(){
        if(successfull){
            return "Charge successful: " + amount;
        } else {
            return "Charge failed: " + message;
        }
  }


    public boolean isSuccessfull() {
        return successfull;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
