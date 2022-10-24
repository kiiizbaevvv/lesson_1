import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//
        Scanner in = new Scanner(System.in);
//        int three_digit = in.nextInt();
//        int a = three_digit / 100;
//        int b = three_digit / 10 % 10;
//        int c = three_digit % 10;
//
//        System.out.println(three_digit / 100 + ", " + three_digit / 10 % 10 + ", " + three_digit % 10);
//        int a = 0;
//        while(a < 10){
//            System.out.println(a + "hello");
//            a++;
//        }
//        System.out.println();
//        int a = in.nextInt();
//        for(int i = a; a >= 1; a--){
//            System.out.println("hello!" + a);
//        int a = in.nextInt();
//        int i = 1;
//        for(int o = a; i < 10; i++){
//            int s = a * i;
//            System.out.printf("%d * %d = %d\n", a, i, s);
//        }
//        while (true){
//
//        int k = in.nextInt();
//            if(k < 0){
//                break;
//            }
//            for(int i = 1; i <= 10; i++){
////            System.out.printf("%d * %d = %d\n", k, i, i*k);
//            System.out.println(k+ " * " +i+ " = " + k*i);
//
//        }
////        }
//        int a = in.nextInt();
//
//        for(int i = 10; i >= 1; i--){
//            System.out.println(i * i);
//        }


//        array
//        System.out.println(" Theme - Array !");
//        System.out.println();
//        char[] symbols = {'a', 'f', 's'};
//
//        String[] words = {"Java", "Java-2", "Java-3", "Java-4", "Java-5"};
//
//        int[] variant1 = {5,15,25,35};
//        int[] variant2 = new int[]{5,15,25,35};
//        int[] variant3 = new int[9];
//
//
//
//        int[] numbers = {1,2,3,4,5,6,7,8,9};
//        char[] symbol = {'c', '1', '$', '%', '*'};
//        char[] symbol1 = new char[5];

//        System.out.println(symbol[2]);
//
//        int[] array = {11,12,13,14,15,16,17,18,19,20, 21};
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
//
//        String[] names = {"a2","a4","a5","a6","a7","a8","a9","a3","a1","a0"};
//        for (int i = 0; i < names.length; i++) {
//            System.out.print(names[i] + ", ");
//            System.out.println(" ");
//        }
//        int k = 0;
//        while(k < array.length){
//            System.out.println(array[k] + " - array");
//            k++;
//        }
//
//        System.out.println(Arrays.toString(array));
        Random random1 = new Random();
//        int[] numbers = new int[3];
//
//        for (int i = 0; i < numbers.length; i++) {
//            int randomNumbers = random1.nextInt(0, 2);
//            numbers[i] = randomNumbers;
//            System.out.println(numbers[i]);
//
//        }
//
//
//        int[] num10 = new int[10];
//        int sum = 0;
//
//        for (int i = 0; i < num10.length; i++) {
//            num10[i] = random1.nextInt(1, 11);
//            System.out.printf("%d ", num10[i]);
//            sum = sum + num10[i];
//            }
//        System.out.printf(" = %d,", sum / num10.length);
//        System.out.println("insert num");
//
//        int consol = in.nextInt();
//        int[] array = new int[consol];
//        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random1.nextInt(1, 20);
//            sum = sum + array[i];
//            System.out.print(array[i] + " ");
//        }
//        System.out.printf(" = %d", sum);
//        homework
//        int[] first_array = {11,22,33,44,55,66,77,88,99};
//        int[] final_array = new int[9];
//
//        for (int i = 0; i < first_array.length; i++) {
//            final_array[i] = first_array[i];
//            System.out.println(final_array[i]);
//        }

//        int[] array = new int[3];
//        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random1.nextInt(1, 3);
//            sum = sum + array[i];
//            System.out.println(array[i]);
//            if(num == array[i]) {
//                System.out.println();
//            } else {
//                System.out.println("такого числа нет в массиве!");
//            }
//        }
//        int num = in.nextInt();
//        for (int i = 0; i < args.length; i++) {
//            if(num == array[i]){
//                System.out.println("good job");
//                // метод для поиска индекса элемента
//            } else {
//                System.out.println("Такого числа нет в массиве");
//            }
//        }
//        String[] array = {"Абу-Али", "Айдана", "Айназик", "Алмаз", "Алтынбек", "Алибек", "Байтик", "Байыш", "Барпыбек", "Барсбек", "Бегайым", "Бекболсун", "Бекнур", "Давран", "Дастан", "Динмухамед", "Женишбек", "Илим", "Ильяз", "Каныкей", "Келдибек", "Курстан", "Лира", "Манас", "Мирлан", "Мухаммед", "Наби", "Нурадил", "Нурали", "Нурислам", "Нурлан", "Нурсейит", "Нурсултан", "Салтанат", "Салымбек", "Самира", "Санжар", "Санжар", "Султан", "Сыймык", "Темир", "Темирлан", "Хафиз", "Ырыскелди", "Эркинбек", "Эрлан"};
//        String[] array_new = new String[array.length];
//        int a = random1.nextInt();
//        for (int i = 0; i < array.length; i++) {
//            array_new[i] = array[i];
//            a = random1.nextInt(0, 46);
//            System.out.println(array_new[i]);
//            if(array_new[a] != null){
//                System.out.println(array_new[a]);
//                break;
//            }
//        }

//        nameAge(in.next(), in.nextInt());
//        int[] massive = new int[5];
//        for (int i = 0; i < massive.length; i++) {
//            massive[i] = random1.nextInt(5,10);
//            System.out.println(massive[i]);
//        }
//        System.out.println(cifry(in.nextInt(), random1.nextInt(1,5)));
//        int[] mass = new int[10];
//        for (int i = 0; i < mass.length; i++) {
//            mass[i] = in.nextInt();
//        }
//        for (int i = 0; i < mass.length; i++) {
//            System.out.println(mass[i]);
//        }
//    }
//    public static boolean cifry(int a, int b){
//        if(a == b){
//            return true;
//        } else {
//            return false;
//        }
//    }
//    public void method(int[] massive, int n){
//
//    }
//
//    public static void nameAge(String name, int age){
//        System.out.println(name + ": " + age);
//    }

//    public static int massive(int[] m){
//        int x2 = 0;
//        for (int i = 0; i < m.length; i++) {
//
//        }


//     method(1,23,3,4,5,6,7);

//        int[] massive = {1,2,3,4,5,6,7,8,9};
//        for (int array:massive) {
//            System.out.println(array);
//        }
//        foreach работает только с массивами
//        String[] java = {"asd","asd","asd","asd","asd"};
//        for (String array : java) {
//            System.out.println(array);
//        }
//        int a = 0;
//        for (int i : massive) {
//            a +=i;
//
//        }
//        System.out.println(a);
//        System.out.println(a);
//        String[] names = {"m", "a", "s", "w", };
//        manas(names);



        String word = "java hello 8";
        String word2 = "Hey";
//        System.out.println(word.charAt(0)); - возвращ-т символ по индексу
//        System.out.println(word.substring(1,3)); - возвр-т символы м-у индексами 1 и 3
//        System.out.println(word.substring(2)); - возвр-т символы после индекса 2
//        System.out.println(word.contains("a")); - проверка на наличие буквы "а" в слове Java
//        System.out.println(word.toUpperCase()); - вывод в верхнем регистре
//        System.out.println(word.toLowerCase()); //- вывод в нижнем регистре
//        System.out.println(word.trim()); //- убирает пробелы по бокам
//        System.out.println(word.equals("java")); //- сравнение
//        System.out.println(word.equals(word2)); //- сравнение
//        System.out.println(word.replace("java", "js")); //- замена имеющегося слова
//        System.out.println(word.length());
//        System.out.println(word.concat(" hello-7 ")); // присоединяет слово к концу word




    }






//    public static void manas(String ...s){
//        for (String n: s) {
//            System.out.println("I love you " + n);
//        }
//    }
//    public static void method(int ... numbers){
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }
//    }
    public static void mana(){}
}