package pl.mmichal93.musiclibrary.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.mmichal93.musiclibrary.model.Band;
import pl.mmichal93.musiclibrary.service.BandService;

import java.util.List;
@RestController
@RequestMapping("/band")
public class BandController {
    private final BandService bandService;

    public BandController(BandService bandService) {
        this.bandService = bandService;
    }

    @PostMapping("/add")
    public ResponseEntity<Band> addBand(@RequestBody Band band){
        Band newBand = bandService.addBand(band);
        return new ResponseEntity<>(newBand, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Band>> getAllBands(){
        List<Band> allBands = bandService.findAllBands();
        return new ResponseEntity<>(allBands, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Band> updateBand(@RequestBody Band band){
        Band updatedAlbum = bandService.updateBand(band);
        return new ResponseEntity<>(updatedAlbum,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteBand(@PathVariable("id") Long id){
        bandService.deleteBand(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Band> findBandById(@PathVariable("id") Long id){
        Band albumById = bandService.findBandById(id);
        return new ResponseEntity<>(albumById,HttpStatus.OK);
    }

}
