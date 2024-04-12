import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9,10,122};
		
		//2, 4, 6, 8, 10, 122
		//Print only par numbers->
		for(int i = 0; i < array.length; i++) {
			if(array[i] % 2 == 0) {
				System.out.println("This numer is multiple of 2: " + array[i]);
			}else {
				System.out.println("This numer is not multiple of 2: " + array[i]);
			}
		}
		
		//ArrayList
		ArrayList<String> arrList = new ArrayList();
		arrList.add("Jociane");
		arrList.add("Joci");
		arrList.add("Ane");
		
		System.out.println("\n");
		for(String s: arrList) {
			System.out.println(s);
		}
		
		arrList.remove(2);
		System.out.println("\n");
		for(String s: arrList) {
			System.out.println(s);
		}
		
		arrList.add("Selenium");
		System.out.println("\n");
		System.out.println(arrList.get(2));
		System.out.println("\n");
		System.out.println(arrList.contains("Selenium"));
		
		String[] arrayS = {"Selenium", "Java", "Maven"};
		//Convert array to List
		List<String> names = Arrays.asList(arrayS);
		System.out.println(names.contains("Selenium"));
	}
}
