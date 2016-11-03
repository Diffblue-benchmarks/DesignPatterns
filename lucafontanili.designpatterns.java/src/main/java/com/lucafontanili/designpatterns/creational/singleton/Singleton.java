package com.lucafontanili.designpatterns.creational.singleton;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.log4j.Logger;

import com.lucafontanili.designpatterns.utilities.SingletonException;

public class Singleton {

    private static final Map<String, Singleton> INSTANCES = new ConcurrentHashMap<>();
    private static final Logger LOGGER = Logger.getRootLogger();
    private static volatile String type = "none";

    private Singleton(String source) throws SingletonException {
	try (InputStream is = new FileInputStream(source)) {
	    Properties properties = new Properties();
	    properties.loadFromXML(is);
	    for (Field f : Singleton.class.getDeclaredFields()) {
		if (Modifier.isStatic(f.getModifiers()) && Modifier.isVolatile(f.getModifiers())
			&& properties.containsKey(f.getName())) {
		    f.set(Singleton.class, properties.get(f.getName()));
		}
	    }
	} catch (IOException | IllegalArgumentException | IllegalAccessException e) {
	    LOGGER.error(new StringBuilder(64).append("Error during Singleton initialization"));
	    throw new SingletonException("Exception during Singleton instantiation", e);
	}
    }

    public static Singleton getInstance(String source) throws SingletonException {
	Singleton result = INSTANCES.get(source);
	if (result == null) {
	    synchronized (Singleton.class) {
		result = INSTANCES.get(source);
		if (result == null) {
		    result = new Singleton(source);
		    INSTANCES.put(source, result);
		}
	    }
	}
	return result;
    }

    public void printType() {
	LOGGER.info(new StringBuilder(32).append("Singleton type: ").append(type));
    }
}
