package notetaking.entities;

import jakarta.persistence.Entity;

@Entity
public record NoteTags(
		Tags tag,
		Notes note) {

}
