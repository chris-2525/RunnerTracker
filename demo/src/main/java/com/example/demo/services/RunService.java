package com.example.demo.services;

import com.example.demo.model.Run;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RunService {

    private List<Run> runs = new ArrayList<>();
    public void addRun(Run r) {runs.add(r);}
    public List<Run> findAll() {return runs;}

}
