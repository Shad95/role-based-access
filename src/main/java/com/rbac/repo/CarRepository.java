package com.rbac.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rbac.model.Car;
@Repository
public interface CarRepository extends JpaRepository<Car, Integer>{

	Car findByCarName(String userName);
}
