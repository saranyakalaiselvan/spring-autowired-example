package com.autowired.demo.crackIT.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration
public class CrackITBeans {

    @Bean(name = "crackIT")
    public CrackIT getCrackIT() {
        CrackIT crackIT = new CrackIT();
        crackIT.setId(1L);
        crackIT.setName("Spring Autowired Example");
        return crackIT;
    }

    @Bean(name = "crackIT1")
    public CrackIT1 getCrackIT1() {
        CrackIT1 crackIT = new CrackIT1();
        crackIT.setId(1L);
        crackIT.setName("Spring Autowired Example");
        return crackIT;
    }

    @Bean(name = "playList")
    //@Primary
    public PlayList getPlayList() {
        PlayList playList = new PlayList();
        playList.setPlayListName("Spring Interview Questions");
        return playList;
    }

    //ByType
    @Bean(name = "javaPlayList")
    //@Primary
    public PlayList getPlayList1() {
        PlayList playList = new PlayList();
        playList.setPlayListName("Java Interview Questions");
        return playList;
    }

    @Bean(name = "java8PlayList")
    @Primary
    public PlayList getPlayList2() {
        PlayList playList = new PlayList();
        playList.setPlayListName("Java8 Interview Questions");
        return playList;
    }

}
