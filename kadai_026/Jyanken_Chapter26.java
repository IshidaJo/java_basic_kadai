package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	// じゃんけんの手をキーとして、その名前を値とするマップを準備
	HashMap<String, String> jyankenMap;

	// コンストラクタ：じゃんけんの手とその名前をマップに追加
	Jyanken_Chapter26() {
		jyankenMap = new HashMap<>();
		jyankenMap.put("r", "グー");
		jyankenMap.put("s", "チョキ");
		jyankenMap.put("p", "パー");
	}

	// ユーザーの手を入力させるメソッド
	public String getMyChoice() {
		try (Scanner scanner = new Scanner(System.in)) {
			// ユーザーに繰り返しじゃんけんの手を選択させる
			while (true) {
				System.out.println("自分のじゃんけんの手を入力しましょう");
				System.out.println("グーはrockのrを入力しましょう");
				System.out.println("チョキはscissorsのsを入力しましょう");
				System.out.println("パーはpaperのpを入力しましょう");
				String choice = scanner.next();
				// 入力が正しい場合、手を表示して戻る
				if (jyankenMap.containsKey(choice)) {
					System.out.println("私の手は " + jyankenMap.get(choice) + " です。");
					return choice;
				} else {
					// 入力が無効な場合、再度入力を求める
					System.out.println("入力ミスです。再度手を選んでください。");
				}
			}
		}
	}

	// コンピュータの手をランダムに選ぶメソッド
	public String getRandom() {
		String[] jyankenList = { "r", "s", "p" };
		// 0から2の間の整数をランダムに生成
		int num = (int) Math.floor(Math.random() * 3);
		// コンピュータの手を表示
		System.out.println("相手の手は " + jyankenMap.get(jyankenList[num]) + " です。");
		return jyankenList[num];
	}

	// じゃんけんの結果を決定し、表示するメソッド
	public void playGame(String myChoice, String random) {
		// ユーザーが勝つ場合の条件
		if ((myChoice.equals("r") && random.equals("s")) ||
				(myChoice.equals("s") && random.equals("p")) ||
				(myChoice.equals("p") && random.equals("r"))) {
			System.out.println("あなたの勝ちです");
		}
		// ユーザーが負ける場合の条件
		else if ((myChoice.equals("s") && random.equals("r")) ||
				(myChoice.equals("p") && random.equals("s")) ||
				(myChoice.equals("r") && random.equals("p"))) {
			System.out.println("あなたの負けです");
		}
		// 引き分けの場合の条件
		else {
			System.out.println("あいこです");
		}
	}
}
