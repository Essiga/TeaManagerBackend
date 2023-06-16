package tm.teamanager.domain.valueobjects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.util.Objects;
import java.util.UUID;

@Embeddable
public class VesselId {
    @Column(name = "vessel_id")
    private UUID id;

    public VesselId() {
        this.id = UUID.randomUUID();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VesselId vesselId = (VesselId) o;
        return Objects.equals(id, vesselId.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
