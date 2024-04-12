
public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String is an objec
		String s = "Jociane Franzoni de Lima";
		
		//new
		String s2 = new String("Welcome");
		String s3 = new String("Welcome2");
		
		s = s.concat(" Buriola");
		System.out.println(s);
		
		String[] name = s.split(" ");
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
		System.out.println(name[3]);
		System.out.println(name[4]);
		
		System.out.println("***********************");
		for(int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
		
		System.out.println("***********************");
		for(int i = s.length()-1; i >= 0; i--) {
			System.out.println(s.charAt(i));
		}

	}

}
