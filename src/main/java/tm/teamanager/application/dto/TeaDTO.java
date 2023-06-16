package tm.teamanager.application.dto;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import tm.teamanager.domain.Tea;
import tm.teamanager.domain.valueobjects.PriceRecord;
import tm.teamanager.domain.valueobjects.TeaId;
import tm.teamanager.domain.valueobjects.TeaType;
import tm.teamanager.domain.valueobjects.VendorId;

import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
public class TeaDTO {
    private final TeaId teaId;
    private final String name;
    private final TeaType type;
    private final BigDecimal price;
    private final BigDecimal amount;
    private final String link;
    private final VendorId vendorId;
    private final int year;
    private final List<PriceRecord> priceHistory;
    private final String notes;

    public static List<TeaDTO> fromTeaList(List<Tea> teas) {
        return teas.stream().map(TeaDTO::fromTea).toList();
    }
    private static TeaDTO fromTea(Tea tea) {
        return TeaDTO.builder()
                .teaId(tea.getTeaId())
                .name(tea.getName())
                .type(tea.getType())
                .price(tea.getPrice())
                .amount(tea.getAmount())
                .link(tea.getLink())
                .vendorId(tea.getVendorId())
                .year(tea.getYear())
                .priceHistory(tea.getPriceHistory())
                .notes(tea.getNotes())
                .build();
    }
}
