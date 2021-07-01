package pl.mmichal93.musiclibrary.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.mmichal93.musiclibrary.model.Musician;
import pl.mmichal93.musiclibrary.service.MusicianService;

import java.util.List;

@RestController
@RequestMapping("/musician")
public class MusicianController {
    private final MusicianService musicianService;

    public MusicianController(MusicianService musicianService) {
        this.musicianService = musicianService;
    }

    @PostMapping("/add")
    public ResponseEntity<Musician> addMusician(@RequestBody Musician musician){
        Musician newMusician = musicianService.addMusician(musician);
        return new ResponseEntity<>(newMusician, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Musician>> getAllMusicians(){
        List<Musician> allMusicians = musicianService.findAllMusicians();
        return new ResponseEntity<>(allMusicians, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Musician> updateMusician(@RequestBody Musician musician){
        Musician updateMusician = musicianService.updateMusician(musician);
        return new ResponseEntity<>(updateMusician,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteMusician(@PathVariable("id") Long id){
        musicianService.deleteMusicians(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Musician> findMusicianById(@PathVariable("id") Long id){
        Musician musiciansById = musicianService.findMusiciansById(id);
        return new ResponseEntity<>(musiciansById,HttpStatus.OK);
    }
}
