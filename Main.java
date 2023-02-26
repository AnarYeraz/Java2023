import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Введите ваше имя");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Здравствуйте" + name);
        for(int i = 0; i <= 45; i+=5){
            var result = Math.toRadians(i);
            System.out.println("Градусы" + i + " - " + "Значение косинуса " + result);
        }
    }
}
