import java.util.Scanner;

public class Degree {
	public static void main(String[] args){
		int ch = 1;
		System.out.println("Введите n");
		Scanner vvod = new Scanner(System.in);
		int num = vvod.nextInt();
		vvod.close();
		for(int i = 1; i <= num; i++)
		{
			ch = ch * 2;
		}
		System.out.println("2 в степени " + num + " = " + ch);
		}
	}
