package com.jiin.jsondatastore.service;

import java.util.List;
import java.util.Optional;
import com.jiin.jsondatastore.restservice.model.Record;

public interface RecordService {
    Optional<Record> getLatest(String recordId);

    List<Record> getAllVersionsOfRecord(String recordId);

    String store(Record record);
}
