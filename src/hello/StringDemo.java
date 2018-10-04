package hello;
import java.util.Scanner;


public class StringDemo {
	
	/* 判断传入的字符串是否是一个正确格式的小数
	 * 1.字符串中的每个元素必须是数字或小数点
	 * 字符串中只能有一个小数点,不能在第一位或最后一位
	 */
	public static boolean isDecimal(String str){
//		int count = 0;
		for(int i = 0; i < str.length(); i++){
			if(!Character.isDigit(str.charAt(i))){
				if(str.charAt(i) == '.'){
//					count++;
					if(i == 0 || i == str.length()-1)  //小数点在第一位或最后一位
						return false;
				}else //当前字符不是数字或小数点
					return false;
			}
		}
		//判断字符串中只能有一个小数点
		//1.存在小数点 2.从前搜索的下标和从后搜索的下标相等
		if(!(str.contains(".") && str.indexOf(".") == str.lastIndexOf(".")))
			return false;
//		if(count > 1) return false;
		
		return true;
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//indexOf方法
		String password = "ab3456abc";
//		System.out.println(password.indexOf("ab",2));  //从下标2开始
		//问题：判断字符串中只能有一个小数点，不能在第一位或最后一位
//		System.out.println(isDecimal("3.14"));
		
		//substring  [beginIndex,endIndex)   [1,3)
		System.out.println(password.substring(1, 3));
		System.out.println(password.substring(3));  
		
		
		
//		//字符串的比较
//		System.out.println("123".equals("123"));
//		System.out.println("abc".compareToIgnoreCase("ABC"));
//		
//		System.out.println("abc".startsWith("ab"));
//		System.out.println("abc".endsWith("bc"));
//		System.out.println("abcde".contains("cd"));
		
		
//		//字符串常用方法
//		String str = "Aikoin";
//		int len = str.length();  //获取字符串中的字符个数
//		char ch = str.charAt(0); //返回字符串中指定下标的字符
//		System.out.println(len);
//		System.out.println(ch);
//		String str2 = str.toLowerCase();  //返回一个新字符串，所有字母小写
//		System.out.println(str2);
//		str2 = str.toUpperCase();  //所有字母大写
//		System.out.println(str2);
//		str2 = str.concat("1");  //字符串拼接，返回一个新的对象
//		System.out.println(str2);

		
		
		
////	trim方法：去掉字符串左右两侧的空格
////	建议：在用户输入用户名后使用
//		System.out.println("请输入用户名：");
//		String uName = input.nextLine().trim();
//		System.out.println("--" + uName + "--");
		
		
		
		
//		String对象构造方法
//		String str1 = "Hello World";
//		
//		//使用默认构造 String str2 = ""
//		String str2 = new String();
//		
//		String str3 = new String(str1);
//		
//		char chArray[] = {'a','b','c'};
//		//将字符数组转换成String对象
//		String str4 = new String(chArray) ;
//		//将String对象转换回字符数组
//		chArray = str4.toCharArray();
//		
//		//字节数组与字符串的转换
//		byte[] byteArray = {104,101,108,108,111};
//		String str5 = new String(byteArray);
//		System.out.println(str5);
//		
//		//字符串转码
//		String str6 = new String(str1.getBytes(),"UTF-8");
//		System.out.println(str6);
	
		
	}
	
}




		

	
	
	
