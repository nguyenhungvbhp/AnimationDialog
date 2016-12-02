package mt.com.vn.hocanimationdialog;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnShowDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        addEvens();
    }

    private void addEvens() {
        btnShowDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog();
            }
        });
    }

    private void initViews() {
        btnShowDialog = (Button) this.findViewById(R.id.btnShowDialog);
    }

    private void openDialog(){
        final Dialog dialog = new Dialog(MainActivity.this);
        dialog.setTitle("Animation Dialog");
        dialog.setContentView(R.layout.animation_dialog);
        dialog.getWindow().getAttributes().windowAnimations =
                R.style.DialogAnimation;
        dialog.setCancelable(false);
        final Button btnDismiss = (Button) dialog.getWindow().findViewById(R.id.btnDissmis);
        btnDismiss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }
}
