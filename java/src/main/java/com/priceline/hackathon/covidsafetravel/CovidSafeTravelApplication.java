package com.priceline.hackathon.covidsafetravel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages={"com.priceline.hackathon.covidsafetravel.entity"})
@EnableJpaRepositories(basePackages={"com.priceline.hackathon.covidsafetravel.repository"})
public class CovidSafeTravelApplication {

  public static void main(String[] args) {
    SpringApplication.run(CovidSafeTravelApplication.class, args);
    System.out.println("----------Covid safe travel started --------------");

  }

}
