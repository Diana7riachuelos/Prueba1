package dinosaurio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dinosaurio.models.Dinosaurio;

@Repository
public interface DinosaurioRepository extends JpaRepository<Dinosaurio, Long>{
}
