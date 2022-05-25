package com.jiin.jsondatastore.restservice;

import java.util.function.Function;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.jiin.jsondatastore.restservice.exceptions.RecordNotFoundException;
import com.jiin.jsondatastore.restservice.model.RecordDto;
import com.jiin.jsondatastore.restservice.model.RecordId;
import com.jiin.jsondatastore.restservice.model.RecordResponse;
import com.jiin.jsondatastore.restservice.model.RecordVersionsResponse;
import com.jiin.jsondatastore.service.RecordService;

import io.swagger.v3.oas.annotations.tags.Tag;

@Log4j2
@RestApiController
@AllArgsConstructor
@Tag(name = "Record")
public class RecordController {

    private final RecordService recordService;

    @PostMapping(value="/records")
    public ResponseEntity<RecordResponse> store(@RequestBody @Valid RecordDto recordDto) {
        log.info("");

        ResponseEntity<RecordResponse> response = ResponseEntity.ok(recordService.store(recordDto));
        return response;
    }

    @GetMapping(value="/records/latest/{id}")
    public ResponseEntity<RecordResponse> getLatestRecord(RecordId recordId, HttpServletRequest request) {
        ResponseEntity<?> response = recordService.getById(recordId)
                .map(ResponseEntity::ok)
                .orElseThrow(RecordNotFoundException::new);

        return (ResponseEntity<RecordResponse>) response;
    }

    @GetMapping(value = "/records/versions/{id}")
    public ResponseEntity<RecordVersionsResponse> getRecordVersions(RecordId recordId) {
        var records = recordService.getVersions(recordId);
        ResponseEntity response = ResponseEntity.ok(RecordVersionsResponse.builder().records(records).build());

        return response;
    }
}
