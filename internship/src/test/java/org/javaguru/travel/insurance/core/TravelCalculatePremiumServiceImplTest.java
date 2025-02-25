package org.javaguru.travel.insurance.core;

import org.javaguru.travel.insurance.rest.TravelCalculatePremiumRequest;
import org.javaguru.travel.insurance.rest.TravelCalculatePremiumResponse;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TravelCalculatePremiumServiceImplTest {

    private TravelCalculatePremiumServiceImpl service = new TravelCalculatePremiumServiceImpl();
    @Test
    public void fillOutResponse() {
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest("Ivanov", "Ivan", LocalDate.of(2024, Month.NOVEMBER, 12), LocalDate.of(2024, Month.DECEMBER, 12));

        TravelCalculatePremiumResponse responce = service.calculatePremium(request);

        assertAll("Comparison of reqest and response",
                () -> assertEquals(request.getPersonFirstName(), responce.getPersonFirstName()),
                () -> assertEquals(request.getPersonLastName(), responce.getPersonLastName()),
                () -> assertEquals(request.getAgreementDateFrom(), responce.getAgreementDateFrom()),
                () -> assertEquals(request.getAgreementDateTo(), responce.getAgreementDateTo()));

    }

}