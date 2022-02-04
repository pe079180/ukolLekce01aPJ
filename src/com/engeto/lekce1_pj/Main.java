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
        BigDecimal spotreba = BigDecimal.valueOf(8.4); // spotřeba litru na 100 km
        double delkaKabelu = 123.6;
        LocalDate datumNarozeniKlienta = LocalDate.of(1962,05,21);
        String registracniZnacka = "APX 0788";
        String ipAdresa = "192.168.48.39";

        //LocalDate mistniCas = LocalDate.now();

        System.out.println("jméno    " + jmenoKlienta);
        System.out.println("spotřeba " + spotreba + " l/100km");
        System.out.println("délka kabelu " + delkaKabelu + " [m]");
        System.out.println("datum narození " + datumNarozeniKlienta);
        System.out.println("registračni značka " + registracniZnacka);
        System.out.println("IP adresa " + ipAdresa);
        //System.out.println("mistní čss " + mistniCas);


    }
}
