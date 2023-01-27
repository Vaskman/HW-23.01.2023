import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
        public static void task1 () {
            System.out.println("HW-25.01.2023");
            System.out.println("Задача №1 Массивы 2.0 ");
            int[] arr = generateRandomArray();
            int sum = 0;
            for (int element : arr) {
                sum = sum + element;
            }
            System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        }
        public static void task2 () {
            System.out.println("Задача №2 Массивы 2.0 ");
            int[] arr = generateRandomArray();
            int maxSum = arr[0] - 1;
            int minSum = arr[0] + 1;
            System.out.println(Arrays.toString(arr));
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > maxSum) {
                    maxSum = arr[i];
                } else if (arr[i] < minSum) {
                    minSum = arr[i];
                }
            }
            System.out.println(minSum);
            System.out.println(maxSum);
        }
        public static void task3 () {
            System.out.println("Задача №3 Массивы 2.0 ");
            int[] arr = generateRandomArray();
            double sum = 0;
            double srsum = arr.length;
            for (double element : arr) {
                sum = sum + element;
                srsum = sum / arr.length;
            }
            System.out.println("Средняя сумма трат за месяц составила " + srsum + " рублей");
        }
        public static void task4 () {
            System.out.println("Задача №4 Массивы 2.0 ");
            char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
            for (int i = reverseFullName.length - 1; i >= 0; i--) {
                System.out.print(reverseFullName[i]);
            }
            System.out.println();
        }
    }




