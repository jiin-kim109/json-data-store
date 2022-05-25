package com.jiin.jsondatastore.restservice.model;

import java.util.List;
import lombok.Builder;

@Builder
public class RecordVersionsResponse {
    List<RecordDto> records;
}
