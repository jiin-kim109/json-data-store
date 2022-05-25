package com.jiin.jsondatastore.service;

import java.util.List;
import java.util.Optional;
import com.jiin.jsondatastore.restservice.model.RecordDto;
import com.jiin.jsondatastore.restservice.model.RecordId;
import com.jiin.jsondatastore.restservice.model.RecordResponse;

public interface RecordService {

    Optional<RecordDto> getById(RecordId recordId);

    Optional<RecordDto> getLatest(RecordId recordId);

    List<RecordDto> getVersions(RecordId recordId);

    RecordResponse store(RecordDto record);
}
