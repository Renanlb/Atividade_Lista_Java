package Lista_01;

public class Ex_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a = 1; 
		double b = 2;

		for(int i = 3; i < 40; i++) {

			a += i / b;

			i++;

			b *= 2;
		}

		System.out.printf("%.2f", a);
	}

}
