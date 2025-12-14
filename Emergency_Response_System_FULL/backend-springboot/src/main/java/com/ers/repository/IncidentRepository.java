package com.ers.repository;
import com.ers.entity.Incident;
import org.springframework.data.jpa.repository.JpaRepository;
public interface IncidentRepository extends JpaRepository<Incident, Long> {}