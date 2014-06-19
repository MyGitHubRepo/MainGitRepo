package sample;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ComponentScan
@EnableAutoConfiguration
public class Sample {

	public String print() {
		return "test";
	}
}
