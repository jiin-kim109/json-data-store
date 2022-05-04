package com.jiin.jsondatastore.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import com.fasterxml.jackson.databind.JsonNode;

public class NotEmptyNodeValidator implements ConstraintValidator<NotEmptyNode, JsonNode> {

    @Override
    public boolean isValid(JsonNode object, ConstraintValidatorContext constraintValidatorContext) {
        return object != null && !object.isNull() && object.size() > 0;
    }
}
