package com.example.monsyndic.fragements;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.monsyndic.R;


public class HomeFragment extends Fragment {

    private ImageView PaiementImage, ProfilImage, ReclamationImage, DocumentImage, SituationImage, BienImage;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        PaiementImage = view.findViewById(R.id.soldImage);
        ProfilImage = view.findViewById(R.id.profilImage);
        DocumentImage = view.findViewById(R.id.documentImage);
        SituationImage = view.findViewById(R.id.situationImage);
        ReclamationImage = view.findViewById(R.id.reclamationImage);
        BienImage = view.findViewById(R.id.bienImage);

        PaiementImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), PaiementsFragment.class));
            }
        });
        ProfilImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), ProfileFragment.class));
            }
        });
        DocumentImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), DocumentsFragment.class));
            }
        });
        ReclamationImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), ReclamationsFragment.class));
            }
        });
        BienImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), BienFragment.class));
            }
        });
        SituationImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), SituationFragment.class));
            }
        });

        return view;
    }
}
