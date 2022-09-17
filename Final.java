import java.util.*;
public class Final {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("*****WELCOME*****");
		System.out.println("Please Enter 1 for GCD");
		System.out.println("Please enter 2 for Simple Intrest");
		System.out.println();
    int Num1=12, Num2=8, Temp, GCD=0;
     float P = 1, R = 1, T = 1;
		int choice = sc.nextInt();
	
		switch(choice)
		{
		case 1:
			System.out.println("GCD for  12 and 8 is : ");
         
      while(Num2 != 0)  
      {  
      Temp = Num2;  
      Num2 = Num1 % Num2;  
      Num1 = Temp;  
      }  
      GCD = Num1;  
      System.out.println("\n GCD =  " + GCD);  
			break;
			
		case 2:
		
 
  float SI = (P * T * R) / 100;
  System.out.println("Simple interest = " + SI);
			break;
		
		default:
			System.out.println("Invalid Input");
			break;
		}
		
		}
	}
