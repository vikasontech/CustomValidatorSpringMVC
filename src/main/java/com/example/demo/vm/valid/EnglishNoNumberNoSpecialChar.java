package com.example.demo.vm.valid;


import com.example.demo.ValidationUtils;
import org.hibernate.validator.internal.engine.constraintvalidation.ConstraintValidatorContextImpl;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = EnglishNoNumberNoSpecialCharImpl.class)
@Target( { ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface EnglishNoNumberNoSpecialChar  {

//    String message() default "Invalid user name";
    String message() default "{com.invalid.name}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}

class EnglishNoNumberNoSpecialCharImpl implements
        ConstraintValidator<EnglishNoNumberNoSpecialChar, String> {

    @Override
    public void initialize(EnglishNoNumberNoSpecialChar englishNoNumberNoSpecialChar) {
        //do nothing
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return ValidationUtils.isValidEnglish(s);
    }
}
