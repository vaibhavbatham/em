package com.ers.entity;
import jakarta.persistence.*;
import lombok.Data;
@Entity @Data
public class Incident {
 @Id @GeneratedValue
 private Long id;
 private String type;
 private String location;
 private String severity;
 private String status;
}