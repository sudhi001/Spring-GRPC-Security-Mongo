package com.nullsafety.webapp.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Message {

  @Id
  private String id;
  private String name;
  private String message;


}