package vitraya.HcxconnectorApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class HcxconnectorAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(HcxconnectorAppApplication.class, args);
	}

	@RequestMapping("/")
	public String displayHello(){
		String welcomeText="Hello from Payor Connector";
		return welcomeText;
	}

}
