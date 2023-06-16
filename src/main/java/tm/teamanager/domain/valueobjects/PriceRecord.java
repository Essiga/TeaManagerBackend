package tm.teamanager.domain.valueobjects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Embeddable
public class PriceRecord {
    @Column(name = "price")
    private BigDecimal price;
    @Column(name = "date")
    private LocalDate date;

}
