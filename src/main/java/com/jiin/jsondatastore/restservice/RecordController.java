package com.jiin.jsondatastore.restservice;

import javax.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jiin.jsondatastore.restservice.model.Record;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@Log4j2
@RestApiController
@AllArgsConstructor
@Tag(name = "Record")
public class RecordController {

    @PostMapping(value="/records")
    @Operation(summary = "store a record")
    /*
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "ok", content = {
                    @Content(schema = @Schema(implementation = ))
            })
    })
    */
    public Record store(@RequestBody @Valid Record record) {
        ObjectMapper mapper = new ObjectMapper();
        return Record.builder().build();
    }

    @GetMapping(value="/hello")
    public @ResponseBody String greeting() {
        return "Hello, World";
    }
}
