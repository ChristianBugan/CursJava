package temacurs13;

import java.util.Scanner;

// Avem urmatorul string:
// “Lorem ipsum dolor sit amet, consectetur
// adipiscing elit. Aliquam consectetur odio ac quam commodo, eu
// eleifend felis imperdiet. Integer bibendum nunc quis sem faucibus,
// vitae laoreet mi dignissim. Praesent eget ligula nec lorem varius
// malesuada. Nulla neque lacus, euismod quis erat nec, convallis
// vestibulum augue. Nullam et aliquet justo. Aliquam erat volutpat.
// Nulla elementum urna in dolor viverra, in efficitur lectus mattis.”

// Vom face 4 metode:
// 1.) Prima metoda - verifica de cate ori apare cuvantul "Nulla" in acest string si va printa numarul
// 2.) a 2 a metoda - va imparti stringul in cate propozitii cuprinde si le va printa pe fiecare pe randul ei in consola
// 3.) a 3 a metoda -> va folosi metoda : deleteCharAt() din StringBuilder pentru a sterge toate aparitiile literei "a"
// 4.) a 4 a metoda -> va volosi clasa StringBuilder pentru a inlocui toate aparitiile literei "o" cu caracterul "#"

public class problema1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam consectetur odio ac quam commodo, eu" +
                " eleifend felis imperdiet. Integer bibendum nunc quis sem faucibus," +
                " vitae laoreet mi dignissim. Praesent eget ligula nec lorem varius" +
                " malesuada. Nulla neque lacus, euismod quis erat nec, convallis" +
                " vestibulum augue. Nullam et aliquet justo. Aliquam erat volutpat." +
                " Nulla elementum urna in dolor viverra, in efficitur lectus mattis.";

        System.out.println("Alege una dintre cele patru metode:");
        System.out.println("1. Numara de cate ori apare cuvantul \"Nulla\" in text.");
        System.out.println("2. Imparte textul in propozitii si le afiseaza pe fiecare pe un rand separat.");
        System.out.println("3. Sterge toate aparitiile literei 'a' din text.");
        System.out.println("4. Inlocuieste toate aparitiile literei 'o' cu caracterul '#'.");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                int occurrences = countWordOccurrences(text, "Nulla");
                System.out.println("Numarul de aparitii ale cuvantului \"Nulla\": " + occurrences);
                break;
            case 2:
                splitIntoSentences(text);
                break;
            case 3:
                String result1 = removeCharacter(text, 'a');
                System.out.println("Textul dupa stergerea literelor 'a':\n" + result1);
                break;
            case 4:
                String result2 = replaceCharacter(text, 'o', '#');
                System.out.println("Textul dupa inlocuirea literelor 'o' cu '#':\n" + result2);
                break;
            default:
                System.out.println("Alegere invalida.");
                break;
        }

        scanner.close();
    }

    // Metoda pentru a număra de câte ori apare un cuvânt în text
    public static int countWordOccurrences(String text, String word) {
        String[] words = text.split("\\W+"); // Impartim textul in cuvinte folosind regex-ul "\\W+" (non-word characters)
        int count = 0;
        for (String w : words) {
            if (w.equalsIgnoreCase(word)) { // Ignoram diferenta dintre majuscule si minuscule
                count++;
            }
        }
        return count;
    }

    // Metoda pentru a împărți textul în propoziții și a le afișa pe fiecare pe un rând separat
    public static void splitIntoSentences(String text) {
        String[] sentences = text.split("\\.\\s"); // Impartim textul in propozitii folosind ". " ca separator
        System.out.println("Propozitiile din text sunt:");
        for (String sentence : sentences) {
            System.out.println(sentence);
        }
    }

    // Metoda pentru a șterge toate aparițiile unui caracter din text
    public static String removeCharacter(String text, char character) {
        StringBuilder sb = new StringBuilder(text);
        for (int i = sb.length() - 1; i >= 0; i--) {
            if (sb.charAt(i) == character) {
                sb.deleteCharAt(i);
            }
        }
        return sb.toString();
    }

    // Metoda pentru a inlocui toate aparițiile unui caracter cu alt caracter în text
    public static String replaceCharacter(String text, char oldChar, char newChar) {
        StringBuilder sb = new StringBuilder(text);
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == oldChar) {
                sb.setCharAt(i, newChar);
            }
        }
        return sb.toString();
		
	}

}
