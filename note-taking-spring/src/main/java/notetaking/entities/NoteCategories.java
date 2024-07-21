package notetaking.entities;

import jakarta.persistence.Entity;

@Entity
public record NoteCategories(
		Notes note,
		Categories categorie) {

}
