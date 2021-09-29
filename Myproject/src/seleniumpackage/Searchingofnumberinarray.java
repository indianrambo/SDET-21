package seleniumpackage;

public class Searchingofnumberinarray {
	public static void main(String[] args) {
		int [] x= {9,38,89,39,90};
		int y=39;
		
		for(int i : x)
		{
			System.out.println(i==y?"it is present":"it is not present");
		}
	}

}
