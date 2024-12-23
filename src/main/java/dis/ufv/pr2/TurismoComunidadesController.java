package dis.ufv.pr2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class TurismoComunidadesController {
    @GetMapping("/")
    public ArrayList<TurismoComunidades> comunidades(){
        return new LectorJson().leeFicheroJson();
    }

}
