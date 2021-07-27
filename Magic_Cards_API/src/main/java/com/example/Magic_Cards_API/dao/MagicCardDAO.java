package com.example.Magic_Cards_API.dao;

import com.example.Magic_Cards_API.entity.MagicCard;

import java.util.List;

public interface MagicCardDAO {
    List<MagicCard> findAll();
    Object findById(int cardId);
    void saveOrUpdate(MagicCard magic_card);
    void deleteById(int cardId);
}
