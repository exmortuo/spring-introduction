package pl.dominisz.springintroduction.service;

public class ChargeResult {

  private Boolean successful;
  private String decelinedMessage;

  public ChargeResult(Boolean successful, String decelinedMessage) {
    this.successful = successful;
    this.decelinedMessage = decelinedMessage;
  }

  public boolean isSuccessful() {
    return successful;
  }

  public String getDeclineMessage() {
    return decelinedMessage;
  }
}
