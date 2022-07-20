package Aula_web.web.TesteRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Aula_web.web.model.Teste;

@Repository
public interface TesteRepository extends JpaRepository <Teste, Long>{
    
}
