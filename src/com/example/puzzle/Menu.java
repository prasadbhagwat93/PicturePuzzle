package com.example.puzzle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;

public class Menu extends Activity {

	Button Play, Help, Exit;
	TextureView display;
	MediaPlayer song;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu);
		Play = (Button) findViewById(R.id.play);

		Exit = (Button) findViewById(R.id.exit);

		Help = (Button) findViewById(R.id.hlp);

		Help.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				final AlertDialog alert = new AlertDialog.Builder(Menu.this)
						.create();
				alert.setTitle(" HOW TO PLAY");
				alert.setMessage("1->Select the level\n"
						+ "2->Take photo from the camera\n"
						+ "3->Click on any two image pieces whose position are to be swapped\n"
						+ "4->Once all images are in the correct position,Click on OK button for the Status");

				alert.setButton("BACK", new DialogInterface.OnClickListener() {

					@Override
					public void onClick(final DialogInterface arg0,
							final int arg1) {
						// TODO Auto-generated method stub

						alert.closeOptionsMenu();

					}
				});

				alert.show();
			}
		});

		Play.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub

				Intent openCam = new Intent("com.example.puzzle.MainActivity");
				startActivity(openCam);
				finish();

			}
		});
		Exit.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				finish();

				// TODO Auto-generated method stub

			}
		});

	}

}
