package kadai_018;

//加藤一郎を表すクラス
public class KatoIchiro_Chapter18 extends Kato_Chapter18{

	public void setGivenName() {
		this.givenName = "一郎";
	}
	
	@Override
	public void eachIntroduce() {
		System.out.println("好きな食べ物はリンゴです");
	}
}



//修飾子	戻り値	メソッド名	    用途
//public	void	setGivenName	名を表すフィールドの値をセットする

//setGivenNameで、各子クラスはgivenNameフィールドに次の値をセットしましょう。
//クラス名					givenNameフィールドの値
//KatoIchiro_Chapter18		一郎

//各子クラスは、親クラスの抽象メソッドであるeachIntroduceを次のように実装します。
//クラス名					eachIntroduceの実装
//KatoIchiro_Chapter18	    好きな食べ物はリンゴです、と出力する