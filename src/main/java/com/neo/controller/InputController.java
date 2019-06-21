package com.neo.controller;
import com.neo.service.input.InputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@RequestMapping(value = "/input")
public class InputController {
    @Autowired
    private InputService inputService;
    @ResponseBody
    @GetMapping("/author")
    public Object findAllAuthor(
            @RequestParam(name = "page", required = false, defaultValue = "1")
                    int pageNum,
            @RequestParam(name = "limit", required = false, defaultValue = "10")
                    int pageSize){
        return inputService.findAllAuthor(pageNum,pageSize);
    }
    @ResponseBody
    @GetMapping("/press")
    public Object findAllPress(
            @RequestParam(name = "page", required = false, defaultValue = "1")
                    int pageNum,
            @RequestParam(name = "limit", required = false, defaultValue = "10")
                    int pageSize){
        return inputService.findAllPress(pageNum,pageSize);
    }

    @ResponseBody
    @GetMapping("/type")
    public Object findAllType(
            @RequestParam(name = "page", required = false, defaultValue = "1")
                    int pageNum,
            @RequestParam(name = "limit", required = false, defaultValue = "10")
                    int pageSize){
        return inputService.findAllType(pageNum,pageSize);
    }


}
