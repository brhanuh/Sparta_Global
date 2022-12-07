package com.spartaglobal.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CatDriver {
    /*
    {"name":"Star","dob":"2020-03-05","priority":0}
    <Cat><name>Star</name><dob>2020-03-05</dob><priority>0</priority></Cat>
     */
    public static void main(String[] args) throws JsonProcessingException {
        Cat angel = new Cat("Angel", LocalDate.of(2020, 3 , 5), 0);
        System.out.println(angel);
        CatConverter conv = new CatConverter();
        System.out.println(conv.Objecttojson(angel));
        System.out.println(conv.objectToXml(angel));
        System.out.println(conv.jsonToObject("{\"name\":\"Star\",\"dob\":\"2020-03-05\",\"priority\":0}"));
        System.out.println(conv.xmlToObject("<Cat><name>Star</name><dob>2020-03-05</dob><priority>0</priority></Cat>"));
        Cat star = conv.xmlToObject("<Cat><name>Star</name><dob>2020-03-05</dob><priority>0</priority></Cat>");
        List<Cat> cats = new ArrayList<>();
        cats.add(angel);
        cats.add(star);
        ObjectMapper mapper = new ObjectMapper();
        System.out.println(mapper.writeValueAsString(cats));
    }
}
;