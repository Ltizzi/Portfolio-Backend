
package com.Portfolio.Repository;

import com.Portfolio.Model.Edu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EduRepository extends JpaRepository <Edu, Long>{
    
}
