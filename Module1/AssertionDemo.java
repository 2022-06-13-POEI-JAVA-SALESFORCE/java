package module1;

import java.util.Scanner;

public class AssertionDemo {

	public static void main(String[] args) {
        
        System.out.println("Quel temps fait-il ?");
        Scanner sc = new Scanner(System.in);
        
        int temperature = sc.nextInt();
        
        assert temperature > 0 : "La température ne peut pas être négative";
        
        int moyenne = 200 / temperature;
        System.out.println(moyenne);
        
        sc.close();

    }

}