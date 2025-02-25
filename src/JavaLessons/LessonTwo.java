package JavaLessons;

import java.util.Scanner;	

public class LessonTwo {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("what is your name? :");
			
	String name = scanner.nextLine();		
	
	System.out.print("How old are you?: ");
	
	int age = scanner.nextInt();
	
	System.out.print(" what is you gender?: ");
	
	String gender = scanner.nextLine();
	
	System.out.print("Where are you from?: ");
	
	String from  = scanner.nextLine();
	
    System.out.print("Where do you live now?: ");
	
	String livenow  = scanner.nextLine();
	
	 System.out.print("Where do you work: ");
		
		String workplace  = scanner.nextLine();
		
       System.out.print("What is your job role?: ");
		
		String jobrole  = scanner.nextLine();
		
	
       System.out.print("What is your salary?: ");
		
		int salary  = scanner.nextInt();
		scanner.nextLine();
		
     System.out.print("How much raise are you getting next year?: ");
		
		int increase  = scanner.nextInt();
		scanner.nextLine();
		
		int newsalary= salary+increase;
		
		System.out.println("My name is " + name+"." + "I am " + age +" years old, " + gender +" I work at " + workplace +
				jobrole +"." + " I am currently live in " + livenow +"."+" i am orginaly from " + from +"."+"I make "+ salary +"." 
				+" I will get " + increase +" as annual rasie so my total salary will would be"+ newsalary + "next year.");
	
	
		

	scanner.nextLine();
	

	scanner.close();

	}

}
