package com.emerald.comic.controllers.impl;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/error")
public class ErrorPageController
{
	private static final String ERROR_PAGE = "error";

	@GetMapping
	public ModelAndView doGet(ModelAndView mav)
	{
		mav.setViewName(ERROR_PAGE);
		mav.setStatus(HttpStatus.valueOf(404));
		return mav;
	}
}
