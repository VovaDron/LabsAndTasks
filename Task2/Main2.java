package task2;

import java.util.Scanner;
import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        task11("nice", 4);
        task12();
        task13();
        task14();
        task15("243.131");
        task16(7);
        task17("52233");
        task18("ratio","orator");
        task191();
        task192();
        task20();
    }

    public static void task11(String str, Integer num){
        System.out.println("Task11");
        str = str.replaceAll(".", "$0".repeat(num));
        System.out.println(str);
    }

    public static void task12(){
        System.out.println("Task12");
        Integer mass[] = {10, 4, 1, 4, -10, -50, 32, 21};
        Arrays.sort(mass);
        System.out.println(mass[mass.length - 1] - mass[0]);
    }

    public static void task13(){
        System.out.println("Task13");
        Integer[] mass = {9, 2, 2, 5};
        double summ = 0;
        double avg;
        for(int i = 0; i < mass.length; i++) {
            summ = summ + mass[i];
        }
        avg = summ / mass.length;
        if(avg % 1 == 0){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }

    public static void task14(){
        System.out.println("Task14");
        Integer mass[] = {3, 3, -2, 408, 3, 3};
        for (int i = 1; i < mass.length; i++) {
            mass[i] += mass[i - 1];
        }
        System.out.println(Arrays.deepToString(mass));
    }

    public static void task15(String str){
        System.out.println("Task15");
        if(str.contains(".")){
            str = str.substring(str.lastIndexOf('.')+1);
            System.out.println(str.length());
        }else{
            System.out.println("0");
        }
    }

    public static void task16(Integer n){
        System.out.println("Task16");
        int a = 0;
        int b = 1;
        for (int i = 2; i <= n; ++i) {
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println(b);
    }

    public static void task17(String word){
        System.out.println("Task17");
        Integer num;
        num = word.length();
        if(num == 5){
            System.out.println(word.matches("[\\d]+"));
        }else{
            System.out.println("False");
        }
    }

    public static void task18(String str1, String str2){
        System.out.println("Task18");
        char[] strToArray1 = str1.toCharArray();
        char[] strToArray2 = str2.toCharArray();
        if(str1.length() != 0 && str2.length() != 0){
            if(strToArray1[0] == strToArray2[strToArray2.length - 1]
                    && strToArray1[strToArray1.length - 1] == strToArray2[0]){
                System.out.println("True");
            }else{System.out.println("False");}
        }else {System.out.println("False");}
    }

    public static void task191(){
        String word = "automation";
        String prefix = "auto-";
        String strNew = prefix.replace("-","");
        System.out.println(word.matches(strNew+"(.*)"));
    }

    public static void task192(){
        String word = "arachnophobia";
        String suffix = "-phobia";
        String strNew = suffix.replace("-","");
        System.out.println(word.matches("(.*)"+strNew));
    }

    public static String hexLattice(int number) {
        float N_float = (float) ((3 + Math.sqrt(12 * number - 3)) / 6);
        int N = (int) N_float;
        if (Math.abs(N_float - N) > 0)
            return "Invalid";

        String result = "";
        int n_lines = 2 * N - 1;
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N - i - 1; j++)
                result += " ";
            for (int j = 0; j < N + i; j++)
                result += " @";
            for (int j = 0; j < N - i; j++)
                result += " ";
            result += "\n";
        }
        for (int i = N; i < n_lines; ++i) {
            for (int j = 0; j < i - N + 1; j++)
                result += " ";
            for (int j = 0; j < n_lines - i + N - 1; j++)
                result += " @";
            for (int j = 0; j < i - N + 2; j++)
                result += " ";
            result += "\n";
        }
        return result;
    }

    public static void task20() {
        System.out.println("hexLattice(1)\n" + hexLattice(1));
        System.out.println("hexLattice(7)\n" + hexLattice(7));
        System.out.println("hexLattice(19)\n" + hexLattice(19));
        System.out.println("hexLattice(21)\n" + hexLattice(21));
    }
}
