package seb.test.pelican.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import seb.test.pelican.model.Translation;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class PelicanServiceTest {

    @InjectMocks
    PelicanService pelicanService;

    @Test
    public void getEstonianTranslation() {
        Translation translation = pelicanService.getTranslation("Estonia");
        assertEquals(translation.getData(), "Tere");
    }

    @Test
    public void getLithuanianTranslation() {
        Translation translation = pelicanService.getTranslation("Lithuania");
        assertEquals(translation.getData(), "Labas");
    }

    @Test
    public void getBelgianTranslation() {
        Translation translation = pelicanService.getTranslation("Belgium");
        assertEquals(translation.getData(), "Hallo");
    }

    @Test
    public void getLatvianTranslation() {
        Translation translation = pelicanService.getTranslation("Latvia");
        assertNull(translation.getData());
    }
}
