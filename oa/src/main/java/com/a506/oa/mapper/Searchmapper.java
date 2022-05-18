package com.a506.oa.mapper;

import com.a506.oa.common.problem;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public interface Searchmapper {
    @Select("select * from problem where problem like concat('%',#{problem},'%')")
    public List<problem> searchproblem(String problem);

}
