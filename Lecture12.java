import java.util.*;
class Lecture12{
	public static void main(String s[]){
		int val;
		Scanner input=new Scanner(System.in);
		do{
			val=input.nextInt();
		}
		while(val!=5);
		System.out.println("Finally Out Of the Loop\n\n\n");
	}
}