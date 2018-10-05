package hello;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.MalformedInputException;
import java.util.ArrayList;
import java.util.Scanner;


public class WebCrawler {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		System.out.println("������һ��url����http://��ͷ��");
		String strUrl = input.next();
		crawler(strUrl);
	}
	
	public static void crawler(String startUrl) throws IOException{
		//δ���ʵ�����
		ArrayList<String> listOfPendingURLs = new ArrayList<>();
		//���ʹ�������
		ArrayList<String> listOfTraversedURLs = new ArrayList<>();
		listOfPendingURLs.add(startUrl);
		
		while(!listOfPendingURLs.isEmpty() && listOfTraversedURLs.size() <= 100){
			String strUrl = listOfPendingURLs.remove(0);
			if(!listOfTraversedURLs.contains(strUrl)){ //���ʹ������Ӽ����в����������
				listOfTraversedURLs.add(strUrl);
				System.out.println("��ʼ�������ӣ�"+strUrl);
				for(String str : getSubURLs(strUrl)){
					if(!listOfTraversedURLs.contains(str)){
						listOfPendingURLs.add(str);
					}
				}
			}
		}
	}
	
	private static ArrayList<String> getSubURLs(String strUrl) throws IOException{
		ArrayList<String> urlList = new ArrayList<String>();
		try{
			URL url = new URL(strUrl);
			Scanner input = new Scanner(url.openStream());
			int current = 0;
			while(input.hasNext()){
				String line = input.nextLine();
				current = line.indexOf("http:",current);
				while(current > 0){
					int endIndex = line.indexOf("\"", current);
					if(endIndex > 0){
						urlList.add(line.substring(current, endIndex));
						current = line.indexOf("http:",endIndex);
					}else{
						current = -1;
					}
				}
			}
			input.close();
		}catch(MalformedInputException e){
			System.out.println("MalformedInputException:"+e.getMessage());
		}catch(IOException e){
			System.out.println("io�쳣��"+e.getMessage());
		}catch(Exception e){
			System.out.println("δ֪�쳣��"+e.getMessage());
		}
		return urlList;
	}
}

/** 
 * �㷨˵��
 * ����ʼURL��ӵ���ΪlistOfPendingURLs���б���
 * ��listOfPendingURLs��Ϊ�� �� ����<=100
 *       ��listOfPendingURLs�Ƴ�һ��url
 *       ���url����listOfPendingURLs��
 *             ������ӵ�������
 *             ��ʾ��url
 *             ��ȡ��url��ҳ�棬���ҶԸ�ҳ���а�����ÿ��url�������²�����
 *                 �������listOfPendingURLs�����
 */
