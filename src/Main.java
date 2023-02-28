import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cast cast1 = new Cast("Kutman", "main role");
        Cast cast2 = new Cast("Okeana", "Reader");
        Cast cast3 = new Cast("Aiba", "Boxer");
        Cast[] casts1 = {cast1, cast2, cast3};
        for (Cast cast:casts1) {

        }
        Cast cast4 = new Cast("Samat", "main role");
        Cast cast5 = new Cast("Aibek", "teacher");
        Cast cast6 = new Cast("Akylai", "model");
        Cast[] casts2 = {cast4, cast5, cast6};

         Cast [] casts={cast1,cast2,cast3,cast4,cast5,cast6};


        Director director1 = new Director("Rasul ", "Akun");
        Director director2 = new Director("Ruslan", "Akun");
        Movie m = new Movie();
        Movie movie = new Movie("AkyrkySabak", 2022, "Education", director1, casts1);
        Movie movie2 = new Movie("KokBoru", 2021, "Sport", director2, casts2);
        Movie[] movies = {movie, movie2};
        for (Movie v:movies) {

        }
        while (true) {
            System.out.println("""
                     1-getAllMovies
                     2-findMovieByName
                     3-findMovieByActorName
                     4-findMovieByYear
                     5-findMovieByDirector
                     6-findMovieByDescription
                     7-findMovieByRole
                            """);

            System.out.println("chose your action");

            switch (scanner.nextInt()) {
                case 1:
                    m.getAllMovies(movies);
                    break;
                case 2:
                    m.findMovieByName(movies);
                    break;
                case 3:
                    m.findMovieByActorName(movies);
                    break;
                case 4:
                   m.findMovieByYear(movies);
                    break;
                case 5:
                    m.findMovieByDirector(movies);
                    break;
                case 6:
                    m.findMovieByDescription(movies);
                    break;
                case 7:
                    m.findMovieByRole(movies);
            }


        }
    }
}