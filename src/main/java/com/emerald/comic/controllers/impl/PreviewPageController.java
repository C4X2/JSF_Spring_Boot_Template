package com.emerald.comic.controllers.impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.emerald.comic.controllers.model.EmeraldComicPageController;

@Controller
@RequestMapping(value = "/preview")
public class PreviewPageController implements EmeraldComicPageController
{
	private static final String PREVIEW_PAGE = "preview";
	
	@GetMapping()
	@Override
	public String doGet()
	{
		return PREVIEW_PAGE;
	}

}
