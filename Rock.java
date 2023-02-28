import java.util.*;
class Rock
  {
    final static int Rock = 1, Scissor = 2, Paper = 3;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Player 1: Choose (1) - Rock, (2) - Scissors, or (3) - Paper: ");
        int player1 = sc.nextInt();
        System.out.println("Player 2: Choose (1) - Rock, (2) - Scissors, or (3) - Paper: ");
        int player2 = sc.nextInt();
     
        if (player1 == player2)
        {
            System.out.print("It is a tie");
        } else {
            switch (player1){
            case Rock:
                if (player2 == Scissor)
                    System.out.print("Player 1 wins!");
                else
                    System.out.print("Player 2 wins!");
                break;
            case Scissor:
                if (player2 == Paper)
                    System.out.print("Player 1 wins!");
                else
                    System.out.print("Player 2 wins!");
                break;
            case Paper:
                if (player2 == Rock)
                    System.out.print("Player 1 wins!");
                else
                    System.out.print("Player 2 wins!");
                break;
            }
        }
    }
  }