public class Movies {
    private String title;
    private String releaseYear;
    private String genre;
    private int rating;


    public Movies(String title, String releaseYear, String genre, int rating) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.genre = genre;
        this.rating = rating;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public String getGenre() {
        return genre;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return String.format("Movie : %s\tYear: %s\tGenre: %s\tRating: %d\n", title, releaseYear, genre, rating);
    }
}
