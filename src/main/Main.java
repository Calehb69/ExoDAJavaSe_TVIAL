package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String joueurUn = "Joueur blanc";
        String joueurDeux = "Joueur noir";

        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez le nom du premier joueur");

        joueurUn = sc.next();

        System.out.println("Entre le nom du second joueur");

        joueurDeux = sc.next();

        Game g = new Game("Joueur blanc", "Joueur noir");
        g.lancer();

        sc.close();
    }
}
