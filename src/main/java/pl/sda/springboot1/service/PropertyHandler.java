package pl.sda.springboot1.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropertyHandler {

    @Value("${system.file.path}")
    private String systemPath;

    public void print() {
        System.out.println(systemPath);
    }
}
