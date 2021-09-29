package seleniumpackage;

public class Stringswipearray {
	public static void main(String[] args) {
		String s="jindegi ke sath bhi baad bhi";
		String [] s1=s.split(" ");
		String word=s1[0];
		s1[0]=s1[s1.length-1];
		s1[s1.length-1]=word;
		
		for(String i:s1)
		{
			System.out.print(i+" ");
		}
		
		
	}

}
