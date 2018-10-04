package hello;


public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer strBuf = new StringBuffer("Hello!");
		StringBuffer strBuf1 = new StringBuffer("Hello!");
//		System.out.println(strBuf.toString().equals(strBuf1.toString()));
		
//		strBuf.append('a');
//		strBuf.append(1213L);
//		System.out.println(strBuf);
		
//		System.out.println(strBuf.reverse());  //反转字符串
		
//		strBuf1.insert(3, "123");  //在规定下标处插入元素
//		System.out.println(strBuf1);
		
//		strBuf1.deleteCharAt(3);  //删除规定下标处的元素
//		System.out.println(strBuf1);
//		strBuf1.delete(2, 4);   //删除[2,4)下表之间的元素
//		System.out.println(strBuf1);
		
//		strBuf1.replace(2, 4, "BEIJING");  //[2,4)
//		System.out.println(strBuf1);
		
//		strBuf1.setCharAt(3, 'M');   //替换字符
//		System.out.println(strBuf1);
		
//		System.out.println("缓存大小：" + strBuf.capacity());  
		
//		strBuf.setLength(0);   //设置新长度，相当于清空了字符串对象
//		System.out.println(strBuf);
		
//		strBuf.trimToSize();  //调整缓冲区大小，节省空间
		
		
		
		
		
//		final int N = 100000;
//		long startTime = System.currentTimeMillis();
//		String str = "*";
//		for(int i = 0; i < N; ++i){  //10w次循环
//			str += "*";
//		}
//		long endTime = System.currentTimeMillis();
//		System.out.println("+=用时："+(endTime-startTime)+"毫秒");
//		
//		//使用StringBuffer进行字符串拼接
//		startTime = System.currentTimeMillis();
//		StringBuffer str1 = new StringBuffer("*");
//		for(int i = 0; i < N; ++i){  //10w次循环
//			str1.append("*");
//		}
//		endTime = System.currentTimeMillis();
//		System.out.println("StringBuffer的append用时："+(endTime-startTime)+"毫秒");
		
		
		
		
//		String str1 = "a";
//		String str2 = "b";
//		String str3 = str1 + str2;
////		str3 = str1.concat(str2);
//		
//		//底层实现：
//		String str4 = new StringBuffer(String.valueOf(str1)).append(str2).toString();
	}
}
