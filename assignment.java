import java.util.Scanner;

public class assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Full Name and Greeting
        System.out.print("Enter your full name: ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");

        // 2. Sum, Difference, Product, Quotient
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println("Sum: " + (a + b));
        System.out.println("Difference: " + (a - b));
        System.out.println("Product: " + (a * b));
        if (b != 0) System.out.println("Quotient: " + (a / b));
        else System.out.println("Cannot divide by zero.");

        // 3. Positive, Negative, or Zero
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num > 0) System.out.println("Positive");
        else if (num < 0) System.out.println("Negative");
        else System.out.println("Zero");

        // 4. Divisible by 5 and 11
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        if (num % 5 == 0 && num % 11 == 0) System.out.println("Divisible by both 5 and 11");
        else System.out.println("Not divisible by both");

        // 5. Largest of 3 numbers
        System.out.print("Enter three numbers: ");
        int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
        if (x >= y && x >= z) System.out.println(x + " is the largest");
        else if (y >= x && y >= z) System.out.println(y + " is the largest");
        else System.out.println(z + " is the largest");

        // 6. Even or Odd
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        System.out.println(num % 2 == 0 ? "Even" : "Odd");

        // 7. Voting Eligibility
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.println(age >= 18 ? "Eligible to vote" : "Not eligible");

        // 8. Vowel or Consonant
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        if ("aeiouAEIOU".indexOf(ch) != -1) System.out.println("Vowel");
        else System.out.println("Consonant");

        // 9. Marks and Grade
        int total = 0;
        System.out.print("Enter marks of 5 subjects: ");
        for (int i = 0; i < 5; i++) total += sc.nextInt();
        double percentage = total / 5.0;
        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage);
        if (percentage >= 90) System.out.println("Grade A");
        else if (percentage >= 80) System.out.println("Grade B");
        else if (percentage >= 70) System.out.println("Grade C");
        else if (percentage >= 60) System.out.println("Grade D");
        else System.out.println("Grade F");

        // 10. Leap Year
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) System.out.println("Leap Year");
        else System.out.println("Not a Leap Year");

        // 11. Prime Number
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        boolean isPrime = num > 1;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime ? "Prime" : "Not Prime");

        // 12. Multiplication Table
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        for (int i = 1; i <= 10; i++) System.out.println(num + " x " + i + " = " + (num * i));

        // 13. Sum of first n natural numbers
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        System.out.println("Sum: " + sum);

        // 14. All even numbers from 1 to 100
        for (int i = 2; i <= 100; i += 2) System.out.print(i + " ");
        System.out.println();

        // 15. Factorial
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        long fact = 1;
        for (int i = 1; i <= num; i++) fact *= i;
        System.out.println("Factorial: " + fact);

        // 16. Calculator using switch
        System.out.print("Enter two numbers: ");
        a = sc.nextInt(); b = sc.nextInt();
        System.out.print("Enter operator (+ - * /): ");
        ch = sc.next().charAt(0);
        switch (ch) {
            case '+': System.out.println("Result: " + (a + b)); break;
            case '-': System.out.println("Result: " + (a - b)); break;
            case '*': System.out.println("Result: " + (a * b)); break;
            case '/': System.out.println(b != 0 ? "Result: " + (a / b) : "Divide by zero error"); break;
            default: System.out.println("Invalid operator");
        }

        // 17. Day of the week
        System.out.print("Enter day number (1-7): ");
        int day = sc.nextInt();
        switch (day) {
            case 1: System.out.println("Sunday"); break;
            case 2: System.out.println("Monday"); break;
            case 3: System.out.println("Tuesday"); break;
            case 4: System.out.println("Wednesday"); break;
            case 5: System.out.println("Thursday"); break;
            case 6: System.out.println("Friday"); break;
            case 7: System.out.println("Saturday"); break;
            default: System.out.println("Invalid");
        }

        // 18. Days in a month
        System.out.print("Enter month number (1-12): ");
        int month = sc.nextInt();
        switch (month) {
            case 2: System.out.println("28 or 29 days"); break;
            case 4: case 6: case 9: case 11: System.out.println("30 days"); break;
            default: System.out.println("31 days");
        }

        // 19. Vowel using switch
        System.out.print("Enter a character: ");
        ch = sc.next().charAt(0);
        switch (ch) {
            case 'a': case 'e': case 'i': case 'o': case 'u':
            case 'A': case 'E': case 'I': case 'O': case 'U':
                System.out.println("Vowel"); break;
            default: System.out.println("Not a vowel");
        }

        // 20. Perfect Square
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        boolean isPerfectSquare = false;
        for (int i = 1; i * i <= num; i++) {
            if (i * i == num) {
                isPerfectSquare = true;
                break;
            }
        }
        System.out.println(isPerfectSquare ? "Perfect Square" : "Not a Perfect Square");

        // 21. Sum of Digits
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        sum = 0;
        int temp = num;
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        System.out.println("Sum of digits: " + sum);

        // 22. Reverse a number
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        int rev = 0;
        temp = num;
        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        System.out.println("Reversed: " + rev);

        // 23. Palindrome check
        System.out.println(num == rev ? "Palindrome" : "Not a Palindrome");

        // 24. Fibonacci series
        System.out.print("Enter number of terms: ");
        n = sc.nextInt();
        int f1 = 0, f2 = 1;
        System.out.print("Fibonacci: " + f1 + " " + f2);
        for (int i = 3; i <= n; i++) {
            int f3 = f1 + f2;
            System.out.print(" " + f3);
            f1 = f2;
            f2 = f3;
        }
        System.out.println();

        // 25. Count digits
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        int count = 0;
        temp = num;
        while (temp != 0) {
            count++;
            temp /= 10;
        }
        System.out.println("Number of digits: " + count);
    }
}
