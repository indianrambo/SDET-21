package seleniumpackage;

public class Occuranceofnumber {
 public static void main(String[] args) {
	int [] x= {12,32,23,4,423,32,42,42,1,9};
	for(int i=0;i<x.length;i++)
	{
		int count=0;
		int num=x[i];
		for(int j=0;j<x.length;j++)
		{
		 int num1=x[j];
		 if(num==num1 && i>j)
		 {
			break;
		 }
		 if(num==num1)
		 {
			 count++;
		 }
		}
		if(count>0)
		{
			System.out.println(num + "present" + count + "times");  
		}
	}
	
	
		
	}
}

