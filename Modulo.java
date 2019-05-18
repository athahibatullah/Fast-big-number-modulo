import java.util.Scanner;

import java.util.Scanner;

public class Modulo {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		//result = input % scan
		long input = in.nextLong();
		long scan = in.nextLong();
		//double startTime = System.nanoTime();
		System.out.println("Result: " + Mod(input,scan));
		in.close();
		//double endTime = System.nanoTime();
		//System.out.println("Execution time: "+(endTime-startTime)/1.0E9+ " second");
	}
	//Start here
	public static long Mod(long number, long div) {
		long division=10;
		if(number % division == number){
			return number%div;
		}
		else {
			while(division*10 <= number) {
				division*=10;
			}
			return (Mod(number%division,div)+Mod2(number-number%division,div))%div;
		}
	}
	
	public static long Mod2(long number, long divisor) {
		long division2 = divisor;
		if(divisor == 1) {
			return 0;
		}
		else if(number % divisor == number) {
			return number;
		}
		else {
			while(division2*10 <= number) {
				division2 *= 10;
			}
			while(true) {
				number %= division2;
				if(number < divisor) {
					break;
				}
				division2 /= 10;
			}
			return number;
		}
	}
}
