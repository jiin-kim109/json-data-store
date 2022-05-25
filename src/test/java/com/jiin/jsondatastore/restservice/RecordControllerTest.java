package com.jiin.jsondatastore.restservice;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.jiin.jsondatastore.service.RecordService;

@WebMvcTest(controllers = RecordController.class)
public class RecordControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Mock
    private RecordService recordService;

    @Test
    void shouldStoreValidRecordRequest() throws Exception {

    }

    @Test
    void shouldGetValidRecordRequest() throws Exception {

    }

    @Test
    void shouldGetValidRecordVersionsRequest() throws Exception {

    }

    @Test
    void shouldGetHelloWorld() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/hello")).andExpect(status().isOk())
                .andExpect(content().string(containsString("Hello")));
    }
}
