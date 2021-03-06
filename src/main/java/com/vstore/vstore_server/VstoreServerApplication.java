package com.vstore.vstore_server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value={"com.vstore.vstore_server.mapper","com.vstore.vstore_server.dao"})
@SpringBootApplication
public class VstoreServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(VstoreServerApplication.class, args);
    }

}
