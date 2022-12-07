package org.example;


import org.apache.logging.log4j.*;

public class Cat {
    public static Logger logger = LogManager.getLogger(Main.class);
    public static String meow(String name){

        logger.log(Level.ERROR, "My first log message!");
        logger.log(Level.WARN, "My Second log message");

        try{
            name = name.toUpperCase();
        }catch (NullPointerException e){
            logger.error(e.getMessage(), e);
        }
        System.out.println("Hello world");
        return name + " the cat meows!";
    }
}
