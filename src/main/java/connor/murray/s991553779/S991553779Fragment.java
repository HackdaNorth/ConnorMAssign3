/*
Connor Murray
Student ID: 991553779
Section #34780
 */
package connor.murray.s991553779;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class S991553779Fragment extends Fragment {


    public static S991553779Fragment newInstance() {
        return new S991553779Fragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.s991553779_fragment, container, false);
    }

}