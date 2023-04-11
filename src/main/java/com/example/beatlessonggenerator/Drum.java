package com.example.beatlessonggenerator;

import org.springframework.stereotype.Component;

@Component
public class Drum implements SoundGenerator {

    @Override
    public String generate(int bar) {
        if (bar % 2 == 0) {
            return "Bum tsch, bumbum tsch, bum tsch, bumbum tsch";
        }

        return "Tschigadiga, bumbum tsch";
    }

}
