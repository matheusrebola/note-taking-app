package notetaking.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import notetaking.entities.Tags;

@Repository
public interface TagsRepository extends JpaRepository<Tags, UUID> {

}
