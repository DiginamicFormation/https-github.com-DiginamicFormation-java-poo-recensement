package fr.diginamic.banque.entites;

public class Credit extends Operation {

    public Credit(String date, double montant) {
        super(date, montant);

    }

    @Override
    public String getType() {
        //this.solde+=montant;
        return "CREDIT";
    }
    @Override
    public String toString() {
        return "Credit{" +
                "date='" + date + '\'' +
                ", montant=" + montant +
                ", type = " + getType() +
                '}';
    }


}
