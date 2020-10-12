package seb.test.pelican.utils;

import java.util.Map;

public class CountryGreetingHelper {

    private static final Map<String, String> COUNTRIES_WITH_GREETING = Map.ofEntries(Map.entry("Estonia",
            "tere"), Map.entry("Lithuania", "Labas"), Map.entry("Belgium", "Hallo"));

    public static Map<String, String> getCountriesWithGreeting() {
        return COUNTRIES_WITH_GREETING;
    }
}
