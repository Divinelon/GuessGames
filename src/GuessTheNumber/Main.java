package GuessTheNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int guesses = 10;
        System.out.println("I've randomly chosen a number between [1 , 100]" + "\n" + "Try to guess it." + "\n" + "You have " + guesses + " guess(es) left: ");
        int randomNumber = (int)(Math.random() * 100) + 1;
        int userPrediction = 0;

        while(userPrediction!= randomNumber){
            userPrediction = Integer.parseInt(reader.readLine());
            if(userPrediction > 100 || userPrediction < 1)
            {
                try {
                    throw new Exception("I told you range [1,100]");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            if (userPrediction == randomNumber) {
                System.out.println("Correct , you win!");
                break;
            }
            else if (guesses == 1){
                System.out.println("You lost , out of guess(es)" + "\n" + "The number was " + randomNumber);
                break;
            }

            else {
                if (userPrediction < randomNumber) {
                    System.out.println("It's greater than " + userPrediction + "\n" + "You have " + --guesses + " guess(es) left: ");
                }
                else if (userPrediction > randomNumber) {
                    System.out.println("It's smaller than " + userPrediction + "\n" + "You have " + --guesses + " guess(es) left: ");
                }
                continue;
            }
        }
    }
}
