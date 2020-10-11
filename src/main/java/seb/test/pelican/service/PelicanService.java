package seb.test.pelican.service;

import org.springframework.stereotype.Service;
import seb.test.pelican.model.Translation;

;import java.security.InvalidParameterException;
import java.util.Map;


@Service
public class PelicanService {

    Map<String, String> CountriesWithGreeting = Map.ofEntries(Map.entry("Estonia", "tere"),
            Map.entry("Lithuania", "Labas"), Map.entry("Belgium", "Hallo"));

    public Translation getTranslation(String country) {
        String translatedWord = CountriesWithGreeting.get(country);
        if("Estonia".equals(country)) {
            return new Translation(translatedWord.substring(0, 1).toUpperCase() + translatedWord.substring(1));
        }
        return new Translation(translatedWord);
    }
}
