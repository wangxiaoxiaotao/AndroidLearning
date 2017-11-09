package learn.androidlearning;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b2=new Button(this);
        b2.setText("新建按钮");
        ConstraintLayout layout =findViewById(R.id.layout1);
        layout.addView(b2,new RelativeLayout.LayoutParams(300,100));
        this.setContentView(layout);
        Button b=findViewById(R.id.button);
        b.setOnClickListener(MainActivity.this);
        Button b1=findViewById(R.id.button2);
        b1.setOnClickListener(new clickButton());


    }

    @Override
    public void onClick(View view) {
        //if(view.getId()==R.id.button)
            Toast.makeText(MainActivity.this,"你点击了2按钮",Toast.LENGTH_SHORT).show();
    }
    public class clickButton implements View.OnClickListener{
        @Override
        public void onClick(View view){
            Toast.makeText(MainActivity.this,"你点击了1按钮",Toast.LENGTH_SHORT).show();
            Toast.makeText(MainActivity.this, "你好", Toast.LENGTH_SHORT).show();
            Toast.makeText(MainActivity.this, "nihao", Toast.LENGTH_SHORT).show();
            Toast.makeText(MainActivity.this, "git测试4", Toast.LENGTH_SHORT).show();
        }
    }
}
