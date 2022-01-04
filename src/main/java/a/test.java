package a;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {

	@GetMapping("/")
	public String call() {
		return " <form action = \"/swagger-ui.html\">"
				+ "<h3>Click the button to visit Swagger-UI page</h3>"
				+ "<button>Click Here</button>"
				+ "</form>";
	}
	
}
