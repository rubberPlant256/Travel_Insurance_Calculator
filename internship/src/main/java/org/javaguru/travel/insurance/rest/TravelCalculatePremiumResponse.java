package org.javaguru.travel.insurance.rest;

import java.time.LocalDate;

public class TravelCalculatePremiumResponse {

    private String personFirstName;
    private String personLastName;
    private LocalDate agreementDateFrom;
    private LocalDate agreementDateTo;

    public TravelCalculatePremiumResponse(){}

    public TravelCalculatePremiumResponse(String personFirstName, String personLastName,
                                          LocalDate agreementDateFrom, LocalDate agreementDateTo){
        this.personFirstName = personFirstName;
        this.personLastName = personLastName;
        this.agreementDateFrom = agreementDateFrom;
        this.agreementDateTo = agreementDateTo;
    }

    public String getPersonFirstName() {
        return this.personFirstName;
    }

    public String getPersonLastName() {
        return this.personLastName;
    }

    public LocalDate getAgreementDateFrom() {
        return this.agreementDateFrom;
    }

    public LocalDate getAgreementDateTo() {
        return this.agreementDateTo;
    }

    public void setPersonFirstName(String personFirstName) {
        this.personFirstName = personFirstName;
    }

    public void setPersonLastName(String personLastName) {
        this.personLastName = personLastName;
    }

    public void setAgreementDateFrom(LocalDate agreementDateFrom) {
        this.agreementDateFrom = agreementDateFrom;
    }

    public void setAgreementDateTo(LocalDate agreementDateTo) {
        this.agreementDateTo = agreementDateTo;
    }
}
