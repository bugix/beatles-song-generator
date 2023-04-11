package com.example.beatlessonggenerator;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Slf4j
@SpringBootTest
class BeatlesSongGeneratorApplicationTests {

	@Autowired
	private ApplicationContext applicationContext;

	@Test
	void testSongGenerator() {

		var soundGenerators = applicationContext.getBeansOfType(SoundGenerator.class);

		for (int bar=1; bar <= 6; bar++) {

			log.error("Bar #{}", bar);

			for (var soundGenerator : soundGenerators.entrySet()) {
				log.error("The {} makes {}", soundGenerator.getKey(), soundGenerator.getValue().generate(bar));
			}

			log.error("\n--\n");
		}

	}

	@Test
	void happyTest() {
		assertTrue(true);
	}

}
