package com.mycompany.myapp;
import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;

public class Activity2 extends Activity
{
	private Spinner sp;
	private ImageView img;
	
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main2);
		sp=findViewById(R.id.selecimg);
		img=findViewById(R.id.img);
	}
	
	public void cambiar(View v){
		int ind=sp.getSelectedItemPosition();
		int[] im={R.drawable.tux,R.drawable.naruto,R.drawable.tec,R.drawable.pozas};
		img.setImageResource(im[ind]);
	}
}
