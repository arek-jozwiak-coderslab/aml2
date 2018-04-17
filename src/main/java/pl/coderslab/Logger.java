package pl.coderslab;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;

public class Logger {

    final static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(Logger.class);

    public static void main(String[] args) {
        String s = " a b c";
        logger.info(s);
        logger.debug(s);
        logger.warn(s);
        logger.error(s);
        String s2 = StringUtils.deleteWhitespace(s);
        System.out.println(s2);
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

    }
}
