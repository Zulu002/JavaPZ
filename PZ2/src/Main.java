import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите число >> ");
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//        int num3 = sc.nextInt();
//        System.out.println("произведение >> "+num1 * num2 * num3);
//
//        System.out.println("Введите время движения ");
//        int time = sc.nextInt();
//        System.out.println("Введите скорость ");
//        int speed = sc.nextInt();
//        System.out.println("Пройденный путь"+time * speed);
//
//        System.out.println("Введите целое число ");
//        int a = sc.nextInt();
//        System.out.println("The next number for the number" + a + " is " + (a+1) );
//        System.out.println("The previous number for the number" + a + " is " + (a-1) );
//
//        System.out.println("Введите длинну ");
//        int weigh = sc.nextInt();
//        System.out.println("Введие ширину ");
//        int heigh = sc.nextInt();
//        System.out.println("Периметр "+((weigh * heigh)*2));
//        System.out.println("Площадь "+(weigh * heigh));

//        System.out.println("Введите чило ");
//        int m = sc.nextInt();
//        System.out.println("Следующее чётное число " + (m / 2 * 2 +2));

//        System.out.println("Введите сколько рублей стоит приожок ");
//        int r = sc.nextInt();
//        System.out.println("Введите сколько копеек стоит приожок ");
//        int k = sc.nextInt();
//        System.out.println("Введите колличество пиражков ");
//        int kol = sc.nextInt();
//        System.out.println("Итоговая сумма "+r*kol+" р "+k*kol+" коп");

//        System.out.println("Введите число ");
//        int count = sc.nextInt();
//        System.out.println("Последнее число "+ count%10);

//        System.out.println("Введите число ");
//        int count = sc.nextInt();
//        int sum = 0;
//        while(count != 0){
//            sum += count % 10;
//            count/=10;
//        }
//        System.out.println("Сумма цифр числа "+ sum);




//        System.out.println("Введите t ");
//        int t = sc.nextInt();
//        System.out.println("Введите v ");
//        int v = sc.nextInt();
//        if(v > 0){
//            System.out.println( (t*v)%109);
//        }
//        else{
//            System.out.println( (t*v)% -109);
//        }

        System.out.println("Введите h ");
        int h = sc.nextInt();
        System.out.println("Введите a ");
        int a = sc.nextInt();
        System.out.println("Введите b ");
        int b = sc.nextInt();
        if(a>b){
            System.out.println((h-a)-1/(a-b)+1+1);
        }

    }
}