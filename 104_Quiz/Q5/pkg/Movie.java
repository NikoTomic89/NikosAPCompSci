package pkg;

public class Movie{
    String movieName;
    Double rating;
    int numRating;
    int revenue;
    
    public Movie (){
        this.movieName = "Avengers";
        this.rating = 8.0;
        this.numRating = 33;
        this.revenue = 623357910;
    }
    
    public Movie (String a, Double b, int c, int d){
        this.movieName = a;
        this.rating = b;
        this.numRating = c;
        this.revenue = d;
    }
    
    public void movieToString(){
        System.out.println("Movie: " + movieName);
        System.out.println("Rating: " + rating);
        System.out.println("Number of Ratings: " + numRating);
        System.out.println("Revenue: " + revenue);
        System.out.println();
    }
    
    public String getMovieName(){
        return movieName;
    }
    
    public int getRevenue(){
        return revenue;
    }
    
    public void addRating(double a){
        rating = rating * numRating;
        rating = rating + a;
        numRating++;
        rating = rating / numRating;
    }
    
    public boolean compareRatings(Movie a){
        
    }
}
