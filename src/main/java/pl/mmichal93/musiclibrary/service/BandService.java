package pl.mmichal93.musiclibrary.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.mmichal93.musiclibrary.model.Album;
import pl.mmichal93.musiclibrary.model.Band;
import pl.mmichal93.musiclibrary.repo.BandRepo;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class BandService {
    private final BandRepo bandRepo;

    @Autowired
    public BandService(BandRepo bandRepo) {
        this.bandRepo = bandRepo;
    }

    public Band addBand(Band band){
        return bandRepo.save(band);
    }

    public Band updateBand(Band band){
        return bandRepo.save(band);
    }

    public List<Band> findAllBands(){
        return bandRepo.findAll();
    }

    public void deleteBand(Long id){
        bandRepo.deleteById(id);
    }

    public Band findBandById(Long id){
        return bandRepo.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(Band.class.getName() + " with id:" + id + " not found!"));
    }
}
