import implementation.RandomShortURLGenerator;
import interfaces.IShortURLGenerator;

public class MainClass {

    public static void main(String[] args) {
        IShortURLGenerator shortURLGenerator = new RandomShortURLGenerator();
        String shortLink = shortURLGenerator.generateShortURL();
        System.out.println("Short Link --->"+ shortLink);
    }
}
