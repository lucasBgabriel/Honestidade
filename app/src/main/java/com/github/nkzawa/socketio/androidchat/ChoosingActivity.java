package com.github.nkzawa.socketio.androidchat;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.Button;

public class ChoosingActivity extends Activity {

    private Button mBluetoothButton;
    private Button mHTTPButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choosing);

        mHTTPButton = (Button) this.findViewById(R.id.button_http);
        mBluetoothButton = (Button) this.findViewById(R.id.button_bluetooth);

        mBluetoothButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChoosingActivity.this, MainBluetoothActivity.class);
                startActivity(intent);
            }
        });

        mHTTPButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChoosingActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }


}
