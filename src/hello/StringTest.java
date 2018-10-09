package hello;

public class StringTest{
	public static void main(String[] args) {
		//1.输出一个字符串中的大写英文字母，小写英文字母以及非英文字母数
//		String s1 = new String("AgefhFIGI2u79.^%*");
//		int count = 0;
//		System.out.println("大写英文字母有：");
//		for(int i = 0; i < s1.length(); i++){
//			if(Character.isUpperCase(s1.charAt(i))){
//				System.out.println(s1.charAt(i));
//			}
//			if(!Character.isLetter(s1.charAt(i)))
//				count++;
//		}
//		System.out.println("小写英文字母有：");
//		for(int i = 0; i < s1.length(); i++){
//			if(Character.isLowerCase(s1.charAt(i))){
//				System.out.println(s1.charAt(i));
//			}
//		}
//		System.out.println("非英文字母有"+count+"个");
		
		
		//2.输出在一个字符串中，指定字符串出现的次数
//		String s1 = "abcxxxxabcabcxx";
//		String s2 = "abc";
//		int index = 0,count = 0;
////		while(true){
//			index = s1.indexOf(s2, index);
//			if(index == -1) break;
//			else index += s2.length();
//			count++;
//		}
//		System.out.println(count);
		
		//法二
//		while(true){
//			if(!s1.contains(s2)) break;
//			index = s1.indexOf(s2)+s2.length();
//			count++;
//			s1 = s1.substring(index);
//		}
//		System.out.println(count);
		
		
		
		//3.递归实现字符串反转
		String s1 = "hello world!";
		s1 = reverse(s1);
		System.out.println(s1);
		
	}
	static String reverse(String s){
		if(s.isEmpty()) return s;
		return reverse(s.substring(1))+s.charAt(0);  
	}
	
}
