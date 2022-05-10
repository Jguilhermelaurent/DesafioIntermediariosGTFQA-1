package com.dio.Desafios;

import java.io.IOException;
import java.util.Scanner;

public class KageBunshinNoJutsu {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N;
        while (sc.hasNext()) {
            N = sc.nextInt();
            System.out.println((int)(Math.log(N)/Math.log(2)));
        }
        sc.close();
    }
}
