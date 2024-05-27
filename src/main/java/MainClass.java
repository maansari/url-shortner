import implementation.BaseConversionShortURLGenerator;
import implementation.RandomShortURLGenerator;
import interfaces.IShortURLGenerator;

public class MainClass {

    public static void main(String[] args) {
        IShortURLGenerator shortURLGenerator = new RandomShortURLGenerator();
        String shortLink = shortURLGenerator.generateShortURL();
        //System.out.println("Short Link --->"+ shortLink);


        IShortURLGenerator baseConversionShortURLGenerator = new BaseConversionShortURLGenerator();
        System.out.println("Short Link --->"+ baseConversionShortURLGenerator.generateShortURL());
        System.out.println("Long Link --->"+ baseConversionShortURLGenerator.getLongURL("1L9zO9O"));
    }
}
