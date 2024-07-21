package notetaking.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Tags(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		String name,
		LocalDateTime createdAt,
		LocalDateTime updatedAt,
		Users user) {

}
