package pl.dominisz.springintroduction.service;

public class UnreachableException extends RuntimeException {
  public String getMessage() {
    return null;
  }
}
