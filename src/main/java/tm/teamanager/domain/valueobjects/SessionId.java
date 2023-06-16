package tm.teamanager.domain.valueobjects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.util.Objects;
import java.util.UUID;

@Data
@Embeddable
public class SessionId {
    @Column(name = "session_id")
    private final UUID id;

    public SessionId() {
        this.id = UUID.randomUUID();
    }
}
