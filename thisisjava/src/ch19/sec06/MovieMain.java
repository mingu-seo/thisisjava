package ch19.sec06;

import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

public class MovieMain {

	public static void main(String[] args) {
		MovieAPI api = new MovieAPI();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("검색어:");
		String sword = scan.nextLine();
		String result = api.getMovie(sword);
		//System.out.println(result);
		
		JSONObject obj = new JSONObject(result);
		JSONArray items = obj.getJSONArray("items");
		for (int i=0; i<items.length(); i++) {
			JSONObject item = items.getJSONObject(i);
			System.out.print(item.getString("title")+"\t");
			System.out.print(item.getString("link")+"\t");
			System.out.print(item.getString("image")+"\t");
			System.out.println();
		}
		System.out.println();
	}

}





