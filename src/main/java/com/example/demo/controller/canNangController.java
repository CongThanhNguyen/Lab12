package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class canNangController {

    @GetMapping("/lab12/bai-2")
    public String viewCanNang() {
        return "canNang";
    }

    @PostMapping("/lab12/bai-2")
    public String tinhBMI(Model model, @RequestParam(name = "cao") Integer cao
            , @RequestParam(name = "nang") Integer nang
    ) {
        Integer BMI = (nang) / (cao * 2);

        String ketQua = "";

        if (BMI < 16) {
            ketQua = "Gay do III";
        } else if (BMI >= 16 & BMI < 17) {
            ketQua = "Gay do II";
        } else if (BMI >= 17 & BMI < 18.5) {
            ketQua = "Gay do I";
        } else if (BMI >= 18.5 & BMI < 25) {
            ketQua = "Binh thuong";
        } else if (BMI >= 25 & BMI < 30) {
            ketQua = "thua can";
        } else if (BMI >= 30 & BMI < 35) {
            ketQua = "Beo phi do I";
        } else if (BMI >= 35 & BMI < 40) {
            ketQua = "Beo phi do II";
        } else {
            ketQua = "Beo phi do III";
        }
        model.addAttribute("BMI", ketQua);
        return "canNang";
    }
}
