import java.util.*;
public class Answer {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Movie[] movies = new Movie[4];
        for(int i=0;i<4;i++){
            int movieId = sc.nextInt();sc.nextLine();
            String director = sc.nextLine();
            int rating = sc.nextInt();
            int budget = sc.nextInt();
            movies[i] = new Movie(movieId,director,rating,budget);
        }
        sc.nextLine();
        String searchDirector = sc.nextLine();
        int searchRating = sc.nextInt();
        int searchBudget = sc.nextInt();
        int avgBudget = findAvgBudgetByDirector(movies, searchDirector);
        
        if(avgBudget>0){
        	System.out.println(avgBudget);
		}
        else{
        	System.out.println("Sorry - The given director has not yet directed any movie");
		}
        
        Movie resultMovie = getMovieByRatingBudget(movies, searchRating, searchBudget);
        
        if(resultMovie == null){
        	System.out.println("Sorry - No movie is available with the specified rating and budget requirement");
		}
        else{
        	System.out.println(resultMovie.getMovieId());
		}
        sc.close();
    }

    public static int findAvgBudgetByDirector (Movie[] movies, String searchDirector){
    	
    	int avg,s=0,j=0;
        for(int i=0;i<4;i++){              
            if(searchDirector.equalsIgnoreCase(movies[i].getDirector())){
                s = s+movies[i].getBudget();
                j++;
            }
        }
        
        if(j>0){
            avg = s/j;
            return avg;
        }          
        else{
            return 0;
        }
    }

    public static Movie getMovieByRatingBudget(Movie[] movies, int rating, int budget){
        for(int i=0;i<4;i++){
        	if((rating == movies[i].getRating()) && (budget == movies[i].getBudget()) && (movies[i].getBudget() % movies[i].getRating() == 0)){
        		return movies[i];
            }
        }
        return null;   
          
    }
}

class Movie{
    private int movieId;
    private int rating;
    private int budget;
    private String director;

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    Movie(int movieId, String director, int rating, int budget){
        this.movieId = movieId;
        this.director = director;
        this.rating = rating;
        this.budget = budget;
    }
}
