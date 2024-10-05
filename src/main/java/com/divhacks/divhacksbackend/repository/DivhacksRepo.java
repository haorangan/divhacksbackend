package com.divhacks.divhacksbackend.repository;

import com.divhacks.divhacksbackend.models.Org;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DivhacksRepo extends JpaRepository<Org, Long> {
}
