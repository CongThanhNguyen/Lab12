package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class LopHoc {
    private String maLop;
    private String tenLop;
    private String monHoc;
    private Boolean caHoc;
    private String phongHoc;
}
