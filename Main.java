import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);  // input from the keyboard
    /* ============= BEGIN SOLUTION ================================ */
    
    // problem 1
    System.out.println("please enter a double for testing");
    double tester = scan.nextDouble();
    if(tester == 12.345)
    {
      System.out.println("YES");
    }

    // problem 2
    System.out.println("please enter an integer for testings");
    int test2 = scan.nextInt();
    if (test2 == 48)
    {
      System.out.println("YES");
    }

    // problem 3
    System.out.println("please enter two integers");
    int t1 = scan.nextInt();
    int t2 = scan.nextInt();
    if (t2 == (2*t1))
    {
      System.out.println("YES");
    }

    // problem 4
    System.out.println("please enter an integer");
    int divTest = scan.nextInt();
    if((divTest % 2) == 0)
    {
      System.out.println("Divisible by 2!");
    }
    if((divTest % 3) == 0)
    {
      System.out.println("Divisible by 3!");
    }

    // problem 5
    System.out.println("please enter a int for some testing");
    int oddEven = scan.nextInt();
    if((oddEven % 2) == 0)
    {
      System.out.println("even");
    }
    else
    {
      System.out.println("odd");
    }

    // problem 6
    System.out.println("Please enter a letter grade");
    scan.nextLine();
    String grade = scan.nextLine();
    if (grade == "A")
    {
      System.out.println("90 - 100");
    }
    else
    {
      if (grade == "B")
      {
        System.out.println("80 - 89");
      }
      else
      {
        if(grade == "C")
        {
          System.out.println("70-79");
        }
        else
        {
          if(grade == "D")
          {
            System.out.println("60-69");
          }
          else
          {
            if(grade == "F")
            {
              System.out.println("0-59");
            }
            else
            {
              System.out.println("invalid letter grade");
            }
          }
        }
      }
    }

    // problem 7
    int num1 = (int)(Math.random()*50);
    int num2 = (int)(Math.random()*49) + 51;
    System.out.println(num1 + " + " + num2 + " = ?");
    int sum = scan.nextInt();
    if (sum == (num1 + num2))
    {
      System.out.println("Correct!");
    } 
    else
    {
      System.out.println("Wrong");
    }

    // problem 8 
    System.out.println("What is the temperature?");
    int temp = scan.nextInt();
    if ((temp >= 97) && (temp <=99))
    {
      System.out.println("Temperature is OK");
    }
    else
    {
      System.out.println("NOT NORMAL");
    }
    /* ============= END SOLUTION ================================== */
    scan.close();
  }
}
