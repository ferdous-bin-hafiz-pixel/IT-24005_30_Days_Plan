import java.util.Scanner;



public class HarshadNumber {

&#x20;   public static void main(String\[] args) {

&#x20;       Scanner sc = new Scanner(System.in);



&#x20;       System.out.print("Enter a number: ");

&#x20;       int num = sc.nextInt();



&#x20;       int original = num;

&#x20;       int sum = 0;



&#x20;       // Calculate sum of digits

&#x20;       while (num > 0) {

&#x20;           int digit = num % 10;

&#x20;           sum += digit;

&#x20;           num /= 10;

&#x20;       }



&#x20;       if (original % sum == 0) {

&#x20;           System.out.println(original + " is a Harshad Number");

&#x20;       } else {

&#x20;           System.out.println(original + " is NOT a Harshad Number");

&#x20;       }

&#x20;   }

}

