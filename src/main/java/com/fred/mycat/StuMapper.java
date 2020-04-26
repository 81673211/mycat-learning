package com.fred.mycat;

import com.fred.mycat.domain.Stu;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StuMapper {

    Stu get(int id);

    void insert(@Param("stu") Stu stu);
}
