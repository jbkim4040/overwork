package com.abacus.overwork.work.controller;

import com.abacus.overwork.work.service.WorkService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/work")
@RequiredArgsConstructor
public class WorkController {

    private final WorkService workService;



}
