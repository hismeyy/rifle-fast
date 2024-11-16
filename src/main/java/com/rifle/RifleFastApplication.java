package com.rifle;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.rifle.*.*.*.mapper")
@SpringBootApplication
public class RifleFastApplication {

    public static void main(String[] args) {
        SpringApplication.run(RifleFastApplication.class, args);
        System.out.println("====================================================");
        System.out.println("=                                                  =");
        System.out.println("=             rifle-fast start success             =");
        System.out.println("=                                                  =");
        System.out.println("====================================================");
    }

}
