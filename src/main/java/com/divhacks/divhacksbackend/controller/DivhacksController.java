package com.divhacks.divhacksbackend.controller;

import com.divhacks.divhacksbackend.models.Org;
import com.divhacks.divhacksbackend.repository.DivhacksRepo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/divhacks")
@CrossOrigin
public class DivhacksController {
    private final DivhacksRepo divhacksRepo;
    DivhacksController(DivhacksRepo divhacksRepo) {
        this.divhacksRepo = divhacksRepo;
    }

    @GetMapping(value="/get")
    public List<Org> getAllOrgs() {
        return divhacksRepo.findAll();
    }

    @PostMapping(value="/post")
    public void postOrg(@RequestBody Org org) {
        divhacksRepo.save(org);
    }
}