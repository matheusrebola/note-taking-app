package notetaking.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import notetaking.entities.NoteCategories;

@Repository
public interface NoteCategoriesRepository extends JpaRepository<NoteCategories, UUID> {

}
