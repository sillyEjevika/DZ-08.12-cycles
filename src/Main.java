public class Main {
    public static void main(String[] args) {
      // Задача №1
        System.out.println("Задача №1");
        for (int i = 1; i <= 10; i++){
            System.out.println ("Итерация цикла " + i);
        }
        // Задача №2
        System.out.println("Задача №2");
        for (int i = 10; i >= 1; i--) {
            System.out.println ("Итерация цикла " + i);
        }
        // Задача №3
        System.out.println("Задача №3");
        for (int i = 0; i <= 17; i = i+2) {
            System.out.println ("Итерация цикла (все четные числа) " + i);
        }
        // Задача №4
        System.out.println("Задача №4");
        for (int i = 10; i >= -10; i --) {
            System.out.println ("Итерация цикла " + i);
        }
        // Задача №5
        System.out.println("Задача №5");
        for (int i = 1904; i <= 2096; i = i+4) {
            System.out.println (i + " год является високосным");
        }
        // Задача №6
        System.out.println("Задача №6");
        for (int i = 7; i <= 98; i = i+7) {
            System.out.println (i);
        }
        // Задача №7
        System.out.println("Задача №7");
        for (int i = 1; i <= 512; i = i*2) {
            System.out.println(i);
        }

        // Задача №8
        System.out.println("Задача №8");
        int firstTime = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i ++) {
            total = total + firstTime;
            System.out.println("Месяц " + i +", сумма накоплений равна " + total + " рублей");
        }
        // Задача №9
        System.out.println("Задача №9");
        int firstDeposit = 29000;
        int total1 = 0;
        for (int i = 1; i <= 12; i ++) {
            total1 = total1 + total1 / 100;
            total1 = total1 + firstDeposit;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total1 + " рублей");
        }
        // Задача №10
        System.out.println("Задача №10");
        int a = 2;
        for (int j = 1; j <= 10; j ++) {
            System.out.println (a + "*" + j + " =" + (a * j));
        }
    }
}