package tm.teamanager.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import tm.teamanager.application.dto.TeaDTO;
import tm.teamanager.domain.valueobjects.PriceRecord;
import tm.teamanager.domain.valueobjects.TeaId;
import tm.teamanager.domain.valueobjects.TeaType;
import tm.teamanager.domain.valueobjects.VendorId;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Entity
@Builder
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
    @ElementCollection
    private List<PriceRecord> priceHistory;
    @Column(name = "notes")
    private String notes;

    public Tea() {

    }

    public static Tea fromTeaDTO(TeaDTO teaDTO) {
        return Tea.builder()
                .teaId(new TeaId())
                .name(teaDTO.getName())
                .type(teaDTO.getType())
                .price(teaDTO.getPrice())
                .amount(teaDTO.getAmount())
                .link(teaDTO.getLink())
                .vendorId(teaDTO.getVendorId())
                .year(teaDTO.getYear())
                .priceHistory(teaDTO.getPriceHistory().stream().map(PriceRecord::fromPriceRecordDTO).toList())
                .notes(teaDTO.getNotes())
                .build();
    }

}
