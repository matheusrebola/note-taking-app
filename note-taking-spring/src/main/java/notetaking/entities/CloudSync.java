package notetaking.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record CloudSync(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		String serviceName,
		String accessToken,
		LocalDateTime createdAt,
		LocalDateTime updatedAt,
		Users user) {

}
