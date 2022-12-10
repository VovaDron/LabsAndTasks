package task1;

import java.util.Scanner;
import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4(0.9, 1, 2);
        task5(24, 15, 9);
        task6();
        task7(10);
        task8(8,10);
        task9();
        task10(42,5,0);
    }

    public static void task1(){
        System.out.println("Task1:" );
        Scanner in = new Scanner(System.in);
        System.out.println("Введите делимое:");
        Integer num1 = in.nextInt();
        System.out.println("Введите делитель:");
        Integer num2 = in.nextInt();
        Integer num3;
        num3 = num1%num2;
        System.out.println("Число без остатка: " + num3);
    }

    public static void task2(){
        System.out.println("Task2:" );
        Scanner in = new Scanner(System.in);
        System.out.println("Введите высоту:");
        Integer h = in.nextInt();
        System.out.println("Введите основание:");
        Integer a = in.nextInt();
        Integer S;
        S = (a * h)/2;
        System.out.println("Площадь треугольник: " + S);
    }
    public static void task3(){
        System.out.println("Task3:" );
        Scanner in = new Scanner(System.in);
        Integer chickens = 2;
        Integer cows = 4;
        Integer pigs = 4;
        Integer all;
        System.out.println("Введите кол-во куриц:");
        Integer num_chickens = in.nextInt();
        System.out.println("Введите кол-во коров:");
        Integer num_cows = in.nextInt();
        System.out.println("Введите кол-во свиней:");
        Integer num_pigs = in.nextInt();
        all = (chickens * num_chickens) + (pigs * num_pigs) + (cows * num_cows);
        System.out.println("Количество конечностей: " + all);
    }

    public static void task4(double prob, double prize, double pay){
        System.out.println("Task4:" );
        if (prob * prize > pay){
            System.out.println("true");
        }
        else {
            System.out.println("False");
        }
    }

    public static void task5(Integer a, Integer b, Integer N){
        System.out.println("Task5:");
        if(a + b == N){
            System.out.println("Сумма");
        } else if (a - b == N || b - a == N) {
            System.out.println("Вычитание");
        } else if (a * b == N) {
            System.out.println("Умножение");
        } else if (a / b == N || b / a == N) {
            System.out.println("Деление");
        }else {
            System.out.println("Не возможно посчитать");
        }
    }

    public static void task6(){
        System.out.println("Task6:");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите сивл для просмотра его по ACHII:");
        char ch = in.next().charAt(0);
        int ascii = ch;

        System.out.println("Сивол в таблице ASCII: " + ch + " будет: " + ascii);
    }

    public static void task7(Integer num1){
        System.out.println("Task7: ");
        Integer cd = 0;
        for (Integer i = 1; i <= num1; i++){
            cd = cd + i;
        }
        System.out.println("Сумма всех перечисленных чисел: " + cd);
    }

    public static void task8(Integer num1, Integer num2){
        System.out.println("Task8: ");
        Double num3;
        // по теореме коссинусов a2=b2+c2-2bc*cosγ
        num3 = Math.sqrt(Math.pow(num1, 2) + Math.pow(num2, 2) - ((2 * num1 * num2) * Math.cos(179)));
        System.out.printf("%.2f",num3);
    }

    public static void task9(){
        System.out.println("Task9: ");
        Scanner in = new Scanner(System.in);
        double summ = 0;
        System.out.println("Введите кол-во сиволов: ");
        Integer[] nums = new Integer[4];
        Integer size = in.nextInt();
        System.out.println("Введите символы: ");
        if(size > 0){
            for (Integer i = 0; i < size; i++) {
                nums[i] = in.nextInt();
                summ += Math.pow(nums[i], 3);
            }
        }else {
            summ = 0;
        }

        System.out.printf("Сумма: "+ "%.0f",summ);
    }

    public static void task10(Integer a, Integer b, Integer c){
        System.out.println("Task10: ");

        for(Integer i = 1; i <= b; i++){
            a += a;
        }
        if(c != 0){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
