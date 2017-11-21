package learn.androidlearning;

import android.content.Intent;
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
        //代码创建按钮
        Button b2=new Button(this);
        b2.setText("新建按钮");
        ConstraintLayout layout =findViewById(R.id.layout1);
        layout.addView(b2,new RelativeLayout.LayoutParams(300,100));
        this.setContentView(layout);
        //代码创建按钮_end

        Button b=findViewById(R.id.button);
        b.setOnClickListener(MainActivity.this);
        Button b1=findViewById(R.id.button2);
        b1.setOnClickListener(new clickButton());


    }
    //当前类使用implements View.OnClickListener以使用点击事件接口。重载onClick
    @Override
    public void onClick(View view) {
        //if(view.getId()==R.id.button)
            Toast.makeText(MainActivity.this,"你点击了2按钮",Toast.LENGTH_SHORT).show();
    }

    //直接创建使用点击事件接口的类
    public class clickButton implements View.OnClickListener{
        @Override
        public void onClick(View view){
            Toast.makeText(MainActivity.this,"你点击了1按钮",Toast.LENGTH_SHORT).show();
            Intent intent =new Intent(MainActivity.this,newActivityTest.class);
            startActivity(intent);
        }
    }
}
