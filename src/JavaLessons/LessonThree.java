package JavaLessons;

import java.util.Scanner;


public class LessonThree {

	public static void main(String[] args) {
		
Scanner scanner= new Scanner(System.in);		

System.out.println(" please enter the string 'hello' lowercase please: ");

String wordstring = scanner.nextLine();

System.out.println(" To UpperCase : " + wordstring.toUpperCase());

System.out.println(" length is  : " + wordstring.length());

System.out.println(" Replace O by Z  : " + wordstring.toUpperCase().replace("O","Z"));

System.out.println(" Last Char is :  " + wordstring.charAt(4));

System.out.println("conacting : " + wordstring.concat(" " + "Test"));

scanner.close();

	}

}
