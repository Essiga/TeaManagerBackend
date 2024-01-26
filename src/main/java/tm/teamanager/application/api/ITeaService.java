package tm.teamanager.application.api;

import tm.teamanager.application.dto.TeaDTO;

import java.util.List;

public interface ITeaService {

    List<TeaDTO> getAllTeas();
    void createTea(TeaDTO tea);
}
