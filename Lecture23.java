class Thing{
	public String name;
	public static String str="MY VALUE";
	public void getName(){
		System.out.println(name);
	}
	public static void showStr()
	{
		System.out.println(str);
	}
}
public class Lecture23{
	public static void main(String s[]){
		Thing.showStr();
	}
}