package hello;

import java.util.Scanner;

public class BoxingDemo {
	//�����ַ��Ͱ�װ��
	public static void main(String[] args) {
//		Character.isLetter(ch);
//		Character.isLetterOrDigit(ch);
//		//�ж�java������ʶ���������ַ���������ַ��Ƿ�Ϸ�
//		Character.isJavaIdentifierPart(ch);
//		//�ж�java������ʶ�������ַ��Ƿ�Ϸ�
//		Character.isJavaIdentifierStart(ch);
//		Character.isUpperCase(ch);
//		Character.isLowerCase(ch);
//		
		//��Ŀ���ж��û�������ַ����ǲ���һ��������
		boolean _isDigit = true;
		System.out.println("������һ���ַ�����");
		String value = new Scanner(System.in).next();
		for (int i = 0; i < value.length(); i++) {
			if(!Character.isDigit(value.charAt(i))){
				_isDigit = false;
				break;
			}
		}
		if(!_isDigit)
			System.out.println("����һ�������֣�");
		else
			System.out.println("��һ�������֣�");
	}

}
