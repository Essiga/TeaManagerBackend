package tm.teamanager.view;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/rest/teamanager")
public class TeaManagerRestController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
}
