package fr.diginamic.banque.entites;

public class Debit extends Operation {
    public Debit(String date, double montant) {
        super(date, montant);

    }

    @Override
    public String getType() {
        //this.solde -= montant;
        return "DEBIT";
    }
    @Override
    public String toString() {
        return "Debit{" +
                "date='" + date + '\'' +
                ", montant=" + montant +
                ", type = " + getType() +
                '}';
    }


}
