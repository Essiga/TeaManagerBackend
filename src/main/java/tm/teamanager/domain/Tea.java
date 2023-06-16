package tm.teamanager.domain;

import jakarta.persistence.*;
import tm.teamanager.domain.valueobjects.TeaId;
import tm.teamanager.domain.valueobjects.TeaType;
import tm.teamanager.domain.valueobjects.VendorId;

import java.math.BigDecimal;

@Entity
@Table(name = "tea")
public class Tea {
    @Id @GeneratedValue
    @Column(name = "id")
    private long id;
    @Embedded
    @Column(name = "tea_id")
    private TeaId teaId;
    @Column(name = "name")
    private String name;
    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private TeaType type;
    @Column(name = "price")
    private BigDecimal price;
    @Column(name = "amount")
    private BigDecimal amount;
    @Column(name = "link")
    private String link;
    @Column(name = "vendor_id")
    private VendorId vendorId;
    @Column(name = "year_of_harvest") //had to rename as hibernate doesn't like "year"
    private int year;
    @Embedded
    private PriceHistory priceHistory;
    @Column(name = "notes")
    private String notes;


}
