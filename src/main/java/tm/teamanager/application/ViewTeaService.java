package tm.teamanager.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import tm.teamanager.application.api.IViewTeaService;
import tm.teamanager.application.dto.TeaDTO;
import tm.teamanager.infrastructure.api.ITeaRepository;

import java.util.List;

@Component
public class ViewTeaService implements IViewTeaService {
    private final ITeaRepository teaRepository;

    @Autowired
    public ViewTeaService(ITeaRepository teaRepository) {
        this.teaRepository = teaRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<TeaDTO> getAllTeas() {
        return TeaDTO.fromTeaList(teaRepository.getAllTeas());
    }
}
