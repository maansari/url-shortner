package implementation;

import interfaces.IShortURLGenerator;

public class BaseConversionShortURLGenerator implements IShortURLGenerator {

    private static int COUNTER = 1000;
    public static final String elements = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    @Override
    public String generateShortURL() {
        String shortURL = convertBase10ToBase62(COUNTER);
        return shortURL;
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
