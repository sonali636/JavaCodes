package code;
import java.util.*;

public class Reverse {
	public static void main(String []args)
	{
		Scanner sc =new Scanner(System.in);
				int N []=  new int [10];
				System.out.println("enter a size of are");
              for( int i=0 ; i<N.length;i++)
              {
            	  N[i]=sc.nextInt();
              }
		
		System.out.println("the array ielements are:");
		for (int i=0; i<N.length;i++)
		{
			System.out.println(N[i]+"");
		}
		System.out.println("\n Reverse array");
		for (int i=N.length-1;i>=0;i--)
		{
			System.out.println(N[i]+ "");
		}
	}

}
