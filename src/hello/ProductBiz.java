package hello;

import javax.swing.JOptionPane;

//��Ʒ������
public class ProductBiz {
	public static void main(String[] args) {
		//��������ÿ����Ʒ������
		int counts[] = new int[3];
		double total = 0;  //����Ҫ֧�����ܽ��
		
		//�Ľ�������ʹ�ö�������
		Product products[] = new Product[3];
		
		for (int i = 0; i < counts.length; i++) {
			//���������е�Ԫ��ʹ��ǰ��һ��Ҫ�ǵ÷���ռ�
			if(products[i] == null)
				products[i] = new Product();
			
			String name = JOptionPane.showInputDialog("��������Ʒ���ƣ�");
			products[i].setName(name);
			//�����û��������Ʒ���ۣ�Ϊ�ַ������� 
			String strPrice = JOptionPane.showInputDialog("��������Ʒ�ĵ��ۣ�");
			//��Ҫ���ַ�������ת��Ϊdouble����
			products[i].setPrice(Double.parseDouble(strPrice));
			String strCount = JOptionPane.showInputDialog("�����빺���������");
			counts[i] = Integer.parseInt(strCount);
						
			//�ۼ��ܽ��
			total += products[i].getPrice() * counts[i];
			
		}
		System.out.println("��Ʒ�ܽ��Ϊ��"+total);
		
	}
}
