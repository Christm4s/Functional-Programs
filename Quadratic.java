import java.util.Scanner;

class Quadratic

{

    public static void main(String[] args)

      {

        int a, b, c;

        double root1, root2, delta;

        Scanner s = new Scanner(System.in);

        System.out.println("Given quadratic equation:ax^2 + bx + c");

        System.out.print("Enter a:");

        a = s.nextInt();

        System.out.print("Enter b:");

        b = s.nextInt();

        System.out.print("Enter c:");

        c = s.nextInt();

        System.out.println("Given quadratic equation:"+a+"x^2 + "+b+"x + "+c);

        delta = b * b - 4 * a * c;

        if(delta > 0)

        {

            System.out.println("Roots are real and unequal");

            root1 = ( - b + Math.sqrt(delta))/(2*a);

            root2 = (-b - Math.sqrt(delta))/(2*a);

            System.out.println("First root is:"+root1);

            System.out.println("Second root is:"+root2);

        }

        else if(delta == 0)

        {

            System.out.println("Roots are real and equal");

            root1 = (-b+Math.sqrt(delta))/(2*a);

            System.out.println("Root:"+root1);

        }

        else

        {

            System.out.println("Roots are imaginary");

        }

    }

}