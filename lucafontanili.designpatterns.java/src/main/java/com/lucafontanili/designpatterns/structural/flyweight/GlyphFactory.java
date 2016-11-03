package com.lucafontanili.designpatterns.structural.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.log4j.Logger;

public class GlyphFactory {

    private static final Logger LOGGER = Logger.getRootLogger();

    private static final Map<Character, GlyphInterface> GLYPH_MAP = new ConcurrentHashMap<>();

    private GlyphFactory() {

    }

    public static GlyphInterface getGlyph(GlyphContext context, Character character) {
	if (GLYPH_MAP.containsKey(character)) {
	    return GLYPH_MAP.get(character);
	}
	LOGGER.info(new StringBuilder(32).append("Creating new GlyphCharacter (").append(character.charValue())
		.append(")"));
	GlyphCharacter c = new GlyphCharacter(context, character);
	GLYPH_MAP.put(character, c);
	return c;
    }

}
