package com.fastcampus.ch2;

import java.io.IOException;
import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


//년 월 일을 입력하면 요일을 알려주는 프로그램
@Controller
public class YoilTellerMVC { 
	//http://localhost/ch2/getYoilMVC?year=2023&month=3&day=23

	@RequestMapping("/getYoilMVC")
		//public void main(HttpServletRequest request, HttpServletResponse response) throws IOException 
		public String main(int year, int month, int day, Model model) throws IOException{
		//넘겨받을 값들을 매개변수로 선언을함으로써 입력부분을 없애고, 출력부분은 같은 내용을 jsp파일로 만들었습니다.
		
		//1. 유효성 검사하는 코드
		if(!isValid(year, month, day))
			return "yoilError";
		
		
		//2. 요일을 계산했습니다.
		char yoil = getYoil(year, month, day);
		
		//3. 계산한 결과를 model에 저장해야합니다.
		//view는 디스패처서블릿이 작업결과가 저장되어있는 모델을 view로 전달해줍니다.
		model.addAttribute("year", year);
		model.addAttribute("month", month);
		model.addAttribute("day", day);
		model.addAttribute("yoil", yoil);
		
		return "yoil"; 
		//작업결과를 보여줄 view를 반환해줍니다.
		//WEB-INF/views/yoil.jsp 를 리턴해달라는 문장
	}

		private boolean isValid(int year, int month, int day) {
		
		return true;
	}

		private char getYoil(int year, int month, int day) {
			Calendar cal = Calendar.getInstance();
			cal.set(year,month - 1, day);
			
			int dayOfweek = cal.get(Calendar.DAY_OF_WEEK);
			return "일월화수목금토".charAt(dayOfweek);
		}

}
