package pl.mmichal93.musiclibrary.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.mmichal93.musiclibrary.model.Producer;
import pl.mmichal93.musiclibrary.service.ProducerService;

import java.util.List;
@RestController
@RequestMapping("/producer")
public class ProducerController {
    private final ProducerService producerService;

    public ProducerController(ProducerService producerService) {
        this.producerService = producerService;
    }


    @PostMapping("/add")
    public ResponseEntity<Producer> addProducer(@RequestBody Producer producer){
        Producer newProducer = producerService.addProducer(producer);
        return new ResponseEntity<>(newProducer, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Producer>> getAllProducers(){
        List<Producer> allProducers = producerService.findAllProducers();
        return new ResponseEntity<>(allProducers, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Producer> updateProducer(@RequestBody Producer producer){
        Producer updatedProducer = producerService.updateProducer(producer);
        return new ResponseEntity<>(updatedProducer,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteProducer(@PathVariable("id") Long id){
        producerService.deleteProducer(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Producer> findProducerById(@PathVariable("id") Long id){
        Producer producerById = producerService.findProducerById(id);
        return new ResponseEntity<>(producerById,HttpStatus.OK);
    }
}
