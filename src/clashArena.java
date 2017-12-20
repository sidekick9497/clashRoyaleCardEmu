import java.util.ArrayList;
import java.util.Scanner;

public class clashArena {
     protected static int options()
    {
        System.out.println("choose the action you want to perform");
        System.out.println("1. Add card  \n 2.select card \n 3.exit");
        Scanner choice = new Scanner(System.in);
        return choice.nextInt();

    }
    public static int userInput()
    {
        Scanner choice = new Scanner(System.in);
        return choice.nextInt();

    }

    protected static int cardOperation(String name)
    {
        System.out.println(" hurray, you have selected the : " + name);
        System.out.println(" what do you want to do, \n 1.show level \n 2. show number of cards \n 3.updrade your card \n 4. add cards");
        Scanner operationScanner = new Scanner(System.in);
         return operationScanner.nextInt();
    }

    public static int showCards(ArrayList<ClashRoyaleCard> theCardList) {
         System.out.println("the following cards are available");
         int i = 1;
         for(ClashRoyaleCard card : theCardList)
         {
             System.out.println(i + " " + card.name);
             i+=1;
         }
         Scanner selectionScanner = new Scanner(System.in);
          return selectionScanner.nextInt();
    }
}
