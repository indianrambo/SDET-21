package seleniumpackage;

public class Ascendingorderofarray {
	public static void main(String[] args) {
		int [] x= {12,24,11,30,15,35,22};
		for(int i=0;i<x.length;i++)
		{
			for(int j=i+1;j<x.length;j++)
			{
				if(x[i] > x[j])
				{
					int am=x[i];
					x[i]=x[j];
					x[j]=am;
				}
			}
		}
		for(int i : x)
		{
			System.out.println(i);
		}
	}

}
