package tm.teamanager.domain.valueobjects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.math.BigDecimal;
import java.time.LocalDate;

@Embeddable
public class PriceRecord {
    @Column(name = "price")
    private BigDecimal price;
    @Column(name = "date")
    private LocalDate date;

    @Override
    public String toString() {
        return "PriceRecord{" +
                "price=" + price +
                ", date=" + date +
                '}';
    }
}
