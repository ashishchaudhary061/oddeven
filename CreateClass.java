package ashishapplication;
import java.util.Scanner;
public class CreateClass {
	void evenodd() {
		Scanner Sc = new Scanner(System.in);
		System.out.println("enetr the value of n");
		int n=Sc.nextInt();
		if(n%2==0)
			System.out.println("even");
		else
			System.out.println("odd");
			
	}

	public static void main(String[] args) {
		CreateClass c1=new CreateClass();
		c1.evenodd();


}
}