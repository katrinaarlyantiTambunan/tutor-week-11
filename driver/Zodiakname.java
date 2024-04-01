package driver;
import model.Aries;
import model.Gemini;
import model.Taurus;
import model.ZodiacType;
import  java.util.*;
import model.Zodiac;

public class Zodiakname {
    public static void main(String[] args) {
        Zodiac myZodiac;

        // Polymorphism
        for (ZodiacType type : ZodiacType.values()) {
            switch (type) {
                case Aries:
                    myZodiac = new Aries();
                    break;
                case Taurus:
                    myZodiac = new Taurus();
                    break;
                case Gemini:
                    myZodiac = new Gemini();
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + type);
            }

            myZodiac.printZodiacElement();
        }
    }
}