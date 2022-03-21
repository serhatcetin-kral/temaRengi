
package com.example.webview2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {



    EditText edtadress;
    WebView tarayici;
    Button btngit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtadress=findViewById(R.id.edturl);
        tarayici=findViewById(R.id.webview);
        btngit=findViewById(R.id.btngit);

        btngit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url;
                url=edtadress.getText().toString();
                tarayici.setWebViewClient(new WebViewClient());
                tarayici.loadUrl(url);
//manifests ye gidip internet icin izn verdik

            }
        });
    }

    //bu kismi yapmamizin sebebi geriye geldihgimizde programdan cikmamasi yapmak zorunda degililiz optional :)
//    @Override
//    protected void onRestart() {
//        super.onRestart();
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//    }
//yukaridakiler sadece hatirlatma onemli degil
//
    @Override
    public void onBackPressed() {
        if(tarayici.canGoBack()){
            tarayici.goBack();
        }else{
            super.onBackPressed();
        }


    }
}