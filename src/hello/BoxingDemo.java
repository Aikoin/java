package hello;

import java.util.Scanner;

public class BoxingDemo {
	//补充字符型包装类
	public static void main(String[] args) {
//		Character.isLetter(ch);
//		Character.isLetterOrDigit(ch);
//		//判断java变量标识符，除首字符外的其他字符是否合法
//		Character.isJavaIdentifierPart(ch);
//		//判断java变量标识符的首字符是否合法
//		Character.isJavaIdentifierStart(ch);
//		Character.isUpperCase(ch);
//		Character.isLowerCase(ch);
//		
		//题目：判断用户输入的字符串是不是一个纯数字
		boolean _isDigit = true;
		System.out.println("请输入一个字符串：");
		String value = new Scanner(System.in).next();
		for (int i = 0; i < value.length(); i++) {
			if(!Character.isDigit(value.charAt(i))){
				_isDigit = false;
				break;
			}
		}
		if(!_isDigit)
			System.out.println("不是一个纯数字！");
		else
			System.out.println("是一个纯数字！");
	}

}
