package com.ers.controller;
import com.ers.entity.Incident;
import com.ers.service.IncidentService;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/incidents")
public class IncidentController {
 private final IncidentService service;
 public IncidentController(IncidentService service){this.service=service;}
 @PostMapping
 public Incident create(@RequestBody Incident i){
  return service.report(i);
 }
}