import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<Movies> moviesList = new ArrayList<>();

        Movies movie1 = new Movies("Rick and Morty", "2011", "Animation", 10);
        Movies movie2 = new Movies("Passengers", "2016", "Sci-Fi", 9);
        Movies movie3 = new Movies("Inception", "2010", "RPG", 7);
        Movies movie4 = new Movies("X men", "2007", "Action", 6);

        System.out.println(moviesList.isEmpty());
        System.out.println(moviesList.size());

        moviesList.add(movie1);
        moviesList.add(movie2);
        moviesList.add(movie3);
        moviesList.add(movie4);

        System.out.println(moviesList.isEmpty());
        System.out.println(moviesList.size());
        for (Movies a : moviesList)
            System.out.println(a);

        System.out.println("After Updating Rating");
        System.out.println();

        for (Movies a : moviesList)
        {
            a.setRating(a.getRating() + 1);
            System.out.println(a);
        }

        moviesList.remove(1);

        System.out.println("After removing second movie");
        System.out.println();

        for (Movies a: moviesList)
            System.out.println(a);




    }
}