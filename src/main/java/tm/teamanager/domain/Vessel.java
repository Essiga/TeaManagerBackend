package tm.teamanager.domain;

import jakarta.persistence.*;
import tm.teamanager.domain.valueobjects.VesselId;
import tm.teamanager.domain.valueobjects.VesselType;

@Entity
@Table(name = "vessel")
public class Vessel {
    @Id @GeneratedValue
    @Column(name = "id")
    private long id;
    @Column(name = "vessel_id")
    private VesselId vesselId;
    @Column(name = "name")
    private String name;
    @Column(name = "capacity")
    private int capacity;
    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private VesselType type;
}
