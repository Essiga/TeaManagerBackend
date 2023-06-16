package tm.teamanager.domain.valueobjects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.Getter;

import java.util.Objects;
import java.util.UUID;

@Data
@Embeddable
public class TeaId {
    @Column(name = "tea_id")
    private final UUID id;

    public TeaId() {
        this.id = UUID.randomUUID();
    }
}
