package com.company;
import java.lang.String;

public class Main {

    public static void main(String[] args) {
        String sourceString = "В этом тексте несколько слов. Здесь есть пробелы в начале! Здесь есть и в начале и в конце. ";
        char delimiter = ' ';
        char delimiter1 = '.';
        char delimiter2 = '!';
        char delimiter3 = ',';
        char delimiter4 = '!';
        int countWorld = 0;
        int j=0;
        for (int i = 0; i < sourceString.length(); i++) {
            boolean world = i != delimiter && i != delimiter1 && i != delimiter3 && i != delimiter4 && i!= delimiter2;
            if (world) {
                for ( j = i; j < sourceString.length(); j++) {
                    if (world)
                        continue;
                    else
                        countWorld++;
                    i=j;
                    break;
                }
            }
            else {
                continue;
            }
        }
        System.out.print(" " + countWorld);
    }
}
