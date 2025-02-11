package kadai_018;

//加藤太郎を表すクラス

public class KatoTaro_Chapter18 extends Kato_Chapter18  {
	
	public void setGivenName() {
		this.givenName = "太郎";
	}
	
	@Override
	public void eachIntroduce() {
		System.out.println("私はJavaが得意です");
	}
	
}


//～～～～～要件～～～～～

//修飾子	戻り値	メソッド名	    用途
//public	void	setGivenName	名を表すフィールドの値をセットする

//setGivenNameで、各子クラスはgivenNameフィールドに次の値をセットしましょう。
//クラス名				    givenNameフィールドの値
//KatoTaro_Chapter18		太郎

//各子クラスは、親クラスの抽象メソッドであるeachIntroduceを次のように実装します。
//クラス名					eachIntroduceの実装
//KatoTaro_Chapter18		私はJavaが得意です、と出力する

//～～～～～備考～～～～～
//クラスの継承により、親クラス内のフィールドやメソッドを継承して使える
//メソッドのオーバーライドにより、親クラスのメソッドを上書きできる


