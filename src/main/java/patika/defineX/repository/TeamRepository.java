package patika.defineX.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import patika.defineX.model.Team;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface TeamRepository extends JpaRepository<Team, UUID> {
    List<Team> findAllByProjectIdAndIsDeletedFalse(UUID projectId);
    Optional<Team> findByIdAndIsDeletedFalse(UUID id);
}
