package com.ish.test.main;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class SampleDto {

    private long id;
    private String name;
    private ChildDto childDto;
}
