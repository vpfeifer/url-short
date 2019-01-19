package com.vpfeifer.urlShort.repositories;

import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.vpfeifer.urlShort.entities.ShortUrl;

@Configuration
@Slf4j
class LoadDatabase {

	@Bean
	CommandLineRunner initDatabase(ShortUrlRepository repository) {
		return args -> {
			repository.save(new ShortUrl("https://www.google.com/search?tbm=isch&source=hp&biw=1920&bih=981&ei=wntDXNq4GaCw5OUPkOGvgAk&q=leao&oq=leao&gs_l=img.3..0l10.5349.5789..7002...0.0..0.100.358.3j1......2....1..gws-wiz-img.....0.tncIS5EK-Jg"));
			repository.save(new ShortUrl("https://www.google.com/search?biw=1920&bih=981&tbm=isch&sa=1&ei=yntDXMRVgLPk5Q-x7r7YAw&q=irish&oq=irish&gs_l=img.3..0l10.2478.3447..3740...0.0..0.87.405.5......1....1..gws-wiz-img.......35i39j0i67.u1RjF6-laFI"));
		};
	}
}