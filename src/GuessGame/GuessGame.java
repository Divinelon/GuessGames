package GuessGame;

public class GuessGame {
Player p1;
Player p2;
Player p3;

public void startGame(){
    p1 = new Player();
    p2 = new Player();
    p3 = new Player();

    int guessesP1 = 0;
    int guessesP2 = 0;
    int guessesP3 = 0;



    boolean isRightP1 = false;
    boolean isRightP2 = false;
    boolean isRightP3 = false;

    int numberToguess = (int)(Math.random() * 10);
    System.out.println("I've chosen a number from 0 to 9");

    while(true)
    {
        System.out.println("The number which you have to guess is " + numberToguess);
        p1.guess();
        p2.guess();
        p3.guess();

        guessesP1 = p1.number;
        System.out.println("First player thinks that is a " + guessesP1);
        guessesP2 = p2.number;
        System.out.println("Second player thinks that is a " + guessesP2);
        guessesP3 = p3.number;
        System.out.println("Third player thinks that is a " + guessesP3);

        if(guessesP1 == numberToguess)
        {
            isRightP1 = true;
        }
        if(guessesP2 == numberToguess)
        {
            isRightP2 = true;
        }
        if(guessesP3 == numberToguess)
        {
            isRightP3 = true;
        }

        if(isRightP1 || isRightP2 || isRightP3){
            System.out.println("We have a winer!");
            System.out.println("First player win?" + isRightP1);
            System.out.println("Second player win?" + isRightP2);
            System.out.println("Third player win?" + isRightP3);
            System.out.println("The end of the game");
            break;
        }
        else
            System.out.println("The gamers should try again");

    }

}
}
