public class Main {
    /**
     * Первое задание, вариант 4
     * Дано целое число N (1 ≤ N ≤ 26). Вывести N первых прописных (т. е. заглавных) букв латинского алфавита.
     **/
    public static void task1() {
        char firstLetter = 'A';
        int n = 24;
        for (int i = 0; i < n; i++) {
            System.out.printf("%c ", firstLetter + i);
        }
    }

    /**
     * Второе задание, вариант 27
     * Даны целые положительные числа N1 и N2 и строки S1 и S2.
     * Получить из этих строк новую строку, содержащую первые N1 символов строки S1 и
     * последние N2 символов строки S2
     * (в указанном порядке).
     **/
    public static void task2() {
        int n1 = 4;
        int n2 = 4;
        String s1 = "Hello world!";
        String s2 = "It`s a nice day!";
        String res = s1.substring(0, n1).concat(s2.substring(s2.length() - n2));
        System.out.println("String result: " + res);


    }

    /**
     * Третье задание, вариант 50
     * Дана строка, состоящая из слов кириллицей, разделенных пробелами (одним или несколькими). Вывести строку, содержащую эти же слова, разделенные одним пробелом и расположенные в обратном порядке.
     **/
    public static void task3() {
        String str = "Привет   мир   это строка           !";
        str = str.replaceAll("\\s{2,}", " ");
        String[] strings = str.split(" ");
        String[] tempStrings = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            tempStrings[i] = strings[strings.length - i - 1];
        }
        System.out.println(String.join(" ", tempStrings));

    }

    public static void main(String[] args) {
        System.out.println("\nTask 4");
        task1();
        System.out.println("\n\nTask 27");
        task2();
        System.out.println("\nTask 50");
        task3();
    }

}