/**
 * Classname Main
 *
 * Version info 1
 *
 * Copyright Alyona Sviridova NTU KhPI
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        String text = new String(Files
                .readAllBytes(Paths.get("Harry.txt")));

        String cleanedText = text
                .replaceAll("\\.", "")
                .replaceAll(",", "")
                .replaceAll("!", "")
                .replaceAll("\\?", "")
                .replaceAll("-", "")
                .replaceAll("-", " ")
                .replaceAll("—", " ")
                .replaceAll(";", "")
                .replaceAll(":", "")
                .replaceAll("  ", " ")
                .toLowerCase();

        // The novel into an array of words
        String[] words = cleanedText.split(" ");
        String districtWords = "";

        for (int i = 0; i < words.length; i++) {

            if (!districtWords.contains(words[i])) {
                districtWords += " " + words[i];
            }
        }
        // Array containing distinct words
        String[] distinct = districtWords.split(" ");

        // The words in alphabetic order
        Arrays.sort(distinct);
        for (int i = 0; i < distinct.length; i++) {
            System.out.println(distinct[i]);
        }
    }
}
