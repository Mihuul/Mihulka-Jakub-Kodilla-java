package com.kodilla.exception.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Locale;
import java.util.stream.Stream;

public class FileReader {

    public void readFile() {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("names.txt").getFile());

        //Alternatywny zapis
//        try {
//            Stream<String> fileLines = Files.lines(path);
//            fileLines.forEach(System.out::println);
//        } catch (IOException e) {
//            System.out.println("Oh no! Something went wrong! Error:" + e);
//        }

        try (Stream<String> fileLines = Files.lines(Paths.get(file.getPath()))) {
            fileLines.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Błąd odczytu pliku" +
                    " Error: " + e);
        } finally {
            System.out.println("Wyświetlam się zawsze".toUpperCase());
        }

        //System.out.println(path);
    }
}
