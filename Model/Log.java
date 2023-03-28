package org.example.Model;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;
import java.util.logging.Logger;

public class Log {
    public static void sort(double args) {

        Logger logger = Logger.getLogger(Log.class.getName());
        FileHandler fh;
        try {
            fh = new FileHandler("log.txt");
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
            logger.info("Действие выполнено,результат  "+ args +"  записан  "+"\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
