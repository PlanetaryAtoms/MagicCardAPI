package com.example.Magic_Cards_API.controller;
import com.example.Magic_Cards_API.entity.MagicCard;
import com.example.Magic_Cards_API.service.MagicCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:3000"})
@RestController
public class MagicCardController {

    //Call the service
    private final MagicCardService magicCardService;

    //Constructor Injection to wire up the dependencies from the MagicCardService
    @Autowired
    public MagicCardController(@Qualifier("magicCardServiceIMPL") MagicCardService magicCardService){
        this.magicCardService = magicCardService;
    }

    //GET request to get a list of all the magic cards
    //http://localhost:8080/retrieveAllMagicCards
    @GetMapping("/retrieveAllMagicCards")
    public List<MagicCard> findAll(){
        return magicCardService.findAll();
    }

    //This is a GET request to get a single magic card by id.
    //http://localhost:8080/retrieveMagicCardById/1
    @GetMapping("/retrieveMagicCardById/{magicId}")
    public MagicCard findById(@PathVariable int magicId){
        Object myMagicCard = magicCardService.findById(magicId);

        if(myMagicCard == null){
            throw new RuntimeException("Magic Card id not found - " + magicId);
        }
        return (MagicCard) myMagicCard;
    }

    //This is a GET request to get a list of cards by level
    //http://localhost:8080/retrieveMagicCardByLevel/8
    //@GetMapping("/retrieveMagicCardByLevel/{magicLevel}")


    //POST request to add a new magic card
    //http://localhost:8080/addCard
    @PostMapping("/addCard")
    public MagicCard addMagicCard(@RequestBody MagicCard magicCard){
        magicCard.setId(0); //Force create
        magicCardService.saveOrUpdate(magicCard);
        return magicCard;
    }

    //PUT request to update an existing magic card
    //http://localhost:8080/updateMagicCard
    @PutMapping("/updateMagicCard")
    public MagicCard updateMagicCard(@RequestBody MagicCard updateMagicCard){
        magicCardService.saveOrUpdate(updateMagicCard);
        return updateMagicCard;
    }

    //DELETE request to delete an existing magic card
    //http://localhost:8080/deleteMagicCard/1
    @DeleteMapping("/deleteMagicCard/{magicId}")
    public String deleteMagicCard(@PathVariable int magicId){
        magicCardService.deleteById(magicId);
        return "Deleted magic card id: " + magicId;
    }
}
