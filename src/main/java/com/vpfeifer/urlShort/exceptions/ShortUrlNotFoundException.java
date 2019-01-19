package com.vpfeifer.urlShort.exceptions;

public class ShortUrlNotFoundException extends RuntimeException {

	public ShortUrlNotFoundException(String id) {
		super("Could not find url for " + id);
	}
}