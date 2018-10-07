package com.mycompany.myapp;
import android.app.*;
import android.os.*;
import android.view.*;

public class Activity4 extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main4);
	}
	
	public void aceptar(View v){
		finish();
	}
	
}
