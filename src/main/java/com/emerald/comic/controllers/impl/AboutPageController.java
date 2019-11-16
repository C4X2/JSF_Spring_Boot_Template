package com.emerald.comic.controllers.impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.emerald.comic.controllers.model.EmeraldComicPageController;

@Controller
@RequestMapping(value = "/about")
public class AboutPageController implements EmeraldComicPageController
{
	private static final String ABOUT_PAGE = "about";

	@GetMapping()
	@Override
	public String doGet()
	{
		return ABOUT_PAGE;
	}

}