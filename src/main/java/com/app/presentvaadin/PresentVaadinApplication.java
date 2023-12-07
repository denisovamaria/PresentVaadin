package com.app.presentvaadin;

import com.vaadin.flow.component.page.AppShellConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PresentVaadinApplication implements AppShellConfigurator {

    public static void main(String[] args) {
        SpringApplication.run(PresentVaadinApplication.class, args);
    }

}
