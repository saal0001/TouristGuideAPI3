package com.example.touristguideapi3.service;

import com.example.touristguideapi3.model.TouristAttraction;
import com.example.touristguideapi3.repository.TouristRepository;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;

@Service
public class TouristService {
    TouristRepository touristRepository;
    public TouristService(){
        touristRepository=new TouristRepository();
    }


    public TouristAttraction creatAttraction(TouristAttraction touristAttraction){
        return touristRepository.createAttraction(touristAttraction);

    }

    public List<TouristAttraction> getAttacrions(){
        return touristRepository.getAttractions();
    }

    public TouristAttraction editAttractions(TouristAttraction touristAttraction){
        return touristRepository.editAttraction(touristAttraction);
    }

    public TouristAttraction deleteAttraction(String name){
        return touristRepository.deleteAttraction(name);
    }

    public TouristAttraction getAttractionByName(String name){
        return touristRepository.getAttractionByName(name);
    }

    public TouristAttraction searchAttractions(String name){
        return touristRepository.searchAttractions(name);
    }
}
