import java.util.Scanner;
class Lecture14{
	public static void main(String s[]){
		int value=7;
		int[] values;
		values=new int[10000];
		for(int i=0;i<values.length;i++)
			values[i]=i*i;
		for(int i=0;i<values.length;i++)
			System.out.print(values[i]+" ");
		//values.length=10;
	}
}