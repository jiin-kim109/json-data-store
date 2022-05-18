package com.jiin.jsondatastore.restservice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = RecordController.class)
public class RecordControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldGetHelloWorld() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/hello")).andExpect(status().isOk())
                .andExpect(content().string(containsString("Hello")));
    }
}
