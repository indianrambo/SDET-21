package seleniumpackage;

public class OccuranceofwordinString {
	public static void main(String[] args) {
		String s="nirma washing power nirma dudh si safedi nirma se aaye rangeen kapda bhi khil khil jaye sabki pasand nirma";
		String [] str=s.split(" ");
		
		for(int i=0;i<str.length;i++)
		{
			int count=0;
			
			for(int j=0;j<str.length;j++)
			{
			
				if(str[i]==str[j] && j>i) 
				{
					break;
				}
				if(str[i]==str[j])
				{
					count++;
				}
			} 
			if(count>0) 
			{
				System.out.println(str[i]+ " "+"present"+" " +count+ " "+"times");
			}
		}
	}

}
