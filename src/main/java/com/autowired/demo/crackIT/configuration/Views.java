package com.autowired.demo.crackIT.configuration;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@Component
public class Views {
    private PlayList playList;

    @Autowired
    public Views(PlayList playList) {
        this.playList = playList;
    }

}
