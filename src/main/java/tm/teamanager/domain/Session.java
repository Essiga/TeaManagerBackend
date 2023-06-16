package tm.teamanager.domain;

import jakarta.persistence.*;
import tm.teamanager.domain.valueobjects.SessionId;
import tm.teamanager.domain.valueobjects.TeaId;
import tm.teamanager.domain.valueobjects.VesselId;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "session")
public class Session {
    @Id @GeneratedValue
//    @Column(name = "id_session")
    private long id;
    @Column(name = "session_id")
    private SessionId sessionId;
    @Column(name = "date")
    private LocalDateTime date;
    @Column(name = "amount_used")
    private BigDecimal amountUsed;
    @Column(name = "session_cost")
    private BigDecimal sessionCost;
    @Column(name = "vessel_id")
    private VesselId vesselId;
    @Column(name = "tea_id")
    private TeaId teaId;
}
