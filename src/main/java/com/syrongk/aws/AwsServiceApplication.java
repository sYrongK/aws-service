package com.syrongk.aws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)//여기부터 was 설정을 읽기 시작한다.
public class AwsServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AwsServiceApplication.class, args);
    }

}
