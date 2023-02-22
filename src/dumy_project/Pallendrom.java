package dumy_project;

public class Pallendrom
{
	public static void main(String[] args) 
	{
		String str="Akshay";
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		} 
		if(str.equals(rev))
		{
			System.out.println("Given String is a pallendrom");
		}
		else
		{
			System.out.println("Given String is not pallendrom ");
		}
	}
}
