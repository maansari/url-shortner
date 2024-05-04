package implementation;

import interfaces.IShortURLGenerator;

import java.util.Random;
import java.util.stream.IntStream;

public class RandomShortURLGenerator implements IShortURLGenerator {

    public static final int SHORT_URL_LENGTH = 7;
    public static final String ALLOWED_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    private Random random = new Random();

    @Override
    public String generateShortURL() {
        char [] shortURLArray = new char[SHORT_URL_LENGTH];
        for (int i=0; i < SHORT_URL_LENGTH; i++){
            shortURLArray[i] = ALLOWED_CHARACTERS.charAt(random.nextInt(SHORT_URL_LENGTH));
        }
        String shortURL = new String(shortURLArray);
        //TODO - puta DB check for existing URL in DB

        return shortURL;
    }
}
