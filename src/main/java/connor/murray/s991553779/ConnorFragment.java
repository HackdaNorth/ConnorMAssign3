/*
Connor Murray
Student ID: 991553779
Section #34780
 */
package connor.murray.s991553779;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ConnorFragment extends Fragment {


    public static ConnorFragment newInstance() {
        return new ConnorFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.connor_fragment, container, false);
    }



}