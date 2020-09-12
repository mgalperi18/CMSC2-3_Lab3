import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		// Create a new object of type Scanner that reads from the keyboard
		Scanner sc = new Scanner(System.in);
		String movieTitle, movieRating;
		int movieTickets;
		String cont;
		//Create a new movie object
		Movie obj = new Movie();
		
		do { ////a loop that reads input for multiple movies
		
		//prompt the user to enter the title of a movie 
		System.out.println("Please enter the movie title: ");
		//Read in the line that the user types
		movieTitle = sc.nextLine().trim();
		//Set the title in the movie object
		obj.setTitle(movieTitle);
		
		//Prompt the user to enter the movie’s rating
		System.out.println("Please enter the movie rating: ");
		//Read in the line that the user types
		movieRating = sc.nextLine().trim();
		//Set the rating in the movie object
		obj.setRating(movieRating);
		
		//Prompt the user to enter the number of tickets sold at a (unnamed) theater
		System.out.println("Please enter the number of tickets sold: ");
		//Read in the integer that the user types
		movieTickets= sc.nextInt();
		//Set the number of tickets sold in the movie object
		obj.setSoldTickets(movieTickets);
		
		//Print out the information using the movie’s toString method
		System.out.println(obj.toString());
		
		System.out.println("Would you like to continue entering data?"
				+"Enter yes or no");
		sc.nextLine();
		cont = sc.nextLine();	
		}while(cont.equals("yes"));
		
		System.out.println("\nGoodbye!");
		sc.close();
	}

}
