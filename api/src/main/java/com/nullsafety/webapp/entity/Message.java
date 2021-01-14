package com.nullsafety.webapp.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Message {

  @Id
  public String id;
  public String name;
  public String message;


}