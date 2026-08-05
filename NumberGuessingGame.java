import java.util.*;
public class NumberGuessingGame
{
    int number = (int)(Math.random() * 100 + 1);
    Scanner scan = new Scanner(System.in);
    int input;
    boolean exit = false;
    String answer;
    public void main()
    {
        System.out.println("Guess My Number (From 1-100)!!!");
        answer = scan.nextLine();
        while(!exit)
        {
            try
            {
                input = Integer.parseInt(answer);
                if(number != input)
                {
                    if(input < number)
                    {
                        System.out.println("Your guess was too low");
                    }
                    else
                    {
                        System.out.println("Your guess was too high");
                    }
                    System.out.println("Guess again or type 'EXIT' to exit.");
                }
                else
                {
                    number = (int)(Math.random() * 100 + 1);
                    System.out.println("Congratulations! You got it!");
                    System.out.println("Computer thought of a new number. Type a new number if you want to keep playing or type 'EXIT' to exit.");
                }
                answer = scan.nextLine();
            }
            catch(Exception e)
            {
                System.out.println("Try again, that was not an integer. If you are done playing, type 'EXIT' to exit.");
                answer = scan.nextLine();
            }
            if(answer.equals("exit") || answer.equals("Exit") || answer.equals("EXIT"))
            {
                exit = true;
            }
        }
        System.out.println("Thanks for playing");
    }
}