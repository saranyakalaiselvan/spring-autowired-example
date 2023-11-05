package com.autowired.demo.crackIT.configuration;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class CrackIT1 {
    private Long id;
    private String name;

    @Autowired
    @Qualifier("javaPlayList")
    private PlayList javaPlayList;
}
