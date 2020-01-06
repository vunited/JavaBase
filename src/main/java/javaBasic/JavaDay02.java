package com.test.javaBasic;

import java.util.Arrays;

public class JavaDay02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		case：
//		本金10000元存入银行，年收益率千分之三，每年结算时，
//		利息和本金合计为新一年的本金。五年后，本金金额数
//		int money=10000;
//		for(int year=0;year<=4;year++) {
////			money=money*0.003+money;
////			money=money*(0.003+1);			
//			money*=(1+0.003);
//		}
//		System.out.println("五年后本金合计为"+money+"元");

//		数组：存放相同数据类型的容器/集合 Arrays
//		声明数组   格式： 1.数据类型[] 数组名    2.数据类型  数组名[]
//		int[] arr;   //推荐使用此种
//		int arr02[];

//		方法一：
//		byte[] arr = new byte[5];
//		arr[0] = 2;
//		arr[1] = 32;
//		arr[2] = 25;
//		arr[3] = 45;
//		arr[4] = 76;
//
//		如果定长数组 不赋值 默认  0   0.0   false   ''  null
//		String[] arr = new String[5];
//		System.out.println(Arrays.toString(arr));
////		方法二：
//		int[] arr02 = new int[] { 23, 87, 43, 4346 };
//
////	    方法三：
//		int[] arr03 = { 23, 87, 43, 4346 };

//		数组可以通过下标 对元素进行访问(从0开始)
//		System.out.println(arr02[2]);
//		
////		数组的长度 可以通过length属性获取
//		System.out.println(arr03.length);

//		数组的遍历
//		方法一：利用下标：
//		int[] scores= {99,96,76,35,57,87};
//		for(int index=0;index<scores.length;index++) {
//			System.out.println(scores[index]); 
//		}
//	    方法二：for-each遍历
//		for(int xx:scores) {
//			System.out.print(xx+",");
//		}

//		控制台输出数组
//		直接输出 数组名 输出的是  数组的地址
//		System.out.println(scores);
////		将数组内容转换为String字符串输出
//		System.out.println(Arrays.toString(scores));

//		case1:
//			1.创建数组  4，3，5，9，8
//			2.获取 3  9   下标
//			3.互换数组中 3  9  位置

//		1
//		int[] arr= {4,3,5,9,8};  //创建数组
////		2
//		int index3=0;   //初始化变量 准备接下标值
//		int index9=0;
//		for(int index=0;index<arr.length;index++) { //循环整个数组
//			if(arr[index]==3) { //判断数组元素是否为3 如果是 则保存当前下标
//				index3=index;
//			}
//			if(arr[index]==9) {
//				index9=index;
//			}
//		}
//		System.out.println(index3+","+index9);
////		3
//		int temp=arr[index3]; //创建临时变量 互换变量值
//		arr[index3]=arr[index9];
//		arr[index9]=temp;
//		System.out.println(Arrays.toString(arr));

//		case2: 控制台输出 arr中有 而brr中没有的元素
//		tips: 利用arr中 每一个元素 与brr中所有元素进行比较
//			int[] arr= {1,4,2,5,6,3};
//			int[] brr= {4,5,6,7,9,8};
//			
//
//			for(int arrEach:arr) {  //遍历arr数组
//				boolean flag=true;   //初始化开关 开关开启
//				for(int brrEach:brr) {    //遍历brr数组
//					if(arrEach==brrEach) {  //判断arr中某个元素 和brr中每个元素是否相同
//						flag=false;         //如果找到相同  则开关关闭
//						break;              //开关关闭后 终止brr数组循环
//					}				
//				}	
//				if(flag) {                  //判断开关状态  开启 则输出
//					System.out.println(arrEach);
//				}				
//			}
//			
//		case3: 
//		int[] arr = { 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 2, 2, 2 };
//			1.arr中最大元素值
//			2.arr中3出现的次数
//			3.（扩展）arr中 出现次数最多的元素

//			1.
//			int max=arr[0];
//			for(int index=0;index<arr.length;index++) {
//				if(max<arr[index]) {
//					max=arr[index];
//				}
//			}
//			System.out.println(max);

//			2.
//			int count3=0;
//			for(int arrEach:arr) {
//				if(arrEach==3) {
//					count3++;
//				}
//			}
//			System.out.println(count3);
//			3.
//		int countMax = 0; // 最大出现次数
//		int maxValue = arr[0]; // 最大出现次数对应的元素值
//		for (int i = 0; i < arr.length; i++) {
//			int count = 0;
//			for (int ii = 0; ii < arr.length; ii++) {
//				if (arr[i] == arr[ii]) {
//					count++;
//				}
//			}
//			if (countMax < count) {
//				countMax = count;
//				maxValue = arr[i];
//			}
//		}
//		System.out.println(countMax);
//		System.out.println(maxValue);
		
//二维数组：以数组为元素的数组
//		int[][] twoDimArr = new int[3][2];
//		twoDimArr[0][0]=98;
//		twoDimArr[0][1]=76;
//		twoDimArr[1][0]=34;
//		twoDimArr[1][1]=87;
//		twoDimArr[2][0]=63;
//		twoDimArr[2][1]=6;
//		
//		int[][] twoDimArr02=new int[][]{{3,2},{5,6,3,24,53},{8}};
//		int[][] twoDimArr03={{3,2},{5,6,3,24,53},{8}};
//		
////		二维数组的输出
//		System.out.println(Arrays.deepToString(twoDimArr02));
//		System.out.println(twoDimArr03[1].length);
//		System.out.println(Arrays.toString(twoDimArr03[0]));
		
		
//		case:
//			三个人 的三门成绩如下：  
//			A:50  60   55
//			B:60  60   58
//			C:78  96   85
//			1.各自总成绩     total   sum   
//			2.总成绩最高分      max    min      avg       count  add   minus    
//			3.平均成绩最高分
		int scoreSum=0;  //声明总成绩
		int scoreMax=0;   //最高分变量
		int avgMax=0;     //最高平均分变量
		int[][] arr= {{50,60,55},{60,60,58},{78,96,85}};
		for(int index=0;index<arr.length;index++) {  //外层数组遍历
			scoreSum=0;   //总成绩初始化  归零
			for(int indexD=0;indexD<arr[index].length;indexD++) {   //内层数组遍历
				scoreSum+=arr[index][indexD];
			}
			System.out.println(scoreSum+","+scoreSum/arr[index].length);   //输出每个人的总成绩和平均分
			
			if(scoreMax<scoreSum) {  //找最大总成绩
				scoreMax=scoreSum;
			}
			if(avgMax<scoreSum/arr[index].length) {  //找最大平均分
				avgMax=scoreSum/arr[index].length;
			}
			
		}
		System.out.println(scoreMax);
		System.out.println(avgMax);
			
	}
}
