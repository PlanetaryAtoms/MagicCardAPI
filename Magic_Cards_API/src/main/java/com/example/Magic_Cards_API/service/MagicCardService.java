package com.example.Magic_Cards_API.service;

import com.example.Magic_Cards_API.entity.MagicCard;

import java.util.List;

public interface MagicCardService {
    List<MagicCard> findAll();
    Object findById(int magicCardId);
    void saveOrUpdate(MagicCard magicCard);
    void deleteById(int magicCardId);
}
