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
        for (int i=0; i < SHORT_URL_LENGTH; i++){

        }

        return null;
    }
}
