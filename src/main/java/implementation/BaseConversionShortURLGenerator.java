package implementation;

import interfaces.IShortURLGenerator;

public class BaseConversionShortURLGenerator implements IShortURLGenerator {

    private static int COUNTER = 1000;
    public static final String elements = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private static final String BASE_URL = "https://myURLShortner.com/";
    @Override
    public String generateShortURL() {
        String shortURL = convertBase10ToBase62(COUNTER);
        COUNTER++;
        return BASE_URL+shortURL;
    }

    @Override
    public String getLongURL(String shortURL){
        String url = shortURL.substring(BASE_URL.length());
        String longURL = convertBase62ToBase10(url);
        return longURL;
    }

    private String convertBase62ToBase10(String url) {
        //1L9zO9O
        for (int i=0; i<url.length(); i++){
            char c = url.charAt(i);

        }
        return null;
    }

    private String convertBase10ToBase62(int number) {
        if( number == 0)
            return "0";

        StringBuilder stringBuilder = new StringBuilder();
        while (number != 0) {
            stringBuilder.insert(0,elements.charAt(number % 62));
            number = number/ 62;
        }

        if(stringBuilder.length() < 7){
            for( int i= stringBuilder.length(); i < 7; i++){
                stringBuilder.insert(0,'0');
            }
        }

        return stringBuilder.toString();
    }

}
