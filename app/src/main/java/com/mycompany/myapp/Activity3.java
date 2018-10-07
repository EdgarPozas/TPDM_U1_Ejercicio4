package com.mycompany.myapp;
import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;

public class Activity3 extends Activity
{
	private EditText monto,total;
	private Spinner tipo;
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main3);
		
		monto=findViewById(R.id.mensual);
		total=findViewById(R.id.total);
		tipo=findViewById(R.id.tipo);
	}
	
	public void calcular(View v){
		if(monto.getText().toString().isEmpty()){
			Toast.makeText(Activity3.this,"Llena todos los campos",Toast.LENGTH_SHORT).show();
			return;
		}
		int indx=tipo.getSelectedItemPosition();
		float[] porcentajes={0.1f,0.16f};
		float t=Float.parseFloat(monto.getText().toString());
		t+=t*porcentajes[indx];
		total.setText(t+"");
	}
	
}
