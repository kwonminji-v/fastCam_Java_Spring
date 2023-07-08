package com.fastcampus.ch2;

import java.net.URLEncoder;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegisterController {

	//@RequestMapping을 간단하게 사용할 수 있게 도와주는 것 중 GetMapping과 PostMapping이 있음
	
	@RequestMapping("/register")
	@GetMapping("/add") // 4.3부터 추가
	public String register() {
		return "registerForm";  // WEB-INF/views/registerForm.jsp
	}
	
	
	
	//@RequestMapping(value="/register/save", method=RequestMethod.POST)
	@PostMapping("/add")
	public String save(User user, Model m) throws Exception {
		//1. 유효성을 검사하는 기능이 필요 (isValid 메서드로 입력받은 값을 체크하는데 사용)
		if (!isValid(user)) {
			String msg = URLEncoder.encode("id를 잘못 입력하셨습니다.", "utf-8");
			
			//return "redirect:/register/add?msg=" + msg; 아래 두줄과 동일한 의미의 문장
			m.addAttribute("msg", msg);
			return "redirect:/register/add";
			//Get방식으로 url 뒤에 에러 메세지를 전달 = URL제작성(rewriting) : URL을 수정한다는 의미
		}//유효하다면 DB에 저장 / 아니라면 다시 회원 가입 화면으로 돌아가기

		
		//2. DB에 회원 가입을 완료한 신규 회원의 데이터를 저장
		return "registerInfo";
	}

	private boolean isValid(User user) {
		return true;
	}
}
