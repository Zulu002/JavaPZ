import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Введите строку 1 ");
//        String line1 = sc.nextLine();
//        System.out.print("Введите строку 2 ");
//        String line2 = sc.nextLine();
//        System.out.print("Введите строку 3 ");
//        String line3 = sc.nextLine();
//        if(line1.equals(line2) && line1.equals(line3)){
//            System.out.print("Yes");
//        }
//        else{
//            System.out.print("No");
//        }


//        System.out.print("Введите вещественное число 1 ");
//        double count1 = sc.nextDouble();
//        System.out.print("Введите вещественное число 2 ");
//        double count2 = sc.nextDouble();
//        System.out.print("частное двух чисел " + (count1/count2));

//        System.out.print("Введите количество пирожков  ");
//        int countP = sc.nextInt();
//        if(countP / 2 > 10){
//            System.out.print("Лесничий выгоднее останется"+(countP - 10));
//        }
//        else{
//            System.out.print("Волк выгоднее останется"+(countP / 2));
//        }


//        System.out.print("Введите часы ");
//        int h = sc.nextInt();
//        System.out.print("Введите минуты ");
//        int m = sc.nextInt();
//        System.out.print("назначенное время ");
//        int x = sc.nextInt();
//        int sumS= (h*3600) + (m*60);
//        if (x > sumS){
//            System.out.print("опоздал");
//        }
//        else{
//            System.out.print("успел");
//        }

//        System.out.print("Введите 3 числа ");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        if (a > b && a > c){
//            System.out.print("число a больше");
//        }
//        else if (b >a && a > c) {
//            System.out.print("число b больше");
//        }
//        else  {
//            System.out.print( "число c больше");
//        }


//        System.out.print("Введите год ");
//        int y = sc.nextInt();
//        if (y % 4  != 0 && y % 100 != 0 || y % 400 == 0){
//            System.out.print("год високосный");
//        }
//        else{
//            System.out.print("год не високосный");
//        }

//        System.out.print("Введите строку 1 ");
//        String line1 = sc.nextLine();
//        System.out.print("Введите строку 2 ");
//        String line2 = sc.nextLine();
//        System.out.print("Введите строку 3 ");
//        String line3 = sc.nextLine();
//        if(line1.equals(line2) || line1.equals(line3) || line2.equals(line3)){
//            System.out.print("Yes");
//        }
//        else{
//            System.out.print("No");
//        }

//        int n = sc.nextInt(); // Ширина шоколадки
//        int m = sc.nextInt(); // Высота шоколадки
//        int k = sc.nextInt(); // Количество долек для отлома
//
//        // Проверяем, можно ли отломить k долек
//        if (k % n == 0 || k % m == 0) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }

//        System.out.print("Введите ваш возраст: ");
//        int age = sc.nextInt();
//        String result = (age >= 18) ? "Совершеннолетний" : "Несовершеннолетний";
//        System.out.println("Вы " + result);

//        System.out.print("Введите длину первого катета: ");
//        double a = sc.nextDouble();
//        System.out.print("Введите длину второго катета: ");
//        double b = sc.nextDouble();
//        double c = Math.sqrt(a * a + b * b);
//        System.out.println("Гипотенуза треугольника: " + c);


//        System.out.print("Введите длину первой стороны: ");
//        int side1 = sc.nextInt();
//        System.out.print("Введите длину второй стороны: ");
//        int side2 = sc.nextInt();
//        System.out.print("Введите длину третьей стороны: ");
//        int side3 = sc.nextInt();
//        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
//            System.out.println("Yes, треугольник существует");
//        }
//        else {
//            System.out.println("No, треугольник не существует");
//        }

//        System.out.print("Введите число n: ");
//        int n = sc.nextInt();
//        String result = "";
//        if (n % 10 == 1 && n % 100 != 11) {
//            result = "корова";
//        } else if (n % 10 >= 2 && n % 10 <= 4 && (n % 100 < 10 || n % 100 >= 20)) {
//            result = "коровы";
//        } else {
//            result = "коров";
//        }
//        System.out.println("На лугу пасется "+n + " " + result);

//        System.out.print("Введите число k (количество котлет на сковородке): ");
//        int k = sc.nextInt();
//        System.out.print("Введите число m (время обжаривания одной стороны котлеты в минутах): ");
//        int m = sc.nextInt();
//        System.out.print("Введите число n (количество котлет, которые нужно обжарить): ");
//        int n = sc.nextInt();
//        int cycles = (n + k - 1) / k;
//        int totalTime = cycles * 2 * m;
//        System.out.println("Общее время для обжаривания всех котлет: " + totalTime + " минут");

//        System.out.print("Введите первое число a: ");
//        int a = sc.nextInt();
//        System.out.print("Введите второе число b: ");
//        int b = sc.nextInt();
//        System.out.print("Введите третье число c: ");
//        int c = sc.nextInt();
//
//        if (a > b) {
//            int temp = a;
//            a = b;
//            b = temp;
//        }
//        if (b > c) {
//            int temp = b;
//            b = c;
//            c = temp;
//        }
//        if (a > b) {
//            int temp = a;
//            a = b;
//            b = temp;
//        }
//        System.out.println("Тройка чисел в порядке неубывания: " + a + " " + b + " " + c);

        System.out.print("Введите число (1 <= x <= 100): ");
        int x = sc.nextInt();
        if (x < 1 || x > 100) {
            System.out.println("Число должно быть в диапазоне от 1 до 100.");
        } else {
            String roman = intToRoman(x);
            System.out.println("Римское представление числа " + x + " : " + roman);
        }
    }

    public static String intToRoman(int num) {
        String[] thousands = {"", "M", "MM", "MMM"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        return thousands[num / 1000] + hundreds[(num % 1000) / 100] + tens[(num % 100) / 10] + ones[num % 10];
    }


}