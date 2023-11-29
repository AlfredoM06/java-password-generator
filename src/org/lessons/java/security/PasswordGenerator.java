package org.lessons.java.security;
import java.util.Scanner;
public class PasswordGenerator {
    public static void main(String[] args) {
    Scanner keyboardReader = new Scanner(System.in);

    String name;
    String surname;
    String favoriteColor;
    int day;
    int month;
    int year;

    System.out.println("Benvenuto nel Password Generator");

    System.out.println("Inserisci qui il tuo nome");
    name = keyboardReader.nextLine();

    System.out.println("Inserisci qui il tuo cognome");
    surname = keyboardReader.nextLine();

    System.out.println("Inserisci qui il tuo colore preferito");
    favoriteColor = keyboardReader.nextLine();

    System.out.println("inserisci qui il giorno in cui sei nato");
    day = keyboardReader.nextInt();

    System.out.println("inserisci qui il mese in cui sei nato");
    month = keyboardReader.nextInt();

    System.out.println("inserisci qui l'anno in cui sei nato");
    year = keyboardReader.nextInt();

    int total = day + month + year;

    System.out.println("Ecco la tua password");
    System.out.println("password: " + name + "-" + surname + "-" + favoriteColor + "-" + total);

    keyboardReader.close();
    }
}
