package org.tim.inventoryservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tim.inventoryservice.entities.Category;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
