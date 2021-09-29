package seleniumpackage;

public class Sumandavgofarray {
	public static void main(String[] args) {
		float [] x= {6,83,90,16,29,};
		float [] num = new float[x.length];
		float num1=0;
		for(int i=0;i<x.length;i++)
		{
			num1=num1+x[i];
		}
		System.out.println("summation of array is :" + " " + num1);
		System.out.println("average of array is" + " " + num1/x.length);
		
	}

}

