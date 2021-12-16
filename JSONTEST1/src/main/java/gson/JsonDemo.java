package gson;

import com.google.gson.Gson;

public class JsonDemo {

	public static void main(String[] args) {
		//Personクラスの配列を作成
		Person[] persons = {
				new Person("Kaede Karen",22),
				new Person("Hoshina Ai",26),
		};
		
		Gson gson = new Gson();
		//Personクラスの配列を、JSON文字列に変換
		String jstr = gson.toJson(persons, Person[].class);
		System.out.println(jstr);
		//実行結果:	[{"name":"Kaede Karen","age":22},{"name":"Hoshina Ai","age":26}]
		
		//JSON文字列を、Personクラスの配列に変換
		persons = gson.fromJson(jstr, Person[].class);
		for(Person p : persons) {
			System.out.println(p);
		}
		/*実行結果
		 *name=Kaede Karen,age=22
		 *name=Hoshina Ai,age=26
		 */
	}

}
