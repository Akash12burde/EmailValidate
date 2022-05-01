import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class Test {
	 public static void main(String[] args) {
	        
	        String regex="[a-zA-Z0-9_]+[@][a-z]+[.][a-z]{2,3}";
	        Pattern p= Pattern.compile(regex);
	        String a[]=new String[3];
	        
	        try (Scanner v = new Scanner(System.in)) {
				//take 3 emailId as input from user
				for (int i = 0; i<3; i++)
				{
				    System.out.println("Enter your email - ");
				    a[i] = v.nextLine();
				}
				
				System.out.println("Array elements checking");
				
				for (int i = 0; i<3; i++)
				{
					Matcher m= p.matcher(a[i]);
					if(m.matches())
				        System.out.println(a[i]+" Valid");
				    else
				        System.out.println(a[i]+" Not Valid");
				}
				
				//Search Logic
				
				System.out.println("Enter any email to search");
				String search=v.nextLine();
				int i;
				for (i = 0; i<3; i++)
				{
					if(a[i].equals(search))
					{	
						System.out.println("Matching");
						break;
					}
					
				}
				if(i>3)
					System.out.println("Not found");
			}
	    }
}