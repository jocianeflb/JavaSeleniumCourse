
public class MethodsDemo {

	public static void main(String[] args) {
		
		MethodsDemo d = new MethodsDemo();
		String name = d.getData();
		System.out.println(name);
		
		MethodsDemo2 d2 = new MethodsDemo2();
		String user = d2.getUserData();
		System.out.println(user);
		
		String name2 = MethodsDemo.getData2();
		System.out.println(name2);
	
	}
	
	public String getData() {
		return "Jociane F.L.B";
	}
	
	public static String getData2() {
		return "Jociane F.L.B2";
	}

}
