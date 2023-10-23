// BurgerDao.java
package com.example.Jpa.dao;

import com.example.Jpa.entity.Burger;

import java.util.List;

public interface BurgerDao {
    void save(Burger burger);
    Burger findById(Integer id);
    List<Burger> findAll();
    List<Burger> findByPrice(double price);
    List<Burger> findByBreadType(String breadType);
    List<Burger> findByContents(String contents);
    void update(Burger burger);
    void remove(Integer id);
}
