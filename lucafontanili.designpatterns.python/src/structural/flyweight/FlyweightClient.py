'''
Created on Nov 6, 2016

@author: Admin
'''
from Glyph import *

glyphs = []
glyphs.append(GlyphFactory.get_glyph('h', GlyphContext(0,2,'bold')))
glyphs.append(GlyphFactory.get_glyph('e', GlyphContext(1,2,'bold')))
glyphs.append(GlyphFactory.get_glyph('l', GlyphContext(2,2,'bold')))
glyphs.append(GlyphFactory.get_glyph('l', GlyphContext(3,2,'bold')))
glyphs.append(GlyphFactory.get_glyph('o', GlyphContext(4,2,'bold')))
glyphs.append(GlyphFactory.get_glyph('w', GlyphContext(0,1,'bold')))
glyphs.append(GlyphFactory.get_glyph('o', GlyphContext(1,1,'bold')))
glyphs.append(GlyphFactory.get_glyph('r', GlyphContext(2,1,'bold')))
glyphs.append(GlyphFactory.get_glyph('l', GlyphContext(3,1,'bold')))
glyphs.append(GlyphFactory.get_glyph('d', GlyphContext(4,1,'bold')))

for g in glyphs:
    g.draw()