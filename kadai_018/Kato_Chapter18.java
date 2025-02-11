package kadai_018;

//親クラスは、抽象メソッドを持つので抽象クラスとする
public abstract class Kato_Chapter18 {
	
//	姓を表すフィールド
	public String familyName = "加藤";
//	名を表すフィールド
	public String givenName;
//	住所を表すフィールド
	public String address = "東京都中野区〇×";
	
//	共通の紹介を出力する
	public void commonIntroduce() {
		System.out.println("名前は" + familyName + givenName + "です" );
		System.out.println("住所は" + address + "です");
	}
//	個別の紹介を出力する
	public abstract void eachIntroduce();
	
//	紹介を実行する
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
		
	}
	
	

}



//～～～～～要件～～～～～
//親クラスを作成します。
//親クラスは、姓と名と住所を表すフィールドを持ちます。
//アクセス修飾子	データ型	フィールド名	用途
//public			String		familyName		姓を表す
//public			String		givenName		名を表す
//public			String		address			住所を表す

//修飾子、アクセス修飾子		戻り値			メソッド名				用途
//public	         			void			commonIntroduce			共通の紹介を出力する
//abstract、public				void			eachIntroduce			個別の紹介を出力する
//public						void			execIntroduce			紹介を実行する


//～～～～～備考～～～～～
//abstract void method1();
//抽象メソッドには、具体的な処理は記述せずメソッドの形式だけ定義する
