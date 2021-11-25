package com.entrepreneur.core.repository.contract;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.entrepreneur.core.repository.model.Entrepreneur;
import org.springframework.stereotype.Repository;

@Repository
public interface IEntrepreneurRepository extends JpaRepository<Entrepreneur, BigInteger>{
	@Query("SELECT e FROM Entrepreneur e WHERE e.Id = :id ")
	Entrepreneur getEntrepreneurById(BigInteger id);
}
