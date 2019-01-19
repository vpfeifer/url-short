package com.vpfeifer.urlShort.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class ShortUrl {

    private @Id String id;
    private String url;

    public ShortUrl()
    {
        
    }

    public ShortUrl(String url) {
        this.id = generateId(10);
        this.url = url;
    }

    private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvxzw0123456789";
    private static String generateId(int count) {
        StringBuilder builder = new StringBuilder();
        while (count-- != 0) {
            int character = (int) (Math.random() * ALPHA_NUMERIC_STRING.length());
            builder.append(ALPHA_NUMERIC_STRING.charAt(character));
        }
        return builder.toString();
    }
}