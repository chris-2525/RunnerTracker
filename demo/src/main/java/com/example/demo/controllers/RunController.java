package com.example.demo.controllers;

import com.example.demo.model.Run;
import com.example.demo.services.RunService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RunController {

    private final RunService runService;

    public RunController(RunService runService) {this.runService = runService;}

    @GetMapping("/runs")
    public String viewRuns(Model model) {
        var runs = runService.findAll();
        model.addAttribute("runs", runs);
        return "runs.html";
    }

    @PostMapping("/runs")
    public String addRun(@RequestParam String name, @RequestParam double time, Model model) {
        Run run = new Run();
        run.setName(name);
        run.setTime(time);
        runService.addRun(run);

        var runs = runService.findAll();
        model.addAttribute("runs", runs);

        return "runs.html";
    }
}
