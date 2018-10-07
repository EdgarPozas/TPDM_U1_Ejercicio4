package com.mycompany.myapp;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.widget.AdapterView.*;
import android.view.*;
import android.content.*;

public class MainActivity extends Activity 
{
	private ListView lista;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		lista=findViewById(R.id.lista);
		
		lista.setOnItemClickListener(new OnItemClickListener(){
			@Override
			public void onItemClick(AdapterView<?> adap,View v,int i,long id){
				switch(i){
					case 0:
						Intent intent=new Intent(MainActivity.this,Activity2.class);
						startActivity(intent);
						break;
					case 1:
						Intent intent2=new Intent(MainActivity.this,Activity3.class);
						startActivity(intent2);
						break;
					case 2:
						Intent intent3=new Intent(MainActivity.this,Activity4.class);
						startActivity(intent3);
						break;
					case 3:
						System.exit(0);
						break;
				}
			}
		});
		
    }
}
