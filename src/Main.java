import java.util.Arrays;

public class Main { //извините пожалуйста, спешила и забыла сделать initial commit, и все делала в master ветке. осознала - каюсь
    public static void main(String[] args) {
        task1();
        System.out.println();
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

    public static void task1() {
        int[] arr = generateRandomArray();

        int sum = 0;
        for (int index = 0; index < arr.length; index++) {
            sum += arr[index];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей"); //задача1

        System.out.println();
    }

    public static void task2() {
        int[] arr = generateRandomArray();

        int minArr = arr[0];
        int maxArr = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minArr) {
                minArr = arr[i];
            }
            if (arr[i] > maxArr) {
                maxArr = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minArr + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + maxArr + " рублей"); //задача2
        System.out.println();
    }

    public static void task3(){
        int[]arr=generateRandomArray();
        int sum=0;
        for(int index=0;index<arr.length;index++){
        sum+=arr[index];
        }
        double average=0;
        average=(double)sum/arr.length;
        System.out.println("Средняя сумма трат за месяц составила "+average+" рублей"); //задача3
        System.out.println();


        }

public static void task4(){
        char[]reverseFullName={'n','a','v','I',' ','v','o','n','a','v','I'};
        for(int i=reverseFullName.length-1;i>=0;i--){
        System.out.print(reverseFullName[i]);       //задача4
        }
        }
        }