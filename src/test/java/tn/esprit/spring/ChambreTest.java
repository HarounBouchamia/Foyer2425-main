package tn.esprit.spring;

import tn.esprit.spring.DAO.Entities.Chambre;
import tn.esprit.spring.DAO.Entities.TypeChambre;
import tn.esprit.spring.DAO.Repositories.ChambreRepository;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import tn.esprit.spring.Services.Chambre.ChambreService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ChambreTest {

    @Mock
    private ChambreRepository chambreRepository;

    @InjectMocks
    private ChambreService chambreService;

    @Test
    @Order(1)
    void testAddOrUpdateChambre() {
        // Given
        Chambre chambre = Chambre.builder()
                .numeroChambre(101)
                .typeC(TypeChambre.DOUBLE)
                .build();

        Chambre savedChambre = Chambre.builder()
                .idChambre(1L)
                .numeroChambre(101)
                .typeC(TypeChambre.DOUBLE)
                .build();

        when(chambreRepository.save(any(Chambre.class))).thenReturn(savedChambre);

        // When
        Chambre result = chambreService.addOrUpdate(chambre);

        // Then
        assertNotNull(result);
        assertEquals(101, result.getNumeroChambre());
        assertEquals(TypeChambre.DOUBLE, result.getTypeC());
    }
}
