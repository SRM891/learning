package com.NewAPITest.learning.repository;

import com.NewAPITest.learning.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, String> {
}
