package com.spring.samplespringproject.controller.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.spring.samplespringproject.helper.ModelReturnToView;
import com.spring.samplespringproject.helper.ViewUtil;

@Controller
public class UserController {
    @GetMapping({ "", "/" })
    public String index(Model model) {
        ModelReturnToView.getModel(model);
        return ViewUtil.DASHBOARD;
    }
}
