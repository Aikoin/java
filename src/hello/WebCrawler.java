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
		System.out.println("请输入一个url：（http://开头）");
		String strUrl = input.next();
		crawler(strUrl);
	}
	
	public static void crawler(String startUrl) throws IOException{
		//未访问的链接
		ArrayList<String> listOfPendingURLs = new ArrayList<>();
		//访问过的链接
		ArrayList<String> listOfTraversedURLs = new ArrayList<>();
		listOfPendingURLs.add(startUrl);
		
		while(!listOfPendingURLs.isEmpty() && listOfTraversedURLs.size() <= 100){
			String strUrl = listOfPendingURLs.remove(0);
			if(!listOfTraversedURLs.contains(strUrl)){ //访问过的链接集合中不包含就添加
				listOfTraversedURLs.add(strUrl);
				System.out.println("开始访问链接："+strUrl);
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
			System.out.println("io异常："+e.getMessage());
		}catch(Exception e){
			System.out.println("未知异常："+e.getMessage());
		}
		return urlList;
	}
}

/** 
 * 算法说明
 * 将起始URL添加到名为listOfPendingURLs的列表中
 * 当listOfPendingURLs不为空 且 长度<=100
 *       从listOfPendingURLs移除一个url
 *       如果url不在listOfPendingURLs中
 *             将其添加到集合中
 *             显示该url
 *             读取该url的页面，并且对该页面中包含的每个url进行如下操作：
 *                 如果不在listOfPendingURLs则添加
 */
