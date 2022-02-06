package com.engeto.lekce1_pj;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        // ukol lekce 1a vytvoreni promennych
        // junker petr

        String jmenoKlienta = "Karel Vonásek"; //jmeno a přijmení  klienta
        int pocetNakupu = 12;  // kolik zakazniku si koupilo vyrobek
        String mesto = "Ostrava";  // nazev mesta, kde sidli firma
        double spotreba = 8.4; // spotřeba litru na 100 km
        double delkaKabelu = 123.6;
        LocalDate datumNarozeniKlienta = LocalDate.of(1962,5,21);
        String registracniZnacka = "APX 0788";
        String ipAdresa = "192.168.48.39";

        System.out.println("1. jméno " + jmenoKlienta);
        System.out.println("2. počet nákupů " + pocetNakupu);
        System.out.println("3. město " + mesto);
        System.out.println("4. spotřeba " + spotreba + " l/100km");
        System.out.println("5. délka kabelu " + delkaKabelu + " [m]");
        System.out.println("6. datum narození " + datumNarozeniKlienta);
        System.out.println("7. registračni značka " + registracniZnacka);
        System.out.println("8. IP adresa " + ipAdresa);


    }
}
