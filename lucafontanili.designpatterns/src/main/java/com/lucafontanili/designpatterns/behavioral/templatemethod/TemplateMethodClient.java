package com.lucafontanili.designpatterns.behavioral.templatemethod;

import java.io.IOException;

import com.lucafontanili.designpatterns.utilities.AbstractClient;
import com.lucafontanili.designpatterns.utilities.InvalidArgumentException;

public class TemplateMethodClient extends AbstractClient {

    public static void main(String[] args) throws InvalidArgumentException, IOException {
	main(new TemplateMethodClient());
    }

    @Override
    public void run() throws InvalidArgumentException, IOException {
	VideoFile video = new VideoFile("slevin");
	video.open();
	AudioFile audio = new AudioFile("anthem");
	audio.open();
    }

}
