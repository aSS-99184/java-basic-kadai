package kadai_021;
//辞書クラスを実行するクラス

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
//		辞書クラスのインスタンスを生成する
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
		
		//調べる英単語に配列をセットする
		String[] wordArray = {"apple", "banana", "grape", "orange"};
		
		//辞書を調べるメソッドを引数指定で呼び出す
		dictionary.checkword(wordArray);
	}
}

//～～～～～要件～～～～～

//辞書クラスのインスタンスを生成する
//調べる英単語に配列をセットする
//辞書を調べるメソッドを引数指定で呼び出す


//～～～～～備考～～～～～
//配列の書き方
//データ型[] 配列名; 
//データ型[] 配列名 = new データ型[要素数];

//配列の飼う要素を順番に調べる書き方
//for( データ型 ループ用変数名 : 配列名 ) {
//    反復処理;
//}
