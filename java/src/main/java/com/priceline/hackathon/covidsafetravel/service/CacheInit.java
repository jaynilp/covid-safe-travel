package com.priceline.hackathon.covidsafetravel.service;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.priceline.hackathon.covidsafetravel.domain.restrictions.TravelRestrictionsResponseContainer;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;


@Component
public class CacheInit implements ApplicationListener<ApplicationReadyEvent> {

  @Autowired CacheConnectorImpl cacheConnector;

  @Override
  public void onApplicationEvent(ApplicationReadyEvent event) {


          File file = new File("/Users/nesharma/workspace/covid-safe-travel/java/src/main/resources/data");
    if (file.listFiles() != null) {
      Arrays.stream(file.listFiles())
          .forEach(
              (key) -> {
                try {

                  ObjectMapper objectMapper = new ObjectMapper();
                  objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

                  TravelRestrictionsResponseContainer json = objectMapper.readValue(key, TravelRestrictionsResponseContainer.class);


                  cacheConnector.put(key.getName(), json);
                } catch (FileNotFoundException e) {
                  e.printStackTrace();
                } catch (IOException e) {
                  e.printStackTrace();
                }
              });
          }


    }

 }
