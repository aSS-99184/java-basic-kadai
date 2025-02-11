package kadai_018;

public class KatoExec_Chapter18 {

	 public static void main(String[] args) {
//各子クラスのインスタンスを作成する
		KatoTaro_Chapter18 taro = new KatoTaro_Chapter18();
		KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18();
		KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();
		
//setGivenNameメソッドを実行する
		taro.setGivenName();
        ichiro.setGivenName();
        hanako.setGivenName();

		
//execlntroduceメソッドを実行する
        taro.execIntroduce();
        System.out.println("");
        
        ichiro.execIntroduce();
        System.out.println("");
        
        hanako.execIntroduce();
        System.out.println("");
    }
	
}


//～～～～要件～～～～～～

//子クラスを実行するクラスを作成します
//start
//各子クラスのインスタンスを作成する
//setGivenNameメソッドを実行する
//execlntroduceメソッドを実行する
//end

//Kato_Chapter18 クラスで execIntroduce を定義しておく