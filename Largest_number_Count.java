import java.util.Scanner;

class Largest_number_Count {
     public static void main(String[] args) {
         int x,y,z,a,largest;
         Scanner input = new Scanner(System.in);
         System.out.println("Enter your first number: ");
         x= input.nextInt();
         System.out.println("Enter your 2nd number: ");
         y = input.nextInt();
         System.out.println("Enter your 3rd number: ");
         z = input.nextInt();
         System.out.println("Enter your 4rd number: ");
         a = input.nextInt();
         input.close();
         if( x > y && x > z && x>a )
         largest = x;
         else if( y > x && y > z && y > a )
         largest = y;
         else if ( a > x && a>y && a>z)
            largest = a;
         else
             largest = z;
         System.out.printf("largest Number among %d %d %d and %d is %d",x,y,z,a,largest);
     }

}
