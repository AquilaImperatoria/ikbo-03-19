package ru.mirea.lab8;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


public class Main {

    private static final String FILE_PATH = "src/ru/mirea/lab8/";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Содерджание файла lab8_text.txt:");
            readFile(FILE_PATH + "lab8_text.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFile(String filename) throws IOException {
        Path path = Paths.get(filename);
        Charset charset = StandardCharsets.UTF_8;
        try (BufferedReader reader = Files.newBufferedReader(path, charset)) {
            String s;
            while ((s = reader.readLine()) != null) {
                System.out.println(s);
            }
        }
    }

}
