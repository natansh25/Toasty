package com.example.natan.toasty;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        configToasty();





    }

    private void configToasty()
    {

        Toasty.Config.getInstance().

                setErrorColor(ContextCompat.getColor(this,R.color.error_color)).
                setInfoColor(ContextCompat.getColor(this,R.color.info_color)).
                setWarningColor(ContextCompat.getColor(this,R.color.warning_color)).
                setSuccessColor(ContextCompat.getColor(this,R.color.success_color))
                .apply();




    }


    public void showerror(View view)
    {
        Toasty.error(this,"xxxxxxFatal Errorxxxxx", Toast.LENGTH_SHORT,true).show();
    }
    public void showwarning(View view)
    {
        Toasty.warning(this,"Last warning boy", Toast.LENGTH_SHORT,true).show();
    }

    public void showsuccess(View view)
    {
        Toasty.success(this,"SY", Toast.LENGTH_SHORT,true).show();
    }

    public void showinfo(View view)
    {
        Toasty.info(this,"Xy123ujht", Toast.LENGTH_SHORT,true).show();
    }






}
