package tm.teamanager.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tm.teamanager.application.api.IViewTeaService;
import tm.teamanager.application.dto.TeaDTO;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/rest/teamanager")
public class TeaManagerRestController {


    private final IViewTeaService viewTeaService;

    @Autowired
    public TeaManagerRestController(IViewTeaService viewTeaService) {
        this.viewTeaService = viewTeaService;
    }

    @GetMapping("/getAllTeas")
    public List<TeaDTO> getAllTeas() {
        List<TeaDTO> teas = viewTeaService.getAllTeas();
        return teas;
    }
}
