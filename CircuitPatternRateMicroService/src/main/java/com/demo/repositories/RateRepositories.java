package com.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import org.springframework.stereotype.Repository;

import com.demo.entities.Rate;

@Repository
public interface RateRepositories  extends JpaRepository<Rate,Integer>{
	Optional<Rate> findByType(String type);
}
