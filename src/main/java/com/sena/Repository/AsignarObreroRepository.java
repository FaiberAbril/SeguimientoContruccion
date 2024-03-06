package com.sena.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sena.Modelos.AsignarObrero;


@Repository
public interface AsignarObreroRepository extends JpaRepository<AsignarObrero, Integer> {


	

	
}
