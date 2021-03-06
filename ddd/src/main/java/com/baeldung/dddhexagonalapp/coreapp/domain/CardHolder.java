package com.baeldung.dddhexagonalapp.coreapp.domain;

public class CardHolder {

    private int cardHolderId;
    private String firstName;
    private String lastName;
    private String status;
    private int creditCardLimit;
    private String creditCardNumber;

    public CardHolder(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getCardHolderId() {
        return cardHolderId;
    }

    public void setCardHolderId(int cardHolderId) {
        this.cardHolderId = cardHolderId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCreditCardLimit() {
        return creditCardLimit;
    }

    public void setCreditCardLimit(int creditCardLimit) {
        this.creditCardLimit = creditCardLimit;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    @Override
    public String toString() {

        return "Card holder ID: " + cardHolderId + "\n" + "Card holder name: " + firstName + " " + lastName + "\n" + "Card Limit: " + creditCardLimit + " USD" + "\n" + "Card Category: " + status + "\n" + "Credit card number: " + creditCardNumber;
    }
}
