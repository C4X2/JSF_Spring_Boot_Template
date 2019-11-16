package com.emerald.comic.controllers.impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.emerald.comic.controllers.model.EmeraldComicPageController;


@Controller
@RequestMapping(value = "")
public class IndexPageController implements EmeraldComicPageController
{
	private static final String INDEX_PAGE = "index";

	@GetMapping()
	@Override
	public String doGet()
	{
		return INDEX_PAGE;
	}
}