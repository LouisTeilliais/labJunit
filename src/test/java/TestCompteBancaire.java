package test.java;

import org.junit.jupiter.api.Test;

import main.java.com.labjunit.CompteBancaire;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCompteBancaire {

    @Test
    void testdebiterSolde() {
        CompteBancaire compte = new CompteBancaire();
        assertEquals(compte.debiterSolde(100, 1000), 900);
    }

    @Test
    void testdebiterSoldeInférieur() {
        CompteBancaire compte = new CompteBancaire();
        assertEquals(compte.debiterSolde(500, 400), -100);
    }

    @Test
    void testcrediterSolde() {
        CompteBancaire compte = new CompteBancaire();
        assertEquals(compte.crediterSolde(100, 1000), 1100);
    }

    @Test
    void testcrediterSoldeInférieur() {
        CompteBancaire compte = new CompteBancaire();
        assertEquals(compte.crediterSolde(1000, -500), 500);
    }

}
