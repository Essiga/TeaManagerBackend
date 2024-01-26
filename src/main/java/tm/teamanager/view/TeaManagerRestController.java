package tm.teamanager.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tm.teamanager.application.api.ITeaService;
import tm.teamanager.application.dto.TeaDTO;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/rest/teamanager")
public class TeaManagerRestController {


    private final ITeaService teaService;

    @Autowired
    public TeaManagerRestController(ITeaService teaService) {
        this.teaService = teaService;

    }

    @GetMapping("/teas")
    public List<TeaDTO> getAllTeas() {
        List<TeaDTO> teas = teaService.getAllTeas();
        return teas;
    }

    @PostMapping("/teas")
    public void createTea(@RequestBody TeaDTO teaDTO) {
        teaService.createTea(teaDTO);
    }
}
