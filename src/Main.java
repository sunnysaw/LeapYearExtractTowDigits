/*
Question : Write a program to check whether the given year is leap year or not and also extract two digits from the
           given year.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int year,a = 1, temp,sum = 0,product = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year to check leap year :");
        year = sc.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("Leap year : " + year);
        }else
            System.out.println("Not a leap year : " + year);
        System.out.println();
        System.out.println("Now, printing the Extract value :");
        while (a <= 2){
            temp = year % 10;
            sum=sum+product*temp;
            product*=10;
           a++;
            year = year / 10;
        }
        System.out.println(sum);
    }
}