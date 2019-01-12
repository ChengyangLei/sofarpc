package com.htn.sofarpc;

import com.htn.sofarpc.service.HelloSyncService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@ImportResource({ "classpath*:rpc-sofa-boot-starter-samples.xml" })
@org.springframework.boot.autoconfigure.SpringBootApplication
public class SofarpcApplication {

    public static void main(String[] args) {
//        SpringApplication.run(SofarpcApplication.class, args);
        SpringApplication springApplication = new SpringApplication(SofarpcApplication.class);
        ApplicationContext applicationContext = springApplication.run(args);

        HelloSyncService helloSyncServiceReference = (HelloSyncService) applicationContext
                .getBean("helloSyncServiceReference");

        System.out.println(helloSyncServiceReference.saySync("sync"));
    }

}

