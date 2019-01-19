package com.vpfeifer.urlShort.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vpfeifer.urlShort.repositories.ShortUrlRepository;
import com.vpfeifer.urlShort.entities.ShortUrl;
import com.vpfeifer.urlShort.exceptions.ShortUrlNotFoundException;

import javax.servlet.http.HttpServletResponse;

@RestController
class EmployeeController {

	private final ShortUrlRepository repository;

	EmployeeController(ShortUrlRepository repository) {
		this.repository = repository;
    }
    
	@GetMapping("/shortUrls")
	List<ShortUrl> all() {
		return repository.findAll();
	}

	@PostMapping("/shortUrls")
	ShortUrl create(@RequestBody ShortUrl newShortUrl) {
		ShortUrl shortUrl = new ShortUrl(newShortUrl.getUrl());
		return repository.save(shortUrl);
    }
    
	@GetMapping("/shortUrls/{id}")
	ShortUrl get(@PathVariable String id) {

		return repository.findById(id)
			.orElseThrow(() -> new ShortUrlNotFoundException(id));
	}

	@DeleteMapping("/shortUrls/{id}")
	void delete(@PathVariable String id) {
		repository.deleteById(id);
    }
    
    @GetMapping("/{id}")
	void redirect(@PathVariable String id, HttpServletResponse httpServletResponse) {
        ShortUrl shortUrl = get(id);
        httpServletResponse.setHeader("Location", shortUrl.getUrl());
        httpServletResponse.setStatus(302);
	}
}