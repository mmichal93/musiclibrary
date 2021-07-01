package pl.mmichal93.musiclibrary.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.mmichal93.musiclibrary.model.Album;
import pl.mmichal93.musiclibrary.repo.AlbumRepo;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class AlbumService {
    private final AlbumRepo albumRepo;

    @Autowired
    public AlbumService(AlbumRepo albumRepo) {
        this.albumRepo = albumRepo;
    }

    public Album addAlbum(Album album){
        return albumRepo.save(album);
    }

    public List<Album> findAllAlbums(){
        return albumRepo.findAll();
    }

    public Album updateAlbum(Album album){
        return albumRepo.save(album);
    }

    public void deleteAlbum(Long id){
        albumRepo.deleteById(id);
    }

    public Album findAlbumById(Long id){
        return albumRepo.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(Album.class.getName() + " with id:" + id + " not found!"));
    }
}
