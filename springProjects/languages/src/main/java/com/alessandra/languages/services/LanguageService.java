package com.alessandra.languages.services;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.alessandra.languages.models.Language;
import com.alessandra.languages.repositories.LanguageRepository;

@Service
public class LanguageService {
	private final LanguageRepository langRepository;
	public LanguageService(LanguageRepository langRepository) {
		this.langRepository = langRepository;
	}
	public List<Language> allLanguages() {
		return langRepository.findAll();
	}
	public Language addLanguage(Language lang) {
		return langRepository.save(lang);
	}
	public Language findLanguage(Long id) {
		Optional<Language> optionalLang = langRepository.findById(id);
		if( optionalLang.isPresent() ) {
			return optionalLang.get();
		}
		else {
			return null;
		}
	}
	public Language updateLanguage(Long id, String name, String creator, String version) {
		Language lang = findLanguage(id);
		lang = new Language(name, creator, version);
		// lang.setName(name); lang.setCreator(creator); lang.setVersion(version);
		lang.setId(id);
		return langRepository.save(lang);
	}
	public Language updateLanguage(Language lang) {
		return langRepository.save(lang);
	}
	public void deleteLanguage(Long id) {
		langRepository.deleteById(id);
	}
}