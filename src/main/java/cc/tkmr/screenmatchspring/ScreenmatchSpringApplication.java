package cc.tkmr.screenmatchspring;

import cc.tkmr.screenmatchspring.model.SeriesData;
import cc.tkmr.screenmatchspring.service.ApiConsume;
import cc.tkmr.screenmatchspring.service.ConvertData;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchSpringApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var apiConsume = new ApiConsume();
		var json = apiConsume.getData("http://www.omdbapi.com/?t=Mr.+Robot&apikey=9b689370");
		System.out.println(json);
//		var jsonCoffee = apiConsume.getData("https://coffee.alexflipnote.dev/random.json");
//		System.out.println(jsonCoffee);
		ConvertData converter = new ConvertData();
		SeriesData data = converter.getData(json, SeriesData.class);
		System.out.println(data);

	}
}
