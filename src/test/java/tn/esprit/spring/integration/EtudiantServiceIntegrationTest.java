package tn.esprit.spring.integration;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.spring.DAO.Entities.Etudiant;
import tn.esprit.spring.Services.Etudiant.IEtudiantService;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
public class EtudiantServiceIntegrationTest {

    @Autowired
    private IEtudiantService etudiantService;

    @Test
    void testAddAndFindEtudiant() {
        Etudiant et = Etudiant.builder()
                .nomEt("Haroun")
                .prenomEt("Bouchamia")
                .cin(12345678)
                .ecole("Esprit")
                .build();

        Etudiant saved = etudiantService.addOrUpdate(et);
        assertNotNull(saved.getIdEtudiant());

        Etudiant found = etudiantService.findById(saved.getIdEtudiant());
        assertEquals("Haroun", found.getNomEt());
    }

    @Test
    void testFindAllEtudiants() {
        List<Etudiant> all = etudiantService.findAll();
        assertNotNull(all);
    }
}

