import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class TimesTableChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner (System.in);

		//Setup Variables
		int hi;
		int low;
		int num;
		//Ask for hi, low and num
		System.out.println("Welcome to the Times Table Challenge!");
		System.out.println("");
		System.out.println("High number?");
		hi=in.nextInt();
		in.nextLine();
		System.out.println("Smaller number?");
		low=in.nextInt();
		in.nextLine();

		if (hi<low) {
			num=hi;
			hi=low;
			low=num;
		} 
			for (int i=low; i<=hi;i++) {
				System.out.print("\t"+i );
			}
			for (int x=low; x<=hi;x++) {
				System.out.println("\t");
				System.out.print(""+x+"\t");

				for (int y=low; y<=hi;y++) {
					System.out.print(y*x+"\t");
				}
				System.out.println();
			}
			//Print Results

		}


	}
