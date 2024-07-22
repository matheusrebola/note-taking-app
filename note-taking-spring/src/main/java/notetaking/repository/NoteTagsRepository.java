package notetaking.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import notetaking.entities.NoteTags;

@Repository
public interface NoteTagsRepository extends JpaRepository<NoteTags, UUID> {

}
