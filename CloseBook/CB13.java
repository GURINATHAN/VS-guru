package Assignment2;
import java.util.Scanner;

public class CB13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of Student    :: "); int studs = input.nextInt();
		System.out.print("Enter the number of Subjects   :: "); int marks = input.nextInt();
		System.out.println("---------------------------------------------------");
		int[][] arr = new int[studs][marks];
		String[] names = new String[studs];
		for(int i=0; i<studs; i++) {
			System.out.print("Enter the " +(i+1) +" Student Name :: " );
			names[i] = input.next();
		}
		System.out.println("---------------------------------------------------");
			for(int stud=0; stud<studs; stud++ ) {
				
				for(int mark=0; mark<marks; mark++) {
					
					System.out.print("Enter the mark of " +names[stud] +" "+(mark+1) +" Subject mark  :: " );
					arr[stud][mark] = input.nextInt();
				}
				System.out.println("---------------------------------------------------");
			}
			
			System.out.println("<><><><><><><><><><><><<><>");
			for(int stud=0; stud<studs; stud++ ) {
				for(int mark=0; mark<marks; mark++) {
					if(mark==0)
						System.out.print (names[stud] +" ");
					System.out.print(arr[stud][mark] +"  ");
				}
				System.out.println();
			}	
		
			input.close();
	}
	}


