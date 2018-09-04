package GuessTheMovie;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Game   {

private String rightletters ;
private String wrongletters  ;
private int points;
private boolean winchecker;
private String movieToGuess;

    public Game() {
       MovieList list = new MovieList();
        rightletters = "";
        wrongletters = "";
        points = 0;
        winchecker = false;
        movieToGuess = list.getRandomMovie().trim();
    }

public String getMovieTitle(){
        return movieToGuess;
}

    public String getHiddenMovie(){
        if(rightletters.equals("")){
            return movieToGuess.replaceAll("[a-zA-Z]", "_");
        }
        else{
            return movieToGuess.replaceAll("[a-zA-Z&&[^" + rightletters +"]]", "_");
        }
    }

    public String getWrongletters(){
        return wrongletters;
    }

    public boolean gameWon(){
        return winchecker;
    }

    public boolean gamechecker() {
        if (points >= 10) {
            return true;
        }
        else if (!getHiddenMovie().contains("_")) {
            winchecker = true;

        }
        return false;
    }

    public String userInput(){
        System.out.println("Guess a letter: ");
        Scanner scanner = new Scanner(System.in);
        String letter= scanner.nextLine();
        if(!letter.matches("[a-z]")){
            System.out.println("This ain't a letter");
            return userInput();
        }
        else if(wrongletters.contains(letter)||rightletters.contains(letter)){
            System.out.println("You already guessed this letter");
            return userInput();
        }
        else
            return letter;
    }

    public void guessLetter(){
        String guessLetter = userInput();
        if(movieToGuess.toLowerCase().contains(guessLetter)){
            rightletters += guessLetter + guessLetter.toUpperCase();
        }
        else
        {
            points++;
            wrongletters+= " " + guessLetter;
        }
    }
}

