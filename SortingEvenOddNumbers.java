package com.dio.Desafios;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortingEvenOddNumbers{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        List<Integer> listNumbers = new ArrayList<Integer>();
        for (int i=0;i<tests;i++)
            listNumbers.add(sc.nextInt());
        listNumbers.stream()
                .filter(n->n%2==0)
                .sorted()
                .forEach(System.out::println);
        listNumbers.stream()
                .filter(n->n%2!=0)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
        sc.close();
    }
}
