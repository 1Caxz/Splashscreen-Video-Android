package com.icaksama.splashscreenvideo;

import android.app.Activity;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

public class Splahscreen extends Activity {

	MediaPlayer mediaPlayer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splahscreen);

		getWindow().setFormat(PixelFormat.UNKNOWN);

		VideoView videoView = (VideoView) findViewById(R.id.videoView1);

		String path = "android.resource://com.icaksama.splashscreenvideo/"
				+ R.raw.atoom1;

		Uri uri = Uri.parse(path);
		videoView.setVideoURI(uri);
		videoView.requestFocus();
		videoView.start();

		videoView.setOnCompletionListener(new OnCompletionListener() {

			@Override
			public void onCompletion(MediaPlayer arg0) {
				startActivity(new Intent(getBaseContext(), MainActivity.class));
				finish();
			}
		});
	}

}
