package com.kendev131.task_manager.controller;

import com.kendev131.task_manager.model.SoftwareEngineer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/software-engineers") // Add this to the URL of localhost to view results
public class SoftwareEngineerController {
    @GetMapping
    public List<SoftwareEngineer> getEngineers() {
        return List.of(
                new SoftwareEngineer(
                        1,
                        "james",
                        "js, node, react, tailwindcss"
                ),
                new SoftwareEngineer(
                        2,
                        "jimmy",
                        "java, spring, spring boot, tailwindcss"
                )
        ); // The semicolon goes here, after the closing parenthesis
    }
}
