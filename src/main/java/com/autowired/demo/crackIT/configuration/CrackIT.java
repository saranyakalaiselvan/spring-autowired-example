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
public class CrackIT {
    private Long id;
    private String name;

    @Autowired
    private PlayList javaPlayList;

}