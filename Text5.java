package 面试;


public class Text5 {
	public static void main(String[] args) {
		Text5 text5 = new Text5();
		text5.ch(null);
	}
	
	
	public void ch(String st){
		System.out.println("123");
	}
	public void ch(Object ob){
		System.out.println("456789");
	}
	public void text(){
		System.out.println("第三次修改");
	}
	
	
	
}
