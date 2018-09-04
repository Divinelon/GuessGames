package GuessTheMovieMy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        //Method for adding the file into arraylist

        File file = new File("C:\\Users\\admin\\Desktop\\Movies.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (sc.hasNext()) {
            list.add(sc.nextLine());
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    //pick the RandomMovie from list

        int rand = (int)(Math.random() * list.size());
        String random = (String) list.get(rand);
        String randommovie = random.toLowerCase().trim();
        String hidenMovie = randommovie;
        System.out.println(randommovie);

        //Hide movie
        for(int i = 0; i < randommovie.length();i++) {
            char hiden = randommovie.charAt(i);
           if(hiden != ' ' && hiden != ':' && hiden != '.'){
               hidenMovie = hidenMovie.replace(hiden,'_');
           }
        }
        System.out.println(hidenMovie);

        int attemps = 10;
        int wronglettersNum = 0;
        String wrongletter = "";

        System.out.println("You're guessing: " + hidenMovie);
        System.out.println("You have " + attemps + " attemps");
        System.out.println("Guess the letter: ");
        Scanner userGuess = new Scanner(System.in);
        StringBuilder builder = new StringBuilder(hidenMovie);
        while (wronglettersNum < attemps){
        char guessChar = userGuess.next().charAt(0);
        }

    }

}
