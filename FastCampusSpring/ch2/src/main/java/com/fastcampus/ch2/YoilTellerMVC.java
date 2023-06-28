package com.fastcampus.ch2;

import java.io.IOException;
import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


//�� �� ���� �Է��ϸ� ������ �˷��ִ� ���α׷�
@Controller
public class YoilTellerMVC { 
	//http://localhost/ch2/getYoilMVC?year=2023&month=3&day=23

	@RequestMapping("/getYoilMVC")
		//public void main(HttpServletRequest request, HttpServletResponse response) throws IOException 
		public String main(int year, int month, int day, Model model) throws IOException{
		//�Ѱܹ��� ������ �Ű������� �����������ν� �Էºκ��� ���ְ�, ��ºκ��� ���� ������ jsp���Ϸ� ��������ϴ�.
		
		//1. ��ȿ�� �˻��ϴ� �ڵ�
		if(!isValid(year, month, day))
			return "yoilError";
		
		
		//2. ������ ����߽��ϴ�.
		char yoil = getYoil(year, month, day);
		
		//3. ����� ����� model�� �����ؾ��մϴ�.
		//view�� ����ó������ �۾������ ����Ǿ��ִ� ���� view�� �������ݴϴ�.
		model.addAttribute("year", year);
		model.addAttribute("month", month);
		model.addAttribute("day", day);
		model.addAttribute("yoil", yoil);
		
		return "yoil"; 
		//�۾������ ������ view�� ��ȯ���ݴϴ�.
		//WEB-INF/views/yoil.jsp �� �����ش޶�� ����
	}

		private boolean isValid(int year, int month, int day) {
		
		return true;
	}

		private char getYoil(int year, int month, int day) {
			Calendar cal = Calendar.getInstance();
			cal.set(year,month - 1, day);
			
			int dayOfweek = cal.get(Calendar.DAY_OF_WEEK);
			return "�Ͽ�ȭ�������".charAt(dayOfweek);
		}

}
