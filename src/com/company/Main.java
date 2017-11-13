package com.company;
import java.lang.String;

public class Main {

    public static void main(String[] args) {
        String sourceString = " В этом тексте, несколько слов. Здесь есть пробелы в начале? Здесь есть и в начале и в   конце! ";// исходный текст, в котоором нужно подсчтать колличество слов
        String delimiters=" .,?!;:";
        boolean isStartedWord = false;
        int countWorlds = 0;//счетчик, подсчитывающий слова
        // цикл , в котором перебираются все символы заданной строки (исходного текста)
        for (int i = 0; i < sourceString.length(); i++) {
            boolean isContainedDelimiter = delimiters.contains(String.valueOf(sourceString.charAt(i)));
            if (isContainedDelimiter) {
                isStartedWord = false;
            } else {
                if(!isStartedWord) {
                    countWorlds++;
                }
                isStartedWord = true;
            }
        }
        System.out.print(" " + countWorlds);
    }
}
