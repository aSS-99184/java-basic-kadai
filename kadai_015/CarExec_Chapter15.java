package kadai_015;

public class CarExec_Chapter15 {

	public static void main(String[] args) {
		
		Car_Chapter15 speedometer = new Car_Chapter15();
		speedometer.gearChange(3);
		speedometer.run();
		
	}	
}



//～～～～～～～～学習メモ～～～～～～～～
//クラス名 インスタンス名 = new クラス名( データ1, データ2,・・・);
//ここでのインスタンス名ってなんだろう→任意でいいらしい
//Car_Chapter15 run = new Car_Chapter15(3 , 30);
//run.gearChange(3);
//}

//実行したら、ギア3から3に切り替えましたと表示された