package tm.teamanager.domain.valueobjects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.util.Objects;
import java.util.UUID;

@Embeddable
public class VendorId {
    @Column(name = "vendor_id")
    private final UUID id;

    public VendorId() {
        this.id = UUID.randomUUID();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VendorId vendorId = (VendorId) o;
        return Objects.equals(id, vendorId.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
