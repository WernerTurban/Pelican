package seb.test.pelican.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import seb.test.pelican.exception.TranslationNotFoundException;
import seb.test.pelican.model.Translation;
import seb.test.pelican.service.PelicanService;

@RestController
@CrossOrigin
public class PelicanController {

    @Autowired
    private PelicanService pelicanService;

    @GetMapping("/country/{country}/{word}")
    public ResponseEntity<Object> translate(@PathVariable String country, @PathVariable String word) {
        if(!word.equals("Hello")) {
            return new ResponseEntity<>(new TranslationNotFoundException("Translation does not exist for " + word),
                    HttpStatus.BAD_REQUEST);
        } else {
            Translation translation = pelicanService.getTranslation(country);
            if(translation.getData() == null) {
                return new ResponseEntity<>(new TranslationNotFoundException(country + ": no translations found"),
                        HttpStatus.BAD_REQUEST);
            } else {
                return new ResponseEntity<>(pelicanService.getTranslation(country), HttpStatus.OK);
            }
        }
    }
}
