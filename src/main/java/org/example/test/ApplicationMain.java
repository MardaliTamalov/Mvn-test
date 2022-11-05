package org.example.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class ApplicationMain
{

    public static void main( String[] args ){
        SpringApplication.run(ApplicationMain.class, args);
        System.out.println("привет мир");
   }
}
