package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.nextLine();
        String[] s = new String[k];

        for (int i = 0; i < k; i++) {
            s[i] = scanner.nextLine();
        }

        String[][] strings = new String[n][3];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                strings[i][j] = scanner.nextLine();
            }
        }

        String[] strings1 = new String[1];
        for (int j = 0; j < k; j++) {
            String secondElement = null;
            int average = 0;
            for (int i = 0; i < n; i++) {
                if (strings[i][2].equals(s[k])){
                        int min = Integer.parseInt(strings[0][0]);
                        for (int u = 1; u < strings.length; u++) {
                            if (Integer.parseInt(strings[u][0]) == min){
                                if (Integer.parseInt(strings[u][1]) >= average){
                                    average = Integer.parseInt(strings[u][1]);
                                }
                            }
                            else if (Integer.parseInt(strings[u][0]) < min) {
                                min = Integer.parseInt(strings[u][0]);
                                strings1[0] = Arrays.toString(strings[u]);
                            }
                        }
                        String savedString = strings1[0];
                        String[] splitValues = savedString.substring(1, savedString.length() - 1).split(", ");
                        secondElement = splitValues[1].trim();

                    }
                }
            sum = Integer.parseInt(sum + secondElement + average);
            }
        System.out.println(sum);
        }

    }

