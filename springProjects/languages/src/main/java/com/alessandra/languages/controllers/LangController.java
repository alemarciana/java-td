package com.alessandra.languages.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.alessandra.languages.models.Language;
import com.alessandra.languages.services.LanguageService;

@Controller
public class LangController {
	private final LanguageService langService;
	public LangController(LanguageService langService) {
		this.langService = langService;
	}
	@RequestMapping("/languages")
	public String index(Model model) {
		List<Language> languages = langService.allLanguages();
		model.addAttribute("languages", languages);
		return "/views/index.jsp";
	}
	@RequestMapping(value="/languages", method=RequestMethod.POST)
	public String addLang(@Validated @ModelAttribute("lang") Language lang, BindingResult result) {
		if (result.hasErrors()) {
			return "/views/index.jsp";
		}
		else {	
			langService.addLanguage(lang);
			return "redirect:/languages";
		}
	}
	@RequestMapping("/languages/{id}")
	public String showLang(Model model, @PathVariable("id") Long id) {
		Language lang = langService.findLanguage(id);
		model.addAttribute("lang", lang);
		return "/views/show.jsp";
	}
	@RequestMapping(value="/languages/{id}", method=RequestMethod.DELETE)
	public String deleteLang(@PathVariable("id") Long id) {
		langService.deleteLanguage(id);
		return "redirect:/languages";
	}
	@RequestMapping("/languages/{id}/edit")
	public String editLang(@PathVariable("id") Long id, Model model) {
		Language lang = langService.findLanguage(id);
		model.addAttribute("lang", lang);
		return "/views/edit.jsp";
	}
	@RequestMapping(value="/languages/{id}", method=RequestMethod.PUT)
	public String updateLang(@Validated @ModelAttribute("lang") Language lang, BindingResult result, 
			@PathVariable("id") Long id) {
		if (result.hasErrors()) {
			return "/views/edit.jsp";
		}
		langService.updateLanguage(lang);
		return "redirect:/languages";
	}
}
