package Tandem;
import java.util.Scanner;
public class EvenSeries {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number (a): ");
            int a = scanner.nextInt();
            for (int i = 1; i <= a; i++) {
                int current = (i % 2 == 0) ? i - 1 : i;
                int num = 1;
                for (int j = 1; j <= current; j++) {
                    System.out.print(num);
                    if (j < current) {
                        System.out.print(", ");
                    }
                    num += 2;
                }
                System.out.println();
            }
            scanner.close();
        }
    }









