package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	
	// 自分のじゃんけんの手を入力するメソッド
	public String getMyChoice() {
		// Scannaerクラスで自分のじゃんけんの手を入力できるようにする
		Scanner scanner = new Scanner(System.in);
		// 変数を宣言(じゃんけんの手の値が入る)
		String userHand;
			
		// 正しいじゃんけんの手であるか判定する
		while(true) {
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");
	
			userHand = scanner.next(); // ユーザーからの入力を受け取る (r、s、pが入る)
			
			// 入力した内容を出力する
			if (userHand.equals("r") || userHand.equals("s") || userHand.equals("p")) {
				// 正しいじゃんけんの手である場合、じゃんけんクラスを実行するクラスに自分のじゃんけんの手を返す。
				//正しい手が入ったらScannerクラスのオブジェクトをクローズする
				scanner.close();	 
				return userHand;
				
			}else {
				// 正しいじゃんけんの手でない場合はエラーを出力し、再度自分のじゃんけんの手を選ぶ
				System.out.println("エラーです。再度自分のじゃんけんの手を入力しましょう");
				continue;
			}
		}	
		
	}
	
	//対戦相手のじゃんけんの手を乱数で選ぶメソッド
	public String getRandom() {
		// 配列にじゃんけんの手をセットする
		String[] opponent = {"r","s","p"};
		// 乱数で対戦相手のじゃんけんの手を選ぶ
		String choice = opponent[(int)Math.floor(Math.random() * 3)];
			
		// じゃんけんクラスを実行するクラスに、対戦相手のじゃんけんの手を返す
		return choice;
	}
	
	// じゃんけんを行うメソッド
	public void playGame(String userHand,String opponent) {		
		// 自分と対戦相手のじゃんけんの手を出力する処理
		HashMap<String, String> hashmap  = new HashMap <>();
		hashmap.put("r", "グー");
		hashmap.put("s", "チョキ");
		hashmap.put("p", "パー");
		System.out.println("自分の手は" + hashmap.get(userHand) + ",対戦相手の手は" + hashmap.get(opponent) );
		
		// 自分と対戦相手のじゃんけんの手の比較
		// 比較だからif文？たぶんここでequals()を使う？
		if ((userHand.equals("r") && opponent.equals("s"))
				|| (userHand.equals("s") && opponent.equals("p"))
				|| (userHand.equals("p") && opponent.equals("r"))) {
			System.out.println("自分の勝ちです");
		// あいこ
		}else if (userHand.equals(opponent) ){
			System.out.println("あいこです");
		//負け	
		}else  { 
			System.out.println("自分の負けです");
		}	
	}
	
}