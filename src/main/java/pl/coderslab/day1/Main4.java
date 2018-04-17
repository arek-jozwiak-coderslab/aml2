package pl.coderslab.day1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main4 {
    public static void main(String[] args) {
        Pattern compiledPattern = Pattern.compile(".*reg.*");
        Matcher matcher = compiledPattern.matcher("Wyrażenia regularne w Javie");
        System.out.println(matcher.find());
        System.out.println(matcher.matches());


        String text1 = "1123";
        System.out.println(text1.matches("\\d+"));
        String text2 = "abc1";
        System.out.println(text2.matches("\\D+"));

    }
}
