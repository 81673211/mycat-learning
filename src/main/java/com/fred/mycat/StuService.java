package com.fred.mycat;

import com.fred.mycat.domain.Stu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class StuService {

    @Autowired
    private StuMapper stuMapper;

    public Stu get(int id) {
        return stuMapper.get(id);
    }

    public void insert(String name) {
        final Stu stu = new Stu();
        stu.setName(name);
        stuMapper.insert(stu);
    }
}
