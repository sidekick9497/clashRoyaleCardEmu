public class ClashRoyaleCard {
    public String name;
    private int level;
    private int numCards;
    private int requiredCards;
    ClashRoyaleCard()
    {
        this.name = "generic card";
        this.level = 1;
        this.numCards = 1;
        this.requiredCards = 2;
    }
    ClashRoyaleCard(String name) {
        this.name = name;
        this.level = 1;
        this.numCards = 1;
        this.requiredCards = 2;
    }
    void addCards(int cards)
    {
        this.numCards += cards;
        System.out.println("the number of cards now available is : " + this.numCards);
    }
    void getNumCards()
    {
        System.out.println("the number of cards are : " + this.numCards);
    }
    void getLevel() {
        System.out.println("the level of the card is : " + this.level);
    }
    void upgrade()
    {
        if(this.numCards >= this.requiredCards)
        {
            this.level+=1;
            this.requiredCards += (this.level+1) * 2;
            this.numCards = 0;
            System.out.println("the card has been succesfully upgraded to level :" + this.level);
        }
        else
        {
            System.out.println("sorry, you dont have enough cards to upgrade");
        }
    }
    }

