package tm.teamanager.domain.valueobjects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.util.Objects;
import java.util.UUID;

@Data
@Embeddable
public class VendorId {
    @Column(name = "vendor_id")
    private final UUID id;

    public VendorId() {
        this.id = UUID.randomUUID();
    }
}
