package hello;

import javax.swing.JOptionPane;

//商品管理类
public class ProductBiz {
	public static void main(String[] args) {
		//用来保存每种商品的总量
		int counts[] = new int[3];
		double total = 0;  //最终要支付的总金额
		
		//改进方案，使用对象数组
		Product products[] = new Product[3];
		
		for (int i = 0; i < counts.length; i++) {
			//对象数组中的元素使用前，一定要记得分配空间
			if(products[i] == null)
				products[i] = new Product();
			
			String name = JOptionPane.showInputDialog("请输入商品名称：");
			products[i].setName(name);
			//接收用户输入的商品单价，为字符串类型 
			String strPrice = JOptionPane.showInputDialog("请输入商品的单价：");
			//需要将字符串类型转化为double类型
			products[i].setPrice(Double.parseDouble(strPrice));
			String strCount = JOptionPane.showInputDialog("请输入购买的数量：");
			counts[i] = Integer.parseInt(strCount);
						
			//累加总金额
			total += products[i].getPrice() * counts[i];
			
		}
		System.out.println("商品总金额为："+total);
		
	}
}
