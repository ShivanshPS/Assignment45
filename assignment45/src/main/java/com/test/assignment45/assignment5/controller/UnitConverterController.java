package com.test.assignment45.assignment5.controller;

import com.test.assignment45.assignment5.model.UnitDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UnitConverterController {

    @GetMapping("/unitConverter")
    public String unitConvertForm(Model model) {
        model.addAttribute("unitDetails1", new UnitDetails());
        model.addAttribute("unitDetails2", new UnitDetails());
        return "unitConverter";
    }

    @PostMapping("/unitConverter/mile-to-km")
    public String unitCovertSubmit(@ModelAttribute UnitDetails unitDetails1, Model model) {
        UnitDetails convertUnitDetails = new UnitDetails();

        double unitMile = unitDetails1.getUnitMile();
        convertUnitDetails.setUnitMile(unitMile);

        double kilometers = unitMile * 1.6;
        convertUnitDetails.setUnitKm(kilometers);

        model.addAttribute("unitDetails1", convertUnitDetails);
        model.addAttribute("unitDetails2", new UnitDetails());

        return "unitConverter";
    }

    @PostMapping("/unitConverter/km-to-meter")
    public String unitCovertSubmit1(@ModelAttribute UnitDetails unitDetails2, Model model) {
        UnitDetails newUnitDetails = new UnitDetails();

        Double unitkm = unitDetails2.getUnitKm();
        newUnitDetails.setUnitKm(unitkm);

        double unitMeter= unitkm * 1000;
        newUnitDetails.setUnitMeter(unitMeter);

        model.addAttribute("unitDetails1", new UnitDetails());
        model.addAttribute("unitDetails2", newUnitDetails);

        return "unitConverter";
    }
}
