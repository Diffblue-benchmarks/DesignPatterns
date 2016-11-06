'''
Created on Nov 6, 2016

@author: Admin
'''

class GlyphClass(object):
    
    _context = None
    _character = None
    
    def draw(self):
        pass
    
    def __init__(self, contezt, character):
        self._context = contezt
        self._character = character
        
    def context(self):
        return self._context
    
    def characher(self):
        return self._character
    
class GlypCharacter(GlyphClass):
    
    def draw(self):
        print('Drawing character ' + self.characher() + ' in context ' + self.context().to_string())
        
class GlyphContext:
    
    _x_val = None
    _y_val = None
    _font_type = None
    
    def __init__(self, x_val, y_val, font_type):
        self._x_val = x_val
        self._y_val = y_val 
        self._font_type = font_type
        
    def to_string(self):
        return str(self._x_val) + ' ' + str(self._y_val) + ' ' + str(self._font_type)  
    
class GlyphFactory:
    
    _glyph_map = dict()
    
    @staticmethod
    def get_glyph(character, context):
        if character in GlyphFactory._glyph_map:
            return GlyphFactory._glyph_map.get(character)
        print('Creating new GlyphCharacter (' + character + ")")
        glyph = GlypCharacter(context, character)
        GlyphFactory._glyph_map[character] = glyph
        return glyph
        
        