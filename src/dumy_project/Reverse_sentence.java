package dumy_project;

public class Reverse_sentence
{
	public static void main(String[] args) 
	{
		String org="I am Akshay";
		
		String s1=ReverseSentence(org);
		
		System.out.println(s1);
	}
	
	public static String ReverseSentence(String Sentence)
	{
		String[] text=Sentence.split(" ");
		String rev="";
		
		for(int i=text.length-1;i>=0;i--)
		{
			rev=rev+text[i]+ " ";
		} 
		return rev;
	}
}
