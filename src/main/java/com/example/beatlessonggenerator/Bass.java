package com.example.beatlessonggenerator;

import org.springframework.stereotype.Component;

@Component
public class Bass implements SoundGenerator {

    @Override
    public String generate(int bar) {
        return "Brum ♫ di brumbrum bum ♫♫ dibrumbrum ♫";
    }

}
