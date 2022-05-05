
package com.Portfolio.Repository;

import com.Portfolio.Model.Tipo_trabajo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Tipo_trabajoRepository extends JpaRepository <Tipo_trabajo, Long>{
    
}
