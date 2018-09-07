package com.example.demo;

import java.util.regex.Pattern;

public class ValidationUtils {

    private static final String ENGLISH_ONLY = "((?:[a-z][a-z]+))";
    private static final String CHECK_WORDS_PATTER_ENGLISH_THAI = ("\\p{L}+");
    private static final String CHECK_NUMBERS = ("\\p{N}+");
    private static final String CHECK_SPECIAL_CHAR = ("\\W+");
    private static final String CHECK_THAI_CHAR = ("\\p{InTHAI}");
    private static final String CHECK_SPACE = ("\\s+");
    public static final String SPACE = " ";
    public static final String BLANK = "";

    public static boolean isValidEnglish(String value) {
        return (validate(ENGLISH_ONLY, value) &&
                !validate(CHECK_NUMBERS, value) &&
                !validate(CHECK_SPACE, value));
    }

    public static boolean isValidEnglishWithSpace(String value) {
        return (validateWithSpace(ENGLISH_ONLY, value) &&
                !validateWithSpace(CHECK_NUMBERS, value));
    }

    public static boolean isValidateThaiAndNumber(String value) {
        return (validate(CHECK_WORDS_PATTER_ENGLISH_THAI, value) || validate(CHECK_NUMBERS, value)) &&
                validate(CHECK_THAI_CHAR, value) &&
                !validate(CHECK_SPECIAL_CHAR, value);
    }

    public static boolean isValidateThaiAndNumberWithSpace(String value) {
        return (validateWithSpace(CHECK_WORDS_PATTER_ENGLISH_THAI, value)
                || validateWithSpace(CHECK_NUMBERS, value)) &&
                validateWithSpace(CHECK_THAI_CHAR, value) &&
                !validateWithSpace(CHECK_SPECIAL_CHAR, value);
    }

    public static boolean isValidateOnlyThaiNoNumber(String value) {
        return validate(CHECK_WORDS_PATTER_ENGLISH_THAI, value) &&
                !validate(CHECK_NUMBERS, value) &&
                validate(CHECK_THAI_CHAR, value) &&
                !validate(CHECK_SPECIAL_CHAR, value);
    }

    public static boolean isValidateNumber(String value) {
        return validate(CHECK_NUMBERS, value)
                && !validate(CHECK_SPECIAL_CHAR, value)
                && !validate(ENGLISH_ONLY, value)
                && !validate(CHECK_THAI_CHAR, value);
    }



    private static boolean validateWithSpace(String pat, String txt) {
        txt =  txt.replace(SPACE, BLANK) ;
        return validate(pat, txt);
    }
    private static boolean validate(String pat, String txt) {

        Pattern compile = Pattern.compile(pat,
                Pattern.CASE_INSENSITIVE
                        |
                        Pattern.DOTALL
                        |
                        Pattern.UNICODE_CHARACTER_CLASS
        );
        return compile.matcher(txt).find();

    }
}
