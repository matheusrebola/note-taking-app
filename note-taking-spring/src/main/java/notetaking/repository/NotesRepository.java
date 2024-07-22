package notetaking.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import notetaking.entities.Notes;

@Repository
public interface NotesRepository extends JpaRepository<Notes, UUID> {

}
