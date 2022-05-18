package com.a506.oa.common;

import lombok.Data;

@Data
public class problem {
    private Integer id;
    private String pushuser;
    private String title;
    private String problem;
    private Integer good;
    private Integer comment;
    private Integer star;
    private String pushtime;
}
