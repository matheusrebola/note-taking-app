package notetaking.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Themes(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		String name,
		String settings,
		LocalDateTime createdAt,
		LocalDateTime updatedAt,
		Users user) {

}
