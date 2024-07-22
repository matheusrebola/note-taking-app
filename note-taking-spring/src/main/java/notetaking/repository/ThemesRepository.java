package notetaking.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import notetaking.entities.Themes;

@Repository
public interface ThemesRepository extends JpaRepository<Themes, UUID> {

}
