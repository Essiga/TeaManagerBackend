package tm.teamanager.infrastructure.api;

import tm.teamanager.domain.Tea;

import java.util.List;

public interface ITeaRepository {
    List<Tea> getAllTeas();
    void createTea(Tea tea);
}
