package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class tinhDiemController {

    @GetMapping("/lab12/bai-1")
    public String viewTinhDiem(){
        return "tinhDiem";
    }

    @PostMapping("/lab12/bai-1")
    public String tinhDiem(Model model, @RequestParam(name = "lab") Float lab
            , @RequestParam(name = "quizz") Float quizz
            , @RequestParam(name = "ass") Float ass
            , @RequestParam(name = "finall") Float finall
    ){
        float diemTB = lab * 0.28f + quizz * 0.12f + ass * 0.2f + finall * 0.4f;
        String ketQua = "";
        if(finall >=5 && diemTB >=5 ){
            ketQua = "Pass";
        }else {
            ketQua = "Fail";
        }
        model.addAttribute("ketQua",ketQua);
        return "tinhDiem";
    }

    @GetMapping("/lab12/bonus/cong")
    public String bonus(){
        return "bonus";
    }

    @GetMapping("/lab12/*/bonus")
    public String bonus1(){
        return "bonus1";
    }
}
