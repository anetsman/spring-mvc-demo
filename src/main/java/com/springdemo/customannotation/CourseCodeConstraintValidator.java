package com.springdemo.customannotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

    private String[] coursePrefix;

    public void initialize(CourseCode courseCode) {
        coursePrefix = courseCode.value();
    }

    public boolean isValid(String code, ConstraintValidatorContext constraintValidatorContext) {

        boolean result = false;

        if (code != null) {
            for (String prefix : coursePrefix) {
                result = code.startsWith(prefix);
                if (result) {
                    break;
                }
//            return code.startsWith(coursePrefix[0]);
            }
        }

        return result;
    }
}
