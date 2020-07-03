package com.projet_S2.remarque.remarqueDao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projet_S2.remarque.model.Remarque;
@Repository
public interface RemarqueRepository extends JpaRepository<Remarque,Integer> {
	
      public List<Remarque> findByCin(String cin);
      
      
      
      
}
