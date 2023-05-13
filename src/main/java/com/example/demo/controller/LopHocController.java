package com.example.demo.controller;

import com.example.demo.entity.LopHoc;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class LopHocController {

    @GetMapping("/lab12/bai-3")
    public String viewLopHoc( Model model) {
        List<LopHoc> lopHocs = new ArrayList<>();

        lopHocs.add(new LopHoc("1", "IT11", "A", true, "P301"));
        lopHocs.add(new LopHoc("2", "IT12", "B", true, "P302"));
        lopHocs.add(new LopHoc("3", "IT13", "C", false, "P303"));
        lopHocs.add(new LopHoc("4", "IT14", "D", false, "P304"));
        lopHocs.add(new LopHoc("5", "IT15", "E", true, "P305"));

        model.addAttribute("lopHocs", lopHocs);

        return "lopHoc";
    }

    @PostMapping("/lab12/bai-3/add")
    public String addLopHoc(Model model,
                                    @RequestParam(name = "ma") String ma,
                                    @RequestParam(name = "ten") String ten,
                                    @RequestParam(name = "mon") String mon,
                                    @RequestParam(name = "ca") Boolean ca,
                                    @RequestParam(name = "phong") String phong
    ) {
        LopHoc lp = new LopHoc(ma,ten,mon,ca,phong);

        model.addAttribute("lopHocs",lp);
        return "lopHoc";
    }
}
