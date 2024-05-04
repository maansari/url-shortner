package implementation;

import interfaces.IShortURLGenerator;

import java.util.Random;

public class RandomShortURLGenerator implements IShortURLGenerator {

    public static final int SHORT_URL_LENGTH = 7;
    public static final String ALLOWED_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    private Random random = new Random();

    @Override
    public String generateShortURL() {

        System.out.println(random.ints());
        return null;
    }
}
