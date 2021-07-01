package pl.mmichal93.musiclibrary.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import pl.mmichal93.musiclibrary.model.Album;
import pl.mmichal93.musiclibrary.service.AlbumService;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@RestController
@RequestMapping("/album")
public class AlbumController {
    private final AlbumService albumService;

    public AlbumController(AlbumService albumService) {
        this.albumService = albumService;
    }

    @PostMapping("/add")
    public ResponseEntity<Album> addAlbum(@RequestBody Album album){
        Album newAlbum = albumService.addAlbum(album);
        return new ResponseEntity<>(newAlbum, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Album>> getAllAlbums(){
        List<Album> allAlbums = albumService.findAllAlbums();
        return new ResponseEntity<>(allAlbums, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Album> updateAlbum(@RequestBody Album album){
        Album updatedAlbum = albumService.updateAlbum(album);
        return new ResponseEntity<>(updatedAlbum,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteAlbum(@PathVariable("id") Long id){
        albumService.deleteAlbum(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Album> findAlbumById(@PathVariable("id") Long id){
        Album albumById = albumService.findAlbumById(id);
        return new ResponseEntity<>(albumById,HttpStatus.OK);
    }


}
