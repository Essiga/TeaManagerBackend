package tm.teamanager.application.api;

import tm.teamanager.application.dto.TeaDTO;

import java.util.List;

public interface IViewTeaService {
    List<TeaDTO> getAllTeas();
}
