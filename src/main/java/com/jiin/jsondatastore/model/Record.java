package com.jiin.jsondatastore.model;

import javax.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;
import com.fasterxml.jackson.databind.JsonNode;

import io.swagger.v3.oas.annotations.media.Schema;

@Data
@Builder
@Schema(description = "A unit of a JSON document that comes with useful metadata")
public class Record {

    @NotNull
    private String id;

    @NotNull
    private String version;

    @NotNull
    private JsonNode payload;

    @NotNull
    private JsonNode profile;

    @Builder.Default
    private boolean isDeleted = false;

    @NotNull
    private long createdAt;
}
