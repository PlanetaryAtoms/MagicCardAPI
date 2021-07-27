package com.example.Magic_Cards_API.service;

import com.example.Magic_Cards_API.dao.MagicCardDAO;
import com.example.Magic_Cards_API.entity.MagicCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service //Business Logic
public class MagicCardServiceIMPL implements MagicCardService {

    private final MagicCardDAO magicCardDAO;

    @Autowired
    public MagicCardServiceIMPL(MagicCardDAO magicCardDAO){
        this.magicCardDAO = magicCardDAO;
    }

    @Override
    public List<MagicCard> findAll() {
        return magicCardDAO.findAll();
    }

    @Override
    public Object findById(int magicCardId) {
        return magicCardDAO.findById(magicCardId);
    }

    @Override
    public void saveOrUpdate(MagicCard magicCard) {
        magicCardDAO.saveOrUpdate(magicCard);
    }

    @Override
    public void deleteById(int magicCardId) {
        magicCardDAO.deleteById(magicCardId);
    }
}
