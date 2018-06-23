import java.util.*;
class Person{
	int age;
	String name;
	void speak(){

		System.out.print("Name: "+name);
		System.out.print("Age: "+age);
	}
	void ask(){
		Scanner scr=new Scanner(System.in);
		System.out.print("Age: ");
		age=scr.nextInt();
		System.out.print("Name: ");
		name=scr.next();
	}

}
class Lecture18{
	public static void main(String s[]){
		Person p=new Person();
		p.ask();
		p.speak();
	}
}