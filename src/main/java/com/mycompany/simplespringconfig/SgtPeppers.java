/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.simplespringconfig;

import org.springframework.stereotype.Component;

/**
 *
 * @author eyuel
 */
@Component
public class SgtPeppers implements CompactDisc{
    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist ="The Beatles";
    @Override
    public void play() {
        System.out.println("Playing "+ title + " by " + artist);
    }
    
}
