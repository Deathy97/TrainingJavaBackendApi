package es.rafa.gastos.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @Autowired
    ResourceLoader resourceLoader;

    private static final String FOTO_JPG = "classpath:hommer.jpg";

    @GetMapping("/")
    public ResponseEntity<byte[]> home() throws IOException {
        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_JPEG)
                .body(StreamUtils.copyToByteArray(resourceLoader.getResource(FOTO_JPG).getInputStream()));
    }
    
    
}
