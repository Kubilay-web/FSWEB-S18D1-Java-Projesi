package com.example.Jpa.controller;


import com.example.Jpa.dao.BurgerDao;
import com.example.Jpa.dao.BurgerDaoImpl;
import com.example.Jpa.entity.Burger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class BurgerController {
    private final BurgerDao burgerDao;

    @Autowired
    public BurgerController(BurgerDao burgerDao) {
        this.burgerDao = burgerDao;
    }

    @RequestMapping(value = "/burgers",method = RequestMethod.GET)
    public List<Burger> getAll(){
        return burgerDao.findAll();
    }

    @RequestMapping(value = "/burgers/{id}",method = RequestMethod.GET)
    public Burger getBurgerById(@PathVariable Integer id) {
        return burgerDao.findById(id);
    }

    @RequestMapping(value = "/burgers",method = RequestMethod.POST)
    public void createBurger(@RequestBody Burger burger) {
        burgerDao.save(burger);
    }

    @RequestMapping(value = "/burgers/{id}", method = RequestMethod.PUT)
    public void UpdatedBurger(@PathVariable Integer id, @RequestBody Burger updatedBurger) {
        updatedBurger.setId(id);
        burgerDao.update(updatedBurger);
    }

    @RequestMapping(value = "/burgers/{id}", method = RequestMethod.DELETE)
    public void deleteBurger(@PathVariable Integer id) {
        burgerDao.remove(id);
    }

    @RequestMapping(value = "/burgers/findByPrice", method = RequestMethod.GET)
    public List<Burger> findByPrice(@RequestParam double price) {
        return burgerDao.findByPrice(price);
    }

    @RequestMapping(value = "/burgers/findByBreadType", method = RequestMethod.GET)
    public List<Burger> findByBreadType(@RequestParam String breadType) {
        return burgerDao.findByBreadType(breadType);
    }

    @RequestMapping(value = "/burgers/findBurgersByContent", method = RequestMethod.GET)
    public List<Burger> findBurgersByContent(@RequestParam String content) {
        return burgerDao.findByContents(content);
    }

}