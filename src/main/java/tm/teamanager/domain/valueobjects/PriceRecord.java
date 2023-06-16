package tm.teamanager.domain.valueobjects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Embeddable
public class PriceRecord {
    @Column(name = "price")
    private BigDecimal price;
    @Column(name = "date")
    private LocalDateTime date;
}
