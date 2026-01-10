package com.kendev131.task_manager;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/software-engineers") // Base path to this controller for the frontend to use
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
