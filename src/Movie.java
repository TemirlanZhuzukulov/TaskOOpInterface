import java.util.Arrays;
import java.util.Scanner;

public class Movie  implements Findable{
     private String name;
     private int year;
     private String description;
     private Director director;
     private Cast casts;

     public Movie(String name, int year, String description, Director director, Cast casts) {

          this.name = name;
          this.year = year;
          this.description = description;
          this.director = director;
          this.casts = casts;
     }

     public Movie() {
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public int getYear() {
          return year;
     }

     public void setYear(int year) {
          this.year = year;
     }

     public String getDescription() {
          return description;
     }

     public void setDescription(String description) {
          this.description = description;
     }

     public Director getDirector() {
          return director;
     }

     public void setDirector(Director director) {
          this.director = director;
     }

     public Cast getCasts() {
          return casts;
     }

     public void setCasts(Cast casts) {
          this.casts = casts;
     }

     @Override
     public void getAllMovies(Movie[] movies) {
          for (Movie allMovie:movies) {
               System.out.println(allMovie);
          }
     }

     @Override
     public void findMovieByName(Movie[] movies) {
          Scanner scanner = new Scanner(System.in);
          System.out.println("input your movie name");
          String name=scanner.next();
          for (Movie movieName:movies) {
               if(name.equals(movieName.getName().toUpperCase())){
                    System.out.println("Movie:"+movieName);

               }
          }

     }

     @Override
     public void findMovieByActorName(Movie[] movies) {
          Scanner scanner= new Scanner(System.in);
          System.out.println("Input actor name");
          String name=scanner.next();
          for (Movie act:movies) {
               if(name.equals(act.casts.getActorFullName())){
                    System.out.println("Movie:"+act);

               }
          }
     }


     @Override
     public void findMovieByYear(Movie[] movies) {
          Scanner scanner= new Scanner(System.in);
          System.out.println("Input year ");
          int years= scanner.nextInt();
          for (Movie year:movies) {
               if(years==year.year){
                    System.out.println("Movie:"+year);
               }
          }
     }

     @Override
     public void findMovieByDirector(Movie[] movies) {
          Scanner scanner = new Scanner(System.in);
          System.out.println("Input name director");
          String name= scanner.next();
          for (Movie director:movies) {
              if(name.equals(director.director.getName())){
                   System.out.println("movie:"+director);
              }

          }
     }

     @Override
     public void findMovieByDescription(Movie[] movies) {
          Scanner scanner = new Scanner(System.in);
          System.out.println("Input descrioption");
          String name=scanner.next();
          for (Movie des:movies) {
              if(name.toUpperCase().equals(des.description.toUpperCase())){
                   System.out.println("Movie:"+des);
              }
          }
     }

     @Override
     public void findMovieByRole(Movie[] movies) {
          Scanner scanner= new Scanner(System.in);
          System.out.println("Input role");
          String name= scanner.next();
          for (Movie rol: movies) {
              if(name.equals(rol.casts.getRole())){
                   System.out.println("Movie:"+rol);
              }
          }
     }

     @Override
     public String toString() {
          return "Movie{" +
                  "name='" + name + '\'' +
                  ", year=" + year +
                  ", description='" + description + '\'' +
                  ", director=" + director +
                  ", casts=" + casts +
                  '}';
     }

}
