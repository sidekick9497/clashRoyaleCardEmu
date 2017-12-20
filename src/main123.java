import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main123 {
    public static void main(String args[])
    {
        ArrayList<ClashRoyaleCard> theCardList = new ArrayList<ClashRoyaleCard>();
        boolean flag = true;
        while(flag) {
            int myChoice = clashArena.options();
            System.out.println("you have chose :" + myChoice);
            switch (myChoice)
            {

                case 1 :
                    System.out.println("welcome to the interactive card creator \n Enter the awesome name for your card ");
                    Scanner myScanner  = new Scanner(System.in);
                     ClashRoyaleCard awesomeCard = new ClashRoyaleCard((String)myScanner.next()) ;
                     theCardList.add(awesomeCard);
                     System.out.println("congrats your : " + awesomeCard.name +" card has been created..booom");
                     break;
                case 2:
                    if(theCardList.isEmpty())
                    {
                        System.out.println("oops no cards are available, go and create one,,,,,,");
                    }
                    else {

                       myChoice=  clashArena.showCards(theCardList);
                        int index = clashArena.cardOperation(theCardList.get(myChoice-1).name);
                        switch (index)
                        {
                            case 1:
                                theCardList.get(myChoice-1).getLevel();
                                break;
                            case 2:
                                theCardList.get(myChoice-1).getNumCards();
                                break;
                            case 3:
                                System.out.println("upgrade");
                                theCardList.get(myChoice-1).upgrade();
                                break;
                            case 4:
                                System.out.println("enter number of cards to add.");

                               theCardList.get(myChoice-1).addCards(clashArena.userInput());
                                break;
                        }
                    }
                    break;


                case 3:
                    flag = false;
                    break;

            }



        }
        System.out.println("thanks for playing");

        }
}

