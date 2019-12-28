
package com.conduent.claim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * A spring-boot application that includes a Camel route builder to setup the Camel routes
 */
/**
 * 
 * @author C5107956
 *
 */
@SpringBootApplication
@ImportResource({"classpath:spring/camel-context.xml"})
public class CMdsClaimsApplication {

    // must have a main method spring-boot can run
    public static void main(String[] args) {
        SpringApplication.run(CMdsClaimsApplication.class, args);
    }

}
