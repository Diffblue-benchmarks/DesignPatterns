package com.lucafontanili.designpatterns.creational.prototype;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.lucafontanili.designpatterns.utilities.Constants;

public class ShapeCache {
    private static final Map<String, AbstractShape> shapeMap = new ConcurrentHashMap<>();

    private ShapeCache() {

    }

    public static void loadCache() {
	shapeMap.put(Constants.CIRCLE, new Circle());
	shapeMap.put(Constants.RECTANGLE, new Rectangle());
    }

    public static AbstractShape getShape(String shapeId) {
	AbstractShape cachedShape = shapeMap.get(shapeId);
	return (AbstractShape) cachedShape.clone();
    }

}
