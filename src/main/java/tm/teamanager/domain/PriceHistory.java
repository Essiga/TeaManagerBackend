package tm.teamanager.domain;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Map;

@Embeddable
public class PriceHistory {

    @ElementCollection
    @CollectionTable(name = "price_history", joinColumns = @JoinColumn(name = "price_history_id"))
    @MapKeyColumn(name = "date_key")
    @Column(name = "price_value")
    private Map<LocalDateTime, BigDecimal> priceAtDate;
}
