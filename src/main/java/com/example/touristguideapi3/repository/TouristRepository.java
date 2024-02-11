package com.example.touristguideapi3.repository;

import com.example.touristguideapi3.model.TouristAttraction;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TouristRepository {

    private List<TouristAttraction> touristAttractions;

    public TouristRepository() {
        touristAttractions = new ArrayList<>();
        places();
    }

    public List<TouristAttraction> places() {
        touristAttractions.add(new TouristAttraction("Københavns zoologiske have", "Københavns zoologiske have er et sted hvor du kan se dyr fra hele verden"));
        touristAttractions.add(new TouristAttraction("Runde tårn", "et rundt tårn i centrum af København bygget af Christian d.4"));
        touristAttractions.add(new TouristAttraction("Den lille havfrue", "en skulptur af den fiktive character Ariel ra H.C Andersens historie den lille havfrue"));
        touristAttractions.add(new TouristAttraction("Amalienborg", "Den danske Kongefamilies hjemsted"));
        return touristAttractions;
    }


    public TouristAttraction createAttraction(TouristAttraction touristAttraction) {
        if (touristAttractions.add(touristAttraction)) {
            return touristAttraction;
        }
        return null;
    }

    public List<TouristAttraction> getAttractions() {
        return touristAttractions;
    }

    public TouristAttraction editAttraction(TouristAttraction touristAttraction) {

        for (TouristAttraction findTouristattraction : touristAttractions) {
            if (findTouristattraction.getName().equalsIgnoreCase(touristAttraction.getName())) {
                findTouristattraction.setName(touristAttraction.getName());
                findTouristattraction.setDescription(touristAttraction.getDescription());
                touristAttraction.setName(findTouristattraction.getName());
                touristAttraction.setDescription(findTouristattraction.getDescription());
            }
        }
        return touristAttraction;
    }


    public TouristAttraction deleteAttraction(String name) {
        TouristAttraction touristAttractionMain = null;
        for (TouristAttraction touristAttraction : touristAttractions) {
            if (touristAttraction.getName().equalsIgnoreCase(name)) {
                touristAttractionMain = touristAttraction;
                break;
            }

        }
        touristAttractions.remove(touristAttractionMain);
        return touristAttractionMain;
    }


    public TouristAttraction getAttractionByName(String name) {
        TouristAttraction found=null;
        for (TouristAttraction attraction : touristAttractions) {
            if (attraction.getName().equalsIgnoreCase(name)) {
                found= attraction;
            }
        }
        return found;
    }

    public TouristAttraction searchAttractions(String name){
        TouristAttraction found = null;
        for (TouristAttraction touristAttractions: touristAttractions){
            if (touristAttractions.getName().equalsIgnoreCase(name)){
                found = touristAttractions;
            }
            if (found != null){
                return found;
            }
        }
        return found;
    }


}
