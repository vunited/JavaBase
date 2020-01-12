package com.test.oopDay04;

import java.util.Scanner;

public class OopDay04 {

	public static void main(String[] args) {
//    Math   ÊıÑ§

//		Math.E
//		Math.abs(a)
//		Math.ceil(a)
//		Math.floor(a)
//		Math.pow(a, b)
//		Math.sqrt(a)
//		Math.min(a, b)
//		Math.max(a, b)
//		Math.PI
//		Math.random()
//		Math.ceil(Math.random()*9)+1;
//		Math.round(a)

//		case: ×Ö·û´®Ñ¹Ëõ
//		ÔËĞĞ
//		¿ØÖÆÌ¨ÊäÈë´¿×ÖÄ¸×Ö·û´®   rrtdfhwww
//		¿ØÖÆÌ¨Êä³ö  2rtdfh3w
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("Start?Y/N");
			String flag = scan.next();
			if (flag.equalsIgnoreCase("N")) {
				System.out.println("End");
				break;
			}
			System.out.println("ÇëÊäÈë´ıÑ¹Ëõ×Ö·û´®");
			String str = scan.next() + " ";
			StringBuilder stb = new StringBuilder();
			int count = 1;
			for (int i = 1; i < str.length(); i++) {
				if (str.charAt(i) == str.charAt(i - 1)) {
					count++;
				} else {
					if (count != 1) {
						stb.append(count);
						count = 1;
					}
					stb.append(str.charAt(i - 1));
				}
			}
			System.out.println(stb.toString());

		}
		
	}
}
