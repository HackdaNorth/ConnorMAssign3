/*
Connor Murray
Student ID: 991553779
Section #34780
 */
package connor.murray.s991553779;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.View;
import android.view.LayoutInflater;

import android.view.ViewGroup;
import android.widget.Button;

import org.jetbrains.annotations.NotNull;

public class ConnorFragment extends Fragment {

    private CanvasVIew customCanvas;
    private Button connorClear;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        // customCanvas = (CanvasVIew) findViewById(R.id.connorCanvas);

        connorClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                customCanvas.clear();
            }
        });
        return inflater.inflate(R.layout.connor_fragment, container, false);
    }



}
