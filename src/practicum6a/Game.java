package practicum6a;

import java.time.LocalDate;

public class Game {
    private final String naam;
    private final int releaseJaar;
    private final double nieuwprijs;


    public Game(String nm, int rJ, double nwpr){
        this.naam = nm;
        this.releaseJaar = rJ;
        this.nieuwprijs = nwpr;
    }

    public String getNaam(){
        return naam;
    }

    public double huidigeWaarde(){
        double prijs = nieuwprijs;
        int yearNow = LocalDate.now().getYear();
        for (int i = 0; i < (yearNow - releaseJaar); i++){
            prijs *= 0.7;
        }
        return prijs;
    }

    public boolean equals(Object andereObject){
        boolean j = false;
        if (andereObject instanceof Game){
            Game andereGame = (Game) andereObject;
            if (this.naam.equals(andereGame.getNaam()) &&
                    this.releaseJaar == andereGame.releaseJaar){
                j = true;
            }
        }
        return j;
    }

    public String toString(){
        return naam+ ", uitgegeven in " +releaseJaar+ "; nieuwprijs: €" +String.format("%.2f", nieuwprijs)+ " nu voor: €" +String.format("%.2f", huidigeWaarde());
    }
}

