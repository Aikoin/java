package hello;

public class StringTest{
	public static void main(String[] args) {
		//1.���һ���ַ����еĴ�дӢ����ĸ��СдӢ����ĸ�Լ���Ӣ����ĸ��
//		String s1 = new String("AgefhFIGI2u79.^%*");
//		int count = 0;
//		System.out.println("��дӢ����ĸ�У�");
//		for(int i = 0; i < s1.length(); i++){
//			if(Character.isUpperCase(s1.charAt(i))){
//				System.out.println(s1.charAt(i));
//			}
//			if(!Character.isLetter(s1.charAt(i)))
//				count++;
//		}
//		System.out.println("СдӢ����ĸ�У�");
//		for(int i = 0; i < s1.length(); i++){
//			if(Character.isLowerCase(s1.charAt(i))){
//				System.out.println(s1.charAt(i));
//			}
//		}
//		System.out.println("��Ӣ����ĸ��"+count+"��");
		
		
		//2.�����һ���ַ����У�ָ���ַ������ֵĴ���
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
		
		//����
//		while(true){
//			if(!s1.contains(s2)) break;
//			index = s1.indexOf(s2)+s2.length();
//			count++;
//			s1 = s1.substring(index);
//		}
//		System.out.println(count);
		
		
		
		//3.�ݹ�ʵ���ַ�����ת
		String s1 = "hello world!";
		s1 = reverse(s1);
		System.out.println(s1);
		
	}
	static String reverse(String s){
		if(s.isEmpty()) return s;
		return reverse(s.substring(1))+s.charAt(0);  
	}
	
	
}
