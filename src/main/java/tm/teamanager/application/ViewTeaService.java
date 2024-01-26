package tm.teamanager.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import tm.teamanager.application.api.ITeaService;
import tm.teamanager.application.dto.TeaDTO;
import tm.teamanager.domain.Tea;
import tm.teamanager.infrastructure.api.ITeaRepository;

import java.util.List;

@Component
public class ViewTeaService implements ITeaService {
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

    @Override
    @Transactional
    public void createTea(TeaDTO teaDTO) {
        Tea tea = Tea.fromTeaDTO(teaDTO);
        teaRepository.createTea(tea);
    }
}
