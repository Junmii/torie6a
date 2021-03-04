package practicum6a;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int releaseJaar1 = LocalDate.now().getYear() - 1; // 1 jaar geleden

        practicum6a.Game g1 = new practicum6a.Game("Just Cause 3", releaseJaar1, 49.98);
        practicum6a.Game g2 = new practicum6a.Game("Need for Speed: Rivals", releaseJaar1, 45.99);
        practicum6a.Game g3 = new practicum6a.Game("Need for Speed: Rivals", releaseJaar1, 45.99);

        practicum6a.Persoon p1 = new practicum6a.Persoon("Eric", 200);
        practicum6a.Persoon p2 = new practicum6a.Persoon("Hans", 55);

        System.out.println("p1 koopt g1:" + (p1.koop(g1) ? "" : " niet") + " gelukt");
        System.out.println("p1 koopt g2:" + (p1.koop(g2) ? "" : " niet") + " gelukt");
        System.out.println("p1 koopt g3:" + (p1.koop(g3) ? "" : " niet") + " gelukt");
        System.out.println("\np1: " +p1+ "\n\np2: " +p2+ "\n");

        System.out.println("p1 verkoopt g2 aan p2:"+(p1.verkoop(g2, p2) ? "" : " niet")+" gelukt");
        System.out.println("p1 verkoopt g1 aan p2:"+(p1.verkoop(g1, p2) ? "" : " niet")+" gelukt");
        System.out.println("\np1: " +p1+ "\n\np2: " +p2+ "\n");

        practicum6a.Game game1 = p1.zoekGameOpNaam("Just Cause 3");
        System.out.println("p1 heeft Just Cause 3 " + (game1 != null ? "wel!" : "niet!"));
    }
}

