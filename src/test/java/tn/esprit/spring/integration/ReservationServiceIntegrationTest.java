package tn.esprit.spring.integration;

import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.spring.DAO.Entities.Reservation;
import tn.esprit.spring.Services.Reservation.IReservationService;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@Transactional
public class ReservationServiceIntegrationTest {

    @Autowired
    private IReservationService reservationService;

    @Test
    void testFindAllReservations() {
        List<Reservation> reservations = reservationService.findAll();
        assertNotNull(reservations);
    }
}

