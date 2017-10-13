import java.util.Scanner;
import java.util.Random;
public class TimesTableChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner (System.in);
		Random rnd=new Random();

		//Setup Variables
		int hi;
		int low;
		int num;
		int score=0;
		int x=1;
		//Ask for hi, low and num
		System.out.println("Welcome to the Times Table Challenge!");
		System.out.println("");
		System.out.println("What is the biggest number you want?");
		hi=in.nextInt();
		in.nextLine();
		System.out.println("What is the smaller number you want?");
		low=in.nextInt();
		in.nextLine();

		//Loop and ask the questions
		while (score<10) {
			double num1=rnd.nextInt(hi-low+1)+low;
			double num2=rnd.nextInt(hi-low+1)+low;
			System.out.println("Question "+x+") "+num1+" / "+num2+" = ?");
			int ans=in.nextInt();
			if (ans==num1/num2) {
				score++;
				x++;
				System.out.println("Right!");

			}else {
				System.out.println("Wrong! The answer is "+(num1/num2));
				score=0;
			}
		}
		//Print Results
		
		if (score==10) {
			double num1=rnd.nextInt(hi-low+1)+low;
			double num2=rnd.nextInt(hi-low+1)+low;
			double num3=num1+num2;
			System.out.println("BONUS: "+num1+" + "+num3+" - "+num2+" x "+num1*num2+" = ?");
			in.nextInt();
			double answer;
			
		}

	}

}