package tm.teamanager.domain;

import jakarta.persistence.*;
import lombok.Getter;
import tm.teamanager.domain.valueobjects.VendorId;

@Getter
@Entity
@Table(name = "vendor")
public class Vendor {
    @Id @GeneratedValue
    @Column(name = "id_vendor")
    private long id;
    @Column(name = "vendor_id")
    private VendorId vendorId;
    @Column(name = "name")
    private String name;
    @Column(name = "link")
    private String link;

}
