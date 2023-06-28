package com.fastcampus.ch2;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;


class ModelController {
	public String main(HashMap map) {
		//작업 결과를 맵에 저장합니다.
		map.put("id", "asdf");
		map.put("pwd", "1111");
		
		return "txtView2"; //뷰 이름을 반환합니다.
	}
}


public class MethodCall {
	public static void main(String[] args) throws Exception{
		HashMap map = new HashMap();
		System.out.println("map이 생성되기 전"+map);
		//메인메서드에서 맵을 먼저 생성 후 하단의 컨트롤러를 생성해서 메인 메서드를 호출합니다.
		
		ModelController mc = new ModelController();
		String viewName = mc.main(map);
		
		System.out.println("모델 컨트롤러에 map을 전달 후 호출 :"+map);
		
		render(map, viewName);
	}
	
	static void render(HashMap map, String viewName) throws IOException {
		String result = "";
		
		// 1. 뷰의 내용을 한줄씩 읽어서 하나의 문자열로 만든다.
		Scanner sc = new Scanner(new File(viewName+".txt"));
		
		while(sc.hasNextLine())
			result += sc.nextLine()+ System.lineSeparator();
		
		// 2. map에 담긴 key를 하나씩 읽어서 template의 ${key}를 value바꾼다.
		Iterator it = map.keySet().iterator();
		
		while(it.hasNext()) {
			String key = (String)it.next();

			// 3. replace()로 key를 value 치환한다.
			result = result.replace("${"+key+"}", (String)map.get(key));
		}
		
		// 4.렌더링 결과를 출력한다.
		System.out.println(result);
	}
}


//[txtView1.txt]
//id=${id}, pwd=${pwd}
//
//[txtView2.txt]
//id:${id}
//pwd:${pwd}
//
//
//
//[실행결과]
//before:{}
//after :{id=asdf, pwd=1111}
//[txtView2.txt]
//id:asdf
//pwd:1111
