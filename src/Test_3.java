
public class Test_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		StringBuffer s1 = new StringBuffer("hello");
		testPassParameter(s1, i);
		System.out.println(s1);
		//System.out.println();
		System.out.println(i);
		
		
	}
	
	
	public static void testPassParameter(StringBuffer ssl,int n)
	{
		ssl.append("world");
		n = 8;
	}
} 