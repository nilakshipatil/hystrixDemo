package demo.HystrixDemo;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Controller
@RequestMapping(value="/")
public class MyController {

	
	@GetMapping
	public String in(){
		return "/index.html";
	}
	
	@GetMapping(value="/list")
	@ResponseBody
	@HystrixCommand(fallbackMethod="staticdata")
	public String list(){
		System.out.println("List");
		RestTemplate rest=new RestTemplate();
		ResponseEntity<String> str=rest.getForEntity("http://localhost:8087", String.class);
		return str.getBody();
		
	}
	
	
	public String staticdata(){
		System.out.println("static data");
	     return "/list.html";
	}
}
