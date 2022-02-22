
package com.growgreen.webapp.controllers;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.growgreen.webapp.services.TreeService;

import org.springframework.ui.Model;

@ControllerAdvice
@RequestMapping("/trees")
public class TreeController {

    private final TreeService treeService;

    public TreeController(TreeService treeService) {
        this.treeService = treeService;
    }

    @GetMapping
    public String getAllRooms(Model model){
        model.addAttribute("trees", treeService.getAllTrees());
        return "trees";
    }
}

