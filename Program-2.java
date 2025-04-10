package Tandem;
import java.util.Scanner;
public class SeriesOFNumber
{
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number (a): ");
            int a = scanner.nextInt();
            for (int i = 1; i <= a; i++) {
                int num = 1;
                for (int j = 1; j <= i; j++) {
                    System.out.print(num + " ");
                    num = num + 2;
                }

                // Move to the next line after each row
                System.out.println();
            }
        }
    }



