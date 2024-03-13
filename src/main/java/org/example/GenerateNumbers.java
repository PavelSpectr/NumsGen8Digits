package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GenerateNumbers {
    public GenerateNumbers() {
    }

    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("numbers.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);

            for(int i = 0; i <= 99999999; ++i) {
                String paddedNumber = String.format("%08d", i);
                printWriter.println(paddedNumber);
            }

            printWriter.close();
            System.out.println("Файл numbers.txt успешно создан.");
        } catch (IOException var5) {
            System.out.println("Ошибка при создании файла: " + var5.getMessage());
        }

    }
}