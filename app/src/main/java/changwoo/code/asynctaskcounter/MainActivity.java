package changwoo.code.asynctaskcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv_counter1;
    private TextView tv_counter2;
    private Button btn_start;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_counter1 = findViewById(R.id.tv_counter1);
        tv_counter2 = findViewById(R.id.tv_counter2);
        btn_start = findViewById(R.id.btn_start);


        btn_start.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                MyAsyncTask asyncTask1 = new MyAsyncTask((TextView)tv_counter1);

               // asyncTask2.execute();
            }
        });


    }
}