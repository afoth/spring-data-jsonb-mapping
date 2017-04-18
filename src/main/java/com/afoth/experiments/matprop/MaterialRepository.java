package com.afoth.experiments.matprop;

import com.afoth.experiments.matprop.domain.Material;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by des on 18.04.17.
 */
@Repository
public interface MaterialRepository extends JpaRepository<Material, Long> {
}
