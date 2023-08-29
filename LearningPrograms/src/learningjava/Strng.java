package learningjava;
import java.util.Scanner;
public class Strng {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String sid= scanner.nextLine();

	       
	        StringBuilder a = new StringBuilder(sid);
	        a.reverse();

	        System.out.println(a);

	       // scanner.close();
	    }
	}


