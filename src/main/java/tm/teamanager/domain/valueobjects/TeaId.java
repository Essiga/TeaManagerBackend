package tm.teamanager.domain.valueobjects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.util.Objects;
import java.util.UUID;

@Embeddable
public class TeaId {
    @Column(name = "tea_id")
    private final UUID id;

    public TeaId() {
        this.id = UUID.randomUUID();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeaId teaId = (TeaId) o;
        return Objects.equals(id, teaId.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
