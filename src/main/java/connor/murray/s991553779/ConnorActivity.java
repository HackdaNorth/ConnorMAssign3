/*
Connor Murray
Student ID: 991553779
Section #34780
 */
package connor.murray.s991553779;

import android.Manifest;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class ConnorActivity extends AppCompatActivity {

    private static final int PERMISSION_REQUEST_CODE = 0;
    private CanvasVIew customCanvas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_connor);
        BottomNavigationView navView = findViewById(R.id.connorNav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
               R.id.connorFragment, R.id.murrayFragment, R.id.S991553779Fragment)
                .build();

        NavController navController = Navigation.findNavController(this,R.id.connorNav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);

        customCanvas = (CanvasVIew) findViewById(R.id.connorCanvas);




    }

    //back button intercept
    @Override
    public void onBackPressed() {
        exitAlert(ConnorActivity.this);
    }

    //back button intercept alert dialog
    public void exitAlert(Context mContext) {
        new AlertDialog.Builder(mContext)
                .setIcon(R.mipmap.ic_launcher)
                .setTitle("Exit - Connor Murray 991553779")
                .setMessage("Do you wish to exit?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        System.exit(0);
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }

}