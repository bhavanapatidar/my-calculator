package com.example.calcie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity
{
    EditText et1, et2;
    Button add, sub, multi, div;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        add=findViewById(R.id.add);
        sub=findViewById(R.id.sub);
        multi=findViewById(R.id.multi);
        div =findViewById(R.id.div);
        tv=findViewById(R.id.tv);
        add.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int f, s, a;
                f = Integer.parseInt(et1.getText().toString());
                s = Integer.parseInt(et2.getText().toString());
                a = f + s;
                tv.setText("Results=" + a);


            }
        }
    };

         sub.setOnClickListener(new View.OnClickListener()
         {
              @Override
              public void onClick(View view)
             {
                 int f, s, a;
                 f = Integer.parseInt(et1.getText().toString());
                 s = Integer.parseInt(et2.getText().toString());
                 a = f - s;
                 tv.setText("Results=" + a);


             }
         }
    };
         multi.setOnClickListener(new View.OnClickListener()
         {
             @Override
             public void onClick(View view)
             {
                 int f, s, a;
                 f = Integer.parseInt(et1.getText().toString());
                 s = Integer.parseInt(et2.getText().toString());
                 a = f * s;
                 tv.setText("Results=" + a);


             }
        }
    };

        div.setOnClickListener(new View.OnClickListener()
        {
@Override
public void onClick(View view)
        {
        int f, s, a;
        f = Integer.parseInt(et1.getText().toString());
        s = Integer.parseInt(et2.getText().toString());
        a = f * s;
        tv.setText("Results=" + a);


        }
        }
        };
        }
}





