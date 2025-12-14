package com.ers.service;
import com.ers.entity.Incident;
import com.ers.repository.IncidentRepository;
import org.springframework.stereotype.Service;
@Service
public class IncidentService {
 private final IncidentRepository repo;
 public IncidentService(IncidentRepository repo){this.repo=repo;}
 public Incident report(Incident i){
  i.setStatus("REPORTED");
  return repo.save(i);
 }
}