package pl.mmichal93.musiclibrary.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.mmichal93.musiclibrary.model.Musician;
import pl.mmichal93.musiclibrary.repo.MusicianRepo;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class MusicianService {
    private final MusicianRepo musicianRepo;

    @Autowired
    public MusicianService(MusicianRepo musicianRepo) {
        this.musicianRepo = musicianRepo;
    }
    public Musician addMusician(Musician musician){
        return musicianRepo.save(musician);
    }

    public Musician updateMusician(Musician musician){
        return musicianRepo.save(musician);
    }

    public List<Musician> findAllMusicians(){
        return musicianRepo.findAll();
    }

    public void deleteMusicians(Long id){
        musicianRepo.deleteById(id);
    }

    public Musician findMusiciansById(Long id){
        return musicianRepo.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(Musician.class.getName() + " with id:" + id + " not found!"));
    }
}
