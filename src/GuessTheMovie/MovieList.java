package GuessTheMovie;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MovieList {

    public ArrayList<String> movies = new ArrayList<>();

    public MovieList(){
        File file = new File("C:\\Users\\admin\\Desktop\\Movies.txt");
        try {
            Scanner scanFile = new Scanner(file);
            while(scanFile.hasNext()){
                movies.add(scanFile.nextLine());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public String getRandomMovie(){
        int randomNum = (int)(Math.random() * movies.size());
        return movies.get(randomNum);

    }
}
