package be.ac.umons;

public class Money {

    private int amount;
    private String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public int amount() {

        return this.amount;
    }

    public String currency(){

        return this.currency;
    }



    /**
     *
     *
     * Question 2 : Création de la méthode add(Money m) qui retourne un objet Money
     *
     *
     */



    /**
     *
     *
     * Question 2 : Le retour de cette fonction sera un objet Money; Voir le "comment 10"
     *
     */


    public Money add(Money money) throws Exception{

        /**
         *  Comment 10 /
         *
         *  return this.add(new Money(namount, currency));
         */
        return null;
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }

}
