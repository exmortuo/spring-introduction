package pl.dominisz.springintroduction.service;

import java.math.BigDecimal;

public class Receipt {
    public static Receipt forSuccessfulCharge(BigDecimal amount) {
        return null;
    }

    public static Receipt forDeclinedCharge(String declineMessage) {
        return null;
    }

    public static Receipt forSystemFailure(String message) {
        return null;
    }
}
