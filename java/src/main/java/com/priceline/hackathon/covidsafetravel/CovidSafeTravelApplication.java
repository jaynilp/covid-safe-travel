package com.priceline.hackathon.covidsafetravel;

import com.priceline.hackathon.covidsafetravel.service.CacheConnectorImpl;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CovidSafeTravelApplication {



  public static void main(String[] args) {
    SpringApplication.run(CovidSafeTravelApplication.class, args);
    System.out.println("----------Covid safe travel started --------------");

  }

}
