package com.jiin.jsondatastore.validator;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE_USE;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ METHOD, FIELD, CONSTRUCTOR, ANNOTATION_TYPE, PARAMETER, TYPE_USE })
@Constraint(validatedBy = NotEmptyNodeValidator.class)
public @interface NotEmptyNode {

    String message() default "must not be an empty node";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
