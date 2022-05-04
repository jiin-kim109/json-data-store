package com.jiin.jsondatastore.validator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.TextNode;

public class NotEmptyNodeValidatorTest {

    private NotEmptyNodeValidator validator = new NotEmptyNodeValidator();
    private ObjectMapper mapper = new ObjectMapper();

    @Test
    void shouldAcceptJsonWithOneField() {
        assertThat(validator.isValid(mapper.createObjectNode().set("a", TextNode.valueOf("b")), null))
                .isTrue();
    }

    @Test
    void shouldRejectNull() {
        assertThat(validator.isValid(null, null)).isFalse();
    }

    @Test
    void shouldRejectNullNode() {
        assertThat(validator.isValid(mapper.nullNode(),null)).isFalse();
    }

    @Test
    void shouldRejectEmptyNode() {
        assertThat(validator.isValid(mapper.createObjectNode(), null)).isFalse();
    }

    @Test
    void shouldRejectEmptyArrayNode() {
        assertThat(validator.isValid(mapper.createArrayNode(),null)).isFalse();
    }
}
