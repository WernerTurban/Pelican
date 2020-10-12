package seb.test.pelican.service;

import org.springframework.stereotype.Service;
import seb.test.pelican.model.Translation;
import seb.test.pelican.utils.CountryGreetingHelper;

@Service
public class PelicanService {

    public Translation getTranslation(String country) {
        String translatedWord = CountryGreetingHelper.getCountriesWithGreeting().get(country);
        if("Estonia".equals(country)) {
            return new Translation(translatedWord.substring(0, 1).toUpperCase() + translatedWord.substring(1));
        }
        return new Translation(translatedWord);
    }
}
