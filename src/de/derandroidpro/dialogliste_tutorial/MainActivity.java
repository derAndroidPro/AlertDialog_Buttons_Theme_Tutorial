package de.derandroidpro.dialogliste_tutorial;


import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements android.view.View.OnClickListener {
	
	public Button btn1;
	public AlertDialog.Builder dialogbuilder1;
	public String[] dialoglisttxt = {"Samsung","LG","Google","OnePlus"};
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_layout);
		
		
		btn1 = (Button) findViewById(R.id.button1);
		
		btn1.setOnClickListener(this);
		
		
		
	}


	@Override
	public void onClick(View v) {
		switch (v.getId()){
		case R.id.button1:{
			
			ArrayAdapter<String> dialogadapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, dialoglisttxt);
			
			
			dialogbuilder1 = new AlertDialog.Builder(new ContextThemeWrapper(MainActivity.this, android.R.style.Theme_Black));
			dialogbuilder1.setTitle("Dialog");
			dialogbuilder1.setIcon(R.drawable.ic_launcher);
			dialogbuilder1.setAdapter(dialogadapter, new OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
				
					if (dialoglisttxt [which] == "Samsung"){
						
						Toast.makeText(getApplicationContext(), "galaxy s5", Toast.LENGTH_SHORT).show();
					}
					
					if (dialoglisttxt [which] == "LG"){
						
						Toast.makeText(getApplicationContext(), "G3", Toast.LENGTH_SHORT).show();
					}
					
					if (dialoglisttxt [which] == "Google"){
						
						Toast.makeText(getApplicationContext(), "Nexus 5", Toast.LENGTH_SHORT).show();
					}
					
					if (dialoglisttxt [which] == "OnePlus"){
						
						Toast.makeText(getApplicationContext(), "one", Toast.LENGTH_SHORT).show();
					}

				}
			});
					
			dialogbuilder1.setPositiveButton("Abbrechen", new OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					Toast.makeText(getApplicationContext(), "positive Botton", Toast.LENGTH_SHORT).show();
					
				}
			});	
			
			
			dialogbuilder1.setNegativeButton("App schlieﬂen", new OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					MainActivity.this.finish();
					
				}
			});
		
			
			dialogbuilder1.create().show();
			
			break;
			}
		
	
		
		}
		
	}

	
}
