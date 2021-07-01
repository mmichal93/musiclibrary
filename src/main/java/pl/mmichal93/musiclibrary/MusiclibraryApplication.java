package pl.mmichal93.musiclibrary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.mmichal93.musiclibrary.model.Album;
import pl.mmichal93.musiclibrary.model.Band;
import pl.mmichal93.musiclibrary.model.Musician;
import pl.mmichal93.musiclibrary.repo.AlbumRepo;
import pl.mmichal93.musiclibrary.service.AlbumService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class MusiclibraryApplication {
	private AlbumRepo albumRepo;

	public static void main(String[] args) {
		SpringApplication.run(MusiclibraryApplication.class, args);
	}

}
