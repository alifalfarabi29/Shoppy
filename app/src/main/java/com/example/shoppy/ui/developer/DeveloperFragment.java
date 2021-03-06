package com.example.shoppy.ui.developer;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.shoppy.databinding.FragmentDeveloperBinding;
//import com.example.shoppy.ui.gallery.DeveloperViewModel;

public class DeveloperFragment extends Fragment {

private FragmentDeveloperBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        DeveloperViewModel galleryViewModel =
                new ViewModelProvider(this).get(DeveloperViewModel.class);

    binding = FragmentDeveloperBinding.inflate(inflater, container, false);
    View root = binding.getRoot();

        final TextView textView = binding.textDeveloper;
        galleryViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

@Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}