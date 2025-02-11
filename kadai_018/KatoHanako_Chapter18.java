package kadai_018;

//加藤花子を表すクラス
public class KatoHanako_Chapter18 extends Kato_Chapter18{
	
	public void setGivenName() {
		this.givenName = "花子";
	}
	
	
	@Override
	public void eachIntroduce() {
		System.out.println("趣味は読書です");
	}

}



//修飾子	戻り値	メソッド名	    用途
//public	void	setGivenName	名を表すフィールドの値をセットする

//setGivenNameで、各子クラスはgivenNameフィールドに次の値をセットしましょう。
//クラス名				givenNameフィールドの値
//KatoHanako_Chapter18	花子

//各子クラスは、親クラスの抽象メソッドであるeachIntroduceを次のように実装します。
//クラス名					eachIntroduceの実装
//KatoHanako_Chapter18	    趣味は読書です、と出力する