package pl.mmichal93.musiclibrary.controller;

import org.junit.jupiter.api.Test;
import pl.mmichal93.musiclibrary.service.AlbumService;

import javax.persistence.EntityNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class AlbumControllerTest {
    private AlbumService albumService;

    @Test
    void findAlbumById() {
        AlbumController albumController = new AlbumController(albumService);
        assertThrows(EntityNotFoundException.class,() -> albumController.findAlbumById(3l));
    }
}