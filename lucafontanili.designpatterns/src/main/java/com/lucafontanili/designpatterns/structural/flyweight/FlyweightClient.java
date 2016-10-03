package com.lucafontanili.designpatterns.structural.flyweight;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.lucafontanili.designpatterns.structural.flyweight.GlyphContext.FontType;
import com.lucafontanili.designpatterns.utilities.AbstractClient;
import com.lucafontanili.designpatterns.utilities.InvalidArgumentException;

public class FlyweightClient extends AbstractClient {

    public static void main(String[] args) throws InvalidArgumentException, IOException {
	main(new FlyweightClient());

    }

    @Override
    public void run() throws InvalidArgumentException, IOException {

	List<GlyphInterface> helloWorld = new ArrayList<>();
	helloWorld.add(GlyphFactory.getGlyph(new GlyphContext(0, 2, FontType.BOLD), new Character('h')));
	helloWorld.add(GlyphFactory.getGlyph(new GlyphContext(1, 2, FontType.BOLD), new Character('e')));
	helloWorld.add(GlyphFactory.getGlyph(new GlyphContext(2, 2, FontType.BOLD), new Character('l')));
	helloWorld.add(GlyphFactory.getGlyph(new GlyphContext(3, 2, FontType.BOLD), new Character('l')));
	helloWorld.add(GlyphFactory.getGlyph(new GlyphContext(4, 2, FontType.BOLD), new Character('o')));
	helloWorld.add(GlyphFactory.getGlyph(new GlyphContext(0, 1, FontType.ITALIC), new Character('w')));
	helloWorld.add(GlyphFactory.getGlyph(new GlyphContext(1, 1, FontType.ITALIC), new Character('o')));
	helloWorld.add(GlyphFactory.getGlyph(new GlyphContext(2, 1, FontType.ITALIC), new Character('r')));
	helloWorld.add(GlyphFactory.getGlyph(new GlyphContext(3, 1, FontType.ITALIC), new Character('l')));
	helloWorld.add(GlyphFactory.getGlyph(new GlyphContext(4, 1, FontType.ITALIC), new Character('d')));

	helloWorld.forEach(GlyphInterface::draw);
    }

}
