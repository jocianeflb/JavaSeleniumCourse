
public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		System.out.println("Teste start class");
		int num = 5;
		String text = "TextSample";
		char letter = 'j';
		double decimal = 1.99;
		System.out.println("My num is: " + num);
		
		//Arrays
		int[] arraySample = new int[5];
		arraySample[0] = 1;
		arraySample[1] = 2;
		arraySample[2] = 3;
		arraySample[3] = 4;
		arraySample[4] = 5;
		
		int[] array2 = {1,2,3,4,5,10,122};
		System.out.println(array2[1]);
		System.out.println("\n");
		
		for(int i = 0; i < arraySample.length; i ++) {
			System.out.println(arraySample[i]);
		}
		
		System.out.println("\n");
		for(int i = 0; i < array2.length; i ++) {
			System.out.println(array2[i]);
		}
		
		//ForEach
		String[] name = {"Jociane", "Joyce", "Josi"};
		System.out.println("\n");
		for(String n: name) {
			System.out.println(n);
			
		}
	}

}
