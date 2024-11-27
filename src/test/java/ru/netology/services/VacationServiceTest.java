package ru.netology.services;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class VacationServiceTest {

    private final VacationService service = new VacationService();

    @Test
    void shouldCalculateThreeMonthsOfRest() {
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;

        int result = service.calculateMonthsOfRest(income, expenses, threshold);

        assertEquals(3, result);
    }

    @Test
    void shouldCalculateTwoMonthsOfRestWithHigherIncomeAndThreshold() {
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;

        int result = service.calculateMonthsOfRest(income, expenses, threshold);

        assertEquals(2, result);
    }

}
