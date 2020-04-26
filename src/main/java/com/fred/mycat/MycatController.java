package com.fred.mycat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MycatController {

    @Autowired
    private StuService stuService;

    @RequestMapping("/{id}")
    public Object foo(@PathVariable("id") int id) {
        return stuService.get(id);
    }

    @RequestMapping("/insert")
    public void foo(@RequestParam("name") String name) {
        stuService.insert(name);
    }
}
