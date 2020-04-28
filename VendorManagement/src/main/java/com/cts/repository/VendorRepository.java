package com.cts.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.cts.entity.Vendor;

public interface VendorRepository extends CrudRepository<Vendor, Long> {
	Optional<Vendor> findById(long id);

	

	

	

}
