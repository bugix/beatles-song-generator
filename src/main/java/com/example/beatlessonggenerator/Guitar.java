package com.example.beatlessonggenerator;

import org.springframework.stereotype.Component;

@Component
public class Guitar implements SoundGenerator {

    @Override
    public String generate(int bar) {
        return "Dudelidudeli didididid";
    }

}
