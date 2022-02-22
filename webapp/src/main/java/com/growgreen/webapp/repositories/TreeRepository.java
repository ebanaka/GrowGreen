package com.growgreen.webapp.repositories;

import com.growgreen.webapp.models.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TreeRepository extends JpaRepository<Tree, Long> {
    
}
