package pl.mmichal93.musiclibrary.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.mmichal93.musiclibrary.model.Musician;
import pl.mmichal93.musiclibrary.model.Producer;
import pl.mmichal93.musiclibrary.repo.ProducerRepo;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class ProducerService {
    private final ProducerRepo producerRepo;

    @Autowired
    public ProducerService(ProducerRepo producerRepo) {
        this.producerRepo = producerRepo;
    }

    public Producer addProducer(Producer producer){
        return producerRepo.save(producer);
    }

    public Producer updateProducer(Producer producer){
        return producerRepo.save(producer);
    }

    public List<Producer> findAllProducers(){
        return producerRepo.findAll();
    }

    public  void deleteProducer(Long id) {
        producerRepo.deleteById(id);
    }

    public Producer findProducerById(Long id) {
        return producerRepo.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(Producer.class.getName() + " with id:" + id + " not found!"));
    }
}
