package kadai_021;

import java.util.HashMap;

//辞書クラス

public class Dictionary_Chapter21 {
	
//インスタンス変数dictionaryを宣言する
	HashMap<String,String> dictionary;
	
//	コンストラクタでdictionaryを初期化する
	public Dictionary_Chapter21() {
		
		//辞書として機能するHashMapを宣言する
//		dictionaryという変数に、新しいHashMapを作って代入。
		dictionary = new HashMap<String,String>();
		
		//辞書に、次の10通りの英単語と意味を追加する
		dictionary.put("apple", "りんご");
		dictionary.put("peach", "桃");
		dictionary.put("banana", "バナナ");
		dictionary.put("banana", "バナナ");
		dictionary.put("lemon", "レモン");
		dictionary.put("pear", "梨");
		dictionary.put("kiwi", "キウイ");
		dictionary.put("strawberry", "いちご");
		dictionary.put("grape", "ぶどう");
		dictionary.put("muscat", "マスカット");
		dictionary.put("cherry", "さくらんぼ");
		
	}
	
	//繰り返し処理を使い、調べる英単語が辞書に追加されているか判定するメソッド
	public void checkword(String[] wordArray) {
		
		for( String word : wordArray) {
			
			String wordMean = dictionary.get(word);
			//辞書に存在するなら
			if( wordMean != null ) {
				System.out.println(word + "の意味は" +  wordMean);
			//辞書に存在しないなら
			}else {
				System.out.println( word + "は辞書に存在していません");
				
			}
		}
	}
}




//～～～～～要件～～～～～
//次の通りの辞書として機能するHashMapを宣言する
//キーの型	値の型	用途
//String	String	英単語の辞書として機能する

//辞書に、次の10通りの英単語と意味を追加する
//英単語		意味
//apple			りんご
//peach			桃
//banana		バナナ
//lemon			レモン
//pear			梨
//kiwi			キウィ
//strawberry	いちご
//grape			ぶどう
//muscat		マスカット
//cherry		さくらんぼ
//
//繰り返し処理を使い、調べる英単語が辞書に追加されているか判定する

//～～～～～～備考～～～～～
//HashMap<Integer,String> 変数 = new HashMap<Integer,String>();
//変数.get(1);
//HashMapの宣言時に作成した変数.get(取得する要素のキー)

//配列の宣言は、
//データ型[] 配列名; 

//辞書を調べるメソッド
//public void checkword() {	
//}


//～～～～～修正したもの～～～～～
//public void checkword(){
//	
//	for (int i = 0; i < wordArray.length; i++) {
//		System.out.println(dictionary.get(wordArray[i]));
//		
//		if( dictionary.get(dictionary) == null) {
//			System.out.println("辞書に存在していません");
//			
//		}else {
//			System.out.println( wordArray + "の意味は" +  dictionary);
//			
//		}
//	}
//}

