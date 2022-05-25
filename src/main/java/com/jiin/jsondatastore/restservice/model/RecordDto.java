package com.jiin.jsondatastore.restservice.model;

import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;
import com.fasterxml.jackson.databind.JsonNode;
import com.jiin.jsondatastore.validator.NotEmptyNode;

import io.swagger.v3.oas.annotations.media.Schema;

@Data
@Builder
@Schema(description = "A unit of a JSON document that comes with useful metadata")
public class RecordDto {

    @NotNull
    private String id;

    @NotNull
    private String version;

    @NotEmptyNode
    private JsonNode payload;

    @Builder.Default
    private boolean isDeleted = false;

    @Valid
    private List<Attachment> attachments;

    @NotNull
    private long createdAt;
}
