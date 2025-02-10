package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	HashMap<String, String> jisho;

	public Dictionary_Chapter21() {
		jisho = new HashMap<String, String>();

		jisho.put("apple", "りんご");
		jisho.put("peach", "桃");
		jisho.put("banana", "バナナ");
		jisho.put("lemon", "レモン");
		jisho.put("pear", "梨");
		jisho.put("kiwi", "キウイ");
		jisho.put("grape", "ぶどう");
		jisho.put("muscat", "マスカット");
		jisho.put("cherry", "さくらんぼ");
	}

	public void searchWords(String[] words) {

		for (int i = 0; i < words.length; i++) {
			if (jisho.containsKey(words[i])) {
				System.out.println(words[i] + "の意味は" + jisho.get(words[i]));
			} else {
				System.out.println(words[i] + "は辞書に存在しません");
			}
		}
	}

}
