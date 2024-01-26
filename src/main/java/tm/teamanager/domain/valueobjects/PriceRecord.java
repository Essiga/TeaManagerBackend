package tm.teamanager.domain.valueobjects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;
import tm.teamanager.application.dto.PriceRecordDTO;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Builder
@Data
@Embeddable
public class PriceRecord {
    @Column(name = "price")
    private final BigDecimal price;
    @Column(name = "date")
    private final LocalDate date;

    public PriceRecord() {
        this.price = BigDecimal.ZERO;
        this.date = LocalDate.now();
    }

    public static PriceRecord fromPriceRecordDTO(PriceRecordDTO priceRecordDTO) {
        return PriceRecord.builder()
                .price(priceRecordDTO.getPrice())
                .date(priceRecordDTO.getDate())
                .build();
    }
}
