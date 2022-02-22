package com.growgreen.webapp.services;
import java.util.List;

import com.growgreen.webapp.models.*;
import com.growgreen.webapp.repositories.TreeRepository;
import org.springframework.stereotype.Service;

@Service
public class TreeService {
    private final TreeRepository treeRepository;

    public TreeService(TreeRepository treeRepository) {
        this.treeRepository = treeRepository;
    }

    public List<Tree> getAllTrees(){
        return treeRepository.findAll();
    }

    public Tree getById(long id) {
        return treeRepository.findById(id).get();
    }
}