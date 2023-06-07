package ${{ values.group }}.${{ values.artifact }};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@SpringBootApplication
public class ${{ values.artifact }}Application {
	@GetMapping("/hello")
	public String getHello() {
		return "Hello World!";
	}

	public static void main(String[] args) {
		SpringApplication.run(${{ values.artifact }}Application.class, args);
	}

}
