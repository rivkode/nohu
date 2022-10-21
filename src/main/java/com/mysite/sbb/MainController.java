package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	
	@RequestMapping("/sbb")
	@ResponseBody
	public String index() {
		return "안녕하세요 sbb에 오신것을 환영합니다.";
	}

	@RequestMapping("/")
//	public String root() { // 기존 게시판 메인 화면
//		return "redirect:/question/list";
//	}
	public String root() {
		return "redirect:/user/home";
	}
}
