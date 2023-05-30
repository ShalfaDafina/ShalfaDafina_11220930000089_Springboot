package com.kuliah.latihanspringboot.Halaman3;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Controller
@RequestMapping(value = "/api")
@Slf4j
public class Browsing {
    @GetMapping(value = "/Browsing")
    public String openLoginPage(HttpServletResponse httpServletResponse, HttpServletRequest request){
        log.info("Selamat Anda Berhasil Masuk Ke Halaman Browsing");
        return "Browsing";
    }
}
