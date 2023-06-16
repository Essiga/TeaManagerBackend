package tm.teamanager.application.dto;

import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Data;
import tm.teamanager.domain.valueobjects.PriceRecord;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Builder
public class PriceRecordDTO {
    private BigDecimal price;
    private LocalDate date;

    public static PriceRecordDTO fromPriceRecord(PriceRecord priceRecord) {
        return PriceRecordDTO.builder()
                .price(priceRecord.getPrice())
                .date(priceRecord.getDate())
                .build();
    }
}
