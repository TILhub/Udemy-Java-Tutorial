class Trial{
	private int id;
	private String name;
	public Trial(String name,int id){
		this.name=name;
		this.id=id;
	}
	public String toString(){
		StringBuilder s=new StringBuilder();
		s.append(id)
		.append(": ")
		.append(name);
		return s.toString();
	}
}
class Lecture25{
	public static void main(String[] ty){
		Trial t=new Trial("Sii",0);
		System.out.println(t);
	}
}