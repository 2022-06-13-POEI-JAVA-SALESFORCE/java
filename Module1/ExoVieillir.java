package module1;

public class ExoVieillir {

	public static void main(String[] args) {
		
		int age = 30;
		age = vieillir(age); // 30 ans
		System.out.println("J'ai " + age + " ans");
		
		int age2 = 40;
		age2 = vieillir(age2); // 40 ans
		System.out.println("J'ai " + age2 + " ans");

	}
	
	public static int vieillir(int age) {
		
		return age + 1;
		
	}

}
