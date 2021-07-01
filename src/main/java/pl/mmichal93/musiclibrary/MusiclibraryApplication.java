package pl.mmichal93.musiclibrary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.mmichal93.musiclibrary.model.Album;
import pl.mmichal93.musiclibrary.model.Band;
import pl.mmichal93.musiclibrary.model.Musician;

import java.time.LocalDate;

@SpringBootApplication
public class MusiclibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MusiclibraryApplication.class, args);
	}
//		public void initExampleData(){
//			Band newBand = new Band("Metallica",null,null,null);
//			Musician musician1 = new Musician("Lars","Urlich",LocalDate.of(1959,1,1),"Drums",null);
//			Musician musician2 = new Musician("James","Hetfield",LocalDate.of(1959,1,1),"Guitar",null);
//			Album album1 = new Album("Kill'em all", LocalDate.of(1983,1,1),null,null,null);
//		};
}
