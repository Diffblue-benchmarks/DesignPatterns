package com.lucafontanili.designpatterns.structural.adapter;

import java.io.IOException;

import com.lucafontanili.designpatterns.utilities.AbstractClient;
import com.lucafontanili.designpatterns.utilities.InvalidArgumentException;

public class AdapterClient extends AbstractClient {

    @Override
    public void run() throws InvalidArgumentException, IOException {
	main(new AdapterClient());

    }

    public static void main(String[] args) {
	MediaPlayer player = new MediaPlayer();
	player.play("Bangarang.flac");
	player.play("Whiplash.mkv");
    }

}
