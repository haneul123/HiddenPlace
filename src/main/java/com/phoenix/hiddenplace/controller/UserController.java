package com.phoenix.hiddenplace.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.phoenix.hiddenplace.service.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {

	@Inject
	private UserService service;

	@RequestMapping(value = "/userInsertView", method = RequestMethod.GET)
	public String insertGET() throws Exception {
		System.out.println("회원가입 컨트롤러 도착");

		return "/views/user/userInsertView";
	}

	// // 회원가입 이거 대신 UserControllerRest에서 수행
	// @RequestMapping(value = "/userInsertView", method = RequestMethod.POST)
	// public String insert(User user, RedirectAttributes rttr) throws Exception {
	//
	// System.out.println(user.toString());
	//
	// service.create(user);
	//
	// rttr.addFlashAttribute("result", "success");
	//
	// return "redirect:/views/user/userInsertView";
	// }



	// 회원탈퇴
	@RequestMapping(value = "/deleteUser")
	public void test1(@RequestParam("userPw") String userPw) {
		System.out.println("deleteUser 파일 호출");
		System.out.println(userPw);
		try {
			// service.delete(userPw);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}