package com.isaquespring.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isaquespring.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
