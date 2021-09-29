package seleniumpackage;

public class Highestandlowestnoofarray {


	public static void main(String[] args) {
		int [] x= {23,4,5,36,23,96,433,553,13,1,4444};
		for(int i=0;i<x.length;i++)
		{
			for(int j=i+1;j<x.length;j++)
			{
				if(x[i] < x[j])
				{
					int temp=x[i];
					x[i]=x[j];
					x[j]=temp;
					
				}
			}
		}
		
	 
		System.out.println("highest no of this array is :" + x[0]);
		System.out.println("lowest number of this array is :" + x[x.length-1]);
		
	}

}
