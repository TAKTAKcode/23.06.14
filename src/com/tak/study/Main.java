package com.tak.study;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //학생 : 인원
        int num = sc.nextInt();
        //학생 : 점수
        Integer[] score = new Integer[num];

        //상을 받은 학생 수
        int cnt = sc.nextInt();

        //학생 : 인원 만큼 반복
        for (int i = 0; i < num; i++) {
            score[i] = sc.nextInt();
        }

        Arrays.sort(score, Collections.reverseOrder());

        System.out.println(score[cnt - 1]);

    }

}
