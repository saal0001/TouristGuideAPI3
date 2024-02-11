package com.example.touristguideapi3.controller;

import com.example.touristguideapi3.model.TouristAttraction;
import com.example.touristguideapi3.service.TouristService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("attractions")
public class TouristController {
    TouristService touristService = new TouristService();


    @GetMapping("/allAttractions")
    public ResponseEntity<List<TouristAttraction>> attractions() {
        return new ResponseEntity<>(touristService.getAttacrions(), HttpStatus.OK);
    }


    @PostMapping("/add")
    public ResponseEntity<TouristAttraction> addAttraction(@RequestBody TouristAttraction touristAttraction) {
        return new ResponseEntity<>(touristService.creatAttraction(touristAttraction), HttpStatus.OK);
    }


    @GetMapping("/delete/{name}")
    public ResponseEntity<TouristAttraction> deleteAttraction(@PathVariable String name) {
        return new ResponseEntity<>(touristService.deleteAttraction(name), HttpStatus.OK);
    }

    @PostMapping("/edit")
    public ResponseEntity<TouristAttraction> editAttraction(@RequestBody TouristAttraction touristAttraction) {
        return new ResponseEntity<>(touristService.editAttractions(touristAttraction), HttpStatus.OK);
    }

    @GetMapping("/search/{name}")
    public ResponseEntity<TouristAttraction> byName(@PathVariable String name) {
        return new ResponseEntity<>(touristService.getAttractionByName(name), HttpStatus.OK);
    }


}
