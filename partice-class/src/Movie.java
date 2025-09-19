import java.sql.SQLOutput;
import java.util.Scanner;

public class Movie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter movie name: ");
        String movieName = sc.nextLine();
        System.out.println("Enter the movie rating: ");
        double movieRating = sc.nextInt();
        String movieStatus = "";
        if (movieRating >= 0.0 && movieRating <= 2.0)
            movieStatus = "Flop";
        else if (movieRating >= 2.1 && movieRating <= 3.4)
            movieStatus = "Semi-hit";
        else if (movieRating >= 3.5 && movieRating <= 4.5)
            movieStatus = "Hit";
        else
            movieStatus = "Super Hit";
        System.out.println(movieName + " is " + movieStatus);
    }
}