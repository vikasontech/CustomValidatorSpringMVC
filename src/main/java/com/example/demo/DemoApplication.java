package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }




//    public static void main(String[] args) {
//        List<String> strings = Arrays.asList(
//                "qwerrqw",
//                "1234",
//                "ูวิชั่นส์ประกา#$!@#$ 32ศถ่ายท อดสด",
//                "ส์ประก ส์ประก",
//                "รูวิชั่นส์ประกา",
//                "รูวิชั่นส์ปร232ะกา",
//                "รูวิชั่นส์ปร2 32ะกา",
//                "!$!@#$!@#$!",
//                "abcd",
//                "abcd xyz",
//                "abcd134abcd"
//
//        );
//
//        System.out.println("");
//        System.out.println("$$$$$$$$$$$$$$$$$$ English Only");
//        strings.forEach(e -> {
//            if (
//                    ValidationUtils.isValidEnglish(e)
//                    )
//                System.out.println(e);
//        });
//
//        System.out.println("");
//        System.out.println("$$$$$$$$$$$$$$$$$$ Thai and Number Only");
//        strings.forEach(e -> {
//            if (
//                    ValidationUtils.isValidateThaiAndNumber(e)
//                    ) System.out.println(e);
//        });
//
//        System.out.println("");
//        System.out.println("$$$$$$$$$$$$$$$$$$ Thai No number");
//        strings.forEach(e -> {
//            if (
//                    ValidationUtils.isValidateOnlyThaiNoNumber(e)
//
//                    ) System.out.println(e);
//        });
//
//        System.out.println("");
//        System.out.println("$$$$$$$$$$$$$$$$$$ Number Only");
//        strings.forEach(e -> {
//            if (
//                    ValidationUtils.isValidateNumber(e)
//
//                    ) System.out.println(e);
//        });
//
//        System.out.println("");
//        System.out.println("$$$$$$$$$$$$$$$$$$ isValidEnglishWithSpace");
//        strings.forEach(e -> {
//            if (ValidationUtils.isValidEnglishWithSpace(e)) System.out.println(e);
//        });
//    }
}

