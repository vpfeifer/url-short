package com.vpfeifer.urlShort.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vpfeifer.urlShort.entities.ShortUrl;

public interface ShortUrlRepository extends JpaRepository<ShortUrl, String> {

}