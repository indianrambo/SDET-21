package seleniumpackage;

public class Occurancechar {
	public static void main(String[] args) {
		
		String s="mahabharat";
		s=s.toLowerCase();
		
		for(int i=0;i<s.length();i++)
		{
			int count=0;
			char ch=s.charAt(i);
	    for(int j=0;j<s.length();j++)
		{
			char ch1=s.charAt(j);
			if(ch==ch1 && i>j)
			{
				break;
			}
			if(ch==ch1)
			{
				count++;
			}
			
				
			}
			if(count>0)
			{
			System.out.println(ch+ ":"+count );
			}
		}
	}	
}		

