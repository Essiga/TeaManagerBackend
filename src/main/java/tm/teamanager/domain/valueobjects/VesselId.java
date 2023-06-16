package tm.teamanager.domain.valueobjects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.util.Objects;
import java.util.UUID;

@Data
@Embeddable
public class VesselId {
    @Column(name = "vessel_id")
    private final UUID id;

    public VesselId() {
        this.id = UUID.randomUUID();
    }


}
