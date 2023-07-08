package com.fastcampus.ch2;

import java.net.URLEncoder;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegisterController {

	//@RequestMapping�� �����ϰ� ����� �� �ְ� �����ִ� �� �� GetMapping�� PostMapping�� ����
	
	@RequestMapping("/register")
	@GetMapping("/add") // 4.3���� �߰�
	public String register() {
		return "registerForm";  // WEB-INF/views/registerForm.jsp
	}
	
	
	
	//@RequestMapping(value="/register/save", method=RequestMethod.POST)
	@PostMapping("/add")
	public String save(User user, Model m) throws Exception {
		//1. ��ȿ���� �˻��ϴ� ����� �ʿ� (isValid �޼���� �Է¹��� ���� üũ�ϴµ� ���)
		if (!isValid(user)) {
			String msg = URLEncoder.encode("id�� �߸� �Է��ϼ̽��ϴ�.", "utf-8");
			
			//return "redirect:/register/add?msg=" + msg; �Ʒ� ���ٰ� ������ �ǹ��� ����
			m.addAttribute("msg", msg);
			return "redirect:/register/add";
			//Get������� url �ڿ� ���� �޼����� ���� = URL���ۼ�(rewriting) : URL�� �����Ѵٴ� �ǹ�
		}//��ȿ�ϴٸ� DB�� ���� / �ƴ϶�� �ٽ� ȸ�� ���� ȭ������ ���ư���

		
		//2. DB�� ȸ�� ������ �Ϸ��� �ű� ȸ���� �����͸� ����
		return "registerInfo";
	}

	private boolean isValid(User user) {
		return true;
	}
}
