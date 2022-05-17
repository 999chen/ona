package com.a506.oa.mapper;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public interface Searchmapper {
    @Select("select title from problem where title like concat('%',#{problem},'%')")
    public List<String> searchproblem(String problem);

}
