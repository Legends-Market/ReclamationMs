package tn.esprit.reclamationms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ReclamationmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReclamationmsApplication.class, args);
    }

}
