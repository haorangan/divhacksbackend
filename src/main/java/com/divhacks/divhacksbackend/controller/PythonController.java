package com.divhacks.divhacksbackend.controller;

import org.springframework.web.bind.annotation.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;

@RestController
@RequestMapping("/api/python")
@CrossOrigin
public class PythonController {
    @PostMapping("/run-python")
    public String runPythonScript(@RequestBody String aiArray) {
        StringBuilder output = new StringBuilder();
        try {
            ProcessBuilder pb = new ProcessBuilder("/Users/haorangan/PycharmProjects/pythonProject/.venv/bin/python", "/Users/haorangan/PycharmProjects/pythonProject/model.py", aiArray);
            pb.redirectErrorStream(true);
            Process process = pb.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                output.append(line).append("\n");
            }
            process.waitFor();
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
        return output.toString();
    }
}


