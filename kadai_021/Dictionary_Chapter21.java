//辞書クラス

package kadai_021;
import java.util.HashMap;

public class Dictionary_Chapter21{
	
//	検索したい文字列を引数に指定している
	public static void dictionary(String[] words){
		HashMap<String,String>dictionary = new HashMap<String,String>();
		
	 
	 
		dictionary.put("apple", "りんご");
		dictionary.put("peach", "桃");
		dictionary.put("banana","バナナ");
		dictionary.put("lemon","レモン");
		dictionary.put("pear","梨");
		dictionary.put("kiwi","キウィ");
		dictionary.put("strawberry","いちご");
		dictionary.put("grape","ぶどう");
		dictionary.put("muscat","マスカット");
		dictionary.put("cherry","さくらんぼ");
		
		
		for(String word:words) {
			
			String mean = dictionary.get(word);
		
			if(mean==null) {
				System.out.println("辞書にデータが存在しません");
			}else {
				System.out.println(word+"の意味は"+mean);
			}
			
		}
		
		
	}
	
	
	

	
	

}
