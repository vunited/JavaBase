import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.jsoup.parser.Parser;

public class Test_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class A{
			 int v;
			 int i = 3;
			 public A(int v) {
				// TODO Auto-generated constructor stub
				 this.v = v;
				
			}
			 @Override
			public String toString() {
				// TODO Auto-generated method stub
				return ""+this.v;
			}
			
		}
	//	Object o = new A();
		A o = new A(3);
		A a = o;
		int b = Integer.parseInt(o.toString());
		System.out.println("byte"+Byte.MIN_VALUE+"~"+Byte.MAX_VALUE);
		System.out.println("short:"+Short.MIN_VALUE+"~"+Short.MAX_VALUE);
		System.out.println("int:"+Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);
		System.out.println("long:"+Long.MIN_VALUE+"~"+Long.MAX_VALUE);
		System.out.println("double:"+Double.MIN_VALUE+"~"+Double.MAX_VALUE);
		System.out.println("bigdecimal:"+BigDecimal.ROUND_UP);
		
		System.out.println("----------------------------------------------");
		Map<String, String> elements = new HashMap<String, String>();
		elements.put("1","sangjiexun");
		//char[]---CharSequence[]
		/**
		 * CharSequence --String\StringBuffer\StringBuilder
		 */
		String[][] ne = new String[][]{{"1","sang"},{}};
		elements.put("2", ne[0][1]);
		System.out.println(elements);
		
		char[] char1 = new char[] {'a','b','c','\n'};
		System.out.print(char1);//'\n'可以换行了 C语言中默认最后一个char为‘换行\n’
		
		
		CharSequence[] charInfo = new String[]{"1","2","3"};
		StringBuilder sb = new StringBuilder("jjj");
		//System.out.println(charInfo.equals(sb));
		System.out.println("String:"+String.join(",", charInfo));
		
		CharSequence[] charInfo2 = {};
		
		System.out.println(sb);
		
		System.out.println("i = "+a.i+"+"+o.i+"="+(b+3));//b+3 不加括号 就是33
	}

}
