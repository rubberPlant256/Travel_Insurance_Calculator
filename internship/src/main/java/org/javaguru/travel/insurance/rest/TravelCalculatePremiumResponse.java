package org.javaguru.travel.insurance.rest;

import java.util.Date;

public class TravelCalculatePremiumResponse {

    private String personFirstName;
    private String personLastName;
    private Date agreementDateFrom;
    private Date agreementDateTo;

    public TravelCalculatePremiumResponse(){}

    public TravelCalculatePremiumResponse(String personFirstName, String personLastName,
                                         Date agreementDateFrom, Date agreementDateTo){
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

    public Date getAgreementDateFrom() {
        return this.agreementDateFrom;
    }

    public Date getAgreementDateTo() {
        return this.agreementDateTo;
    }

    public void setPersonFirstName(String personFirstName) {
        this.personFirstName = personFirstName;
    }

    public void setPersonLastName(String personLastName) {
        this.personLastName = personLastName;
    }

    public void setAgreementDateFrom(Date agreementDateFrom) {
        this.agreementDateFrom = agreementDateFrom;
    }

    public void setAgreementDateTo(Date agreementDateTo) {
        this.agreementDateTo = agreementDateTo;
    }
}
