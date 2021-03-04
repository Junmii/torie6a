package practicum6a;

import java.util.ArrayList;

public class Persoon {
    private final String naam;
    private double budget;
    private final ArrayList<Game> mijnGames;

    public Persoon(String nm, double bud){
        this.naam = nm;
        this.budget = bud;
        mijnGames = new ArrayList<Game>();
    }

    public double getBudget() {
        return budget;
    }

    public boolean koop(Game g){
        if (budget > g.huidigeWaarde()){
            for (Game spel : mijnGames){
                if (g.equals(spel))
                    return false;
            }
            budget -= g.huidigeWaarde();
            mijnGames.add(g);
            return true;
        }else{
            return false;
        }
    }

    public boolean verkoop(Game g, Persoon koper){
        if (koper.budget > g.huidigeWaarde()){
            for (Game spel : mijnGames){
                if (g.equals(spel)){
                    for (Game spelKoper : koper.mijnGames) {
                        if (g.equals(spelKoper))
                            return false;
                    }
                    koper.budget -= g.huidigeWaarde();
                    koper.mijnGames.add(g);
                    budget += g.huidigeWaarde();
                    mijnGames.remove(g);
                    return true;
                }
            }
        }
        return false;
    }

    public Game zoekGameOpNaam(String g){
        for (Game game1 : mijnGames){
            if (g.equals(game1.getNaam()))
                return game1;
            else
                return null;
        }
        return null;
    }

    public String toString(){
        StringBuilder str = new StringBuilder(naam+ " heeft een budget van €" +String.format("%.2f", budget)+ " en bezit de volgende games:");
        for (Game spel : this.mijnGames){
            str.append("\n").append(spel);
        }
        return str.toString();
    }
}

