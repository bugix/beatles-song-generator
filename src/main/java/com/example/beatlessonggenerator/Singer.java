package com.example.beatlessonggenerator;

import lombok.SneakyThrows;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import java.nio.file.Files;
import java.util.Random;

@Component
public class Singer implements SoundGenerator {

    @Override
    @SneakyThrows
    public String generate(int bar) {
        var library = new ClassPathResource("lyrics-library.txt").getFile();
        var lines = Files.readAllLines(library.toPath());

        var random = new Random();
        return lines.get(random.nextInt(lines.size()));
    }

}
