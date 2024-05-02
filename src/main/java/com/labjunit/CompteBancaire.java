package main.java.com.labjunit;

public class CompteBancaire {

    // Créditer solde
    public double crediterSolde(double montant, double solde) {
        return solde + montant;
    }

    // Débiter solde
    public double debiterSolde(double montant, double solde) {
        return solde - montant;
    }
}
