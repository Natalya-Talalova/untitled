package org.example;
import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.nextLine(); // Очищаем символ новой строки из буфера

        String[] s = new String[k];

        for (int i = 0; i < k; i++) {
            s[i] = scanner.nextLine();
        }

        String[][] strings = new String[n][5];

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < line.length(); j++) {
                strings[i][j] = String.valueOf(line.charAt(j));
            }
        }


        for (int j = 0; j < k; j++) {
            int min = Integer.parseInt(strings[0][0]);
            String currentSecondElement = "0";
            int currentAverage = 0;

            for (int i = 0; i < n; i++) {
                if (strings[i][4].equals(s[j])){
                    if (Integer.parseInt(strings[i][0]) == min){
                        if (Integer.parseInt(strings[i][2]) >= currentAverage){
                            currentAverage = Integer.parseInt(strings[i][2]);
                        }
                    } else if (Integer.parseInt(strings[i][0]) < min) {
                        min = Integer.parseInt(strings[i][0]);
                        currentSecondElement = strings[i][2];
                        currentAverage = Integer.parseInt(strings[i][2]);
                    }
                }
            }

            sum += Integer.parseInt(currentSecondElement) + currentAverage;
        }

        System.out.println(sum);
    }
}





