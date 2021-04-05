package com.example.demo.ch1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.Random;

@SpringBootTest
public class ExampleTest {

    int dan;
    int times;

    @Test
    public void guguDan() {
        for (times = 1; times < 10; times++) {
            for (dan = 2; dan < 10; dan++) {
                System.out.print(dan + "X" + times + "=" + times * dan + "\t");
            }
            System.out.println();
        }
    }

    @Test
    public void GuGudan1() {
        for (dan = 2; dan <= 9; dan++) { // 컨티뉴 문을 이용한 구구단 2의배수만 출력
            if (dan % 2 != 0)
                continue; // 2의 배수가 아닐경우 내부 반복문 실행을 건너뛰고 다시 외부 반복문 수행
            for (times = 1; times <= 9; times++) {
                System.out.println(dan + "X" + times + "=" + dan * times);

            }
            System.out.println();
        }
    }

    @Test
    public void GuGuDan2() { // 브레이크문을 이용한 구구단 활용
        for (dan = 2; dan < 10; dan++) {
            for (times = 1; times < 10; times++) {
                if (dan < times) { // 단의수가 곱하는수보다 작을때까지만 내부 반복문을 실행하고
                    // 큰경우 브레이크문으로 빠져나와서 외부반복문 실행
                    break;
                }
                System.out.println(dan + "X" + times + "=" + dan * times);
            }
            System.out.println();
        }
    }


    @Test
    public void triangleCount() {
        int line = 4;
        int star = 1;
        int space = line / 2 + 1;

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            space -= 1;
            star += 2;
            System.out.println();
        }
    }

    @Test
    public void diamondCount() {
        int line = 7;
        int star = 1;
        int space = line / 2 + 1;
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            if (i < line / 2) {
                star += 2;
                space -= 1;
            } else {
                star -= 2;
                space += 1;
            }
            System.out.println();

        }
    }

    @Test
    public void lottoClass() {
        int[] lotto = new int[7];
        Random random = new Random();

        for (int i = 0; i < 7; i++) {
            lotto[i] = random.nextInt(45) + 1;
            for (int j = 0; j < i; j++) {
                if (lotto[i] == lotto[j]) {
                    i--;
                    //System.out.println("중복 다시 시작, " + "중복 번호 : " + lotto[i]);
                    break;
                }
                if(lotto[i] < lotto[j]){
                    int switching = lotto[i];
                    lotto[i] = lotto[j];
                    lotto[j] = switching;
                }
            }
        }
        for(int i =0; i<lotto.length; i++){
            System.out.print(lotto[i] + "\t");
        }
    }


}