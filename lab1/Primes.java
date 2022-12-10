package lab1;

public class Primes {

    public static void main(String[] args){
        //Цикл на ввод данных в функцию от 2 до 100
        for (int i = 2; i <= 100; i++){
            //Полверка на просто число
            if (IsPrime(i) == true) {
                System.out.println(i);
            }
        }
    }

    /**
     * Функция по проверке, является ли число простым
     * @param n
     * @return
     */
    public static boolean IsPrime(int n){
        //Переменная, с которой начитается проверка
        int result = 2;
        //Цикл проверки, является ли число простым
        while (n % result != 0){
            //Инкрементация переменной
            result += 1;
        }
        //Возвращение результата
        return result == n;
    }
}