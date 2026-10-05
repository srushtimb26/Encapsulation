package HelloWorld;

import java.util.Scanner;

class Employee
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String name;
        int age;
        int choice;

        do
        {
            System.out.println("\n1. Create");
            System.out.println("2. Display");
            System.out.println("3. Raise");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.print("Enter your Name: ");
                    name = sc.next();

                    System.out.print("Enter your Age: ");
                    age = sc.nextInt();

                    System.out.println("Employee Created");
                    break;

                case 2:
                    System.out.println("Display Employee");
                    break;

                case 3:
                    System.out.println("Salary Raised");
                    break;

                case 4:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Wrong Choice");
            }

        } while(choice != 4);

        sc.close();
    }
}