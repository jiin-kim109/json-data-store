package com.jiin.jsondatastore.restservice.model;

import javax.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;
import com.fasterxml.jackson.databind.JsonNode;
import com.jiin.jsondatastore.validator.NotEmptyNode;

import io.swagger.v3.oas.annotations.media.Schema;

@Data
@Builder
@Schema(description = "A unit of a JSON document that comes with useful metadata")
public class Record {

    @NotNull
    private String id;

    @NotNull
    private String version;

    @NotEmptyNode
    private JsonNode payload;

    @NotEmptyNode
    private JsonNode profile;

    @Builder.Default
    private boolean isDeleted = false;

    @NotNull
    private long createdAt;
}
