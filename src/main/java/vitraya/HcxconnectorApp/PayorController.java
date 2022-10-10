package vitraya.HcxconnectorApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PayorController {

    @RequestMapping("/welcome")
    public String displayHello(){
        String welcomeText="Hello from Payor Connector";
        return welcomeText;
    }
}
