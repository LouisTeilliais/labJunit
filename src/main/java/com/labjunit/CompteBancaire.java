package main.java.com.labjunit;

public class CompteBancaire {

    public double crediterSolde(double montant, double solde) {
        return solde + montant;
    }

    public double debiterSolde(double montant, double solde) {
        return solde - montant;
    }
}
