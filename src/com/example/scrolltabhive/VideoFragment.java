package com.example.scrolltabhive;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;
 
public class VideoFragment extends Fragment {
	public TextView videoTitle;
    private VideoView video;
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_video, container, false);
        video = (VideoView) rootView.findViewById(R.id.videoView1);
        videoTitle = (TextView)rootView.findViewById(R.id.textView1);
        videoTitle.setText("Colonoscopy Prep Intro Video");
        video.setVideoURI(Uri.parse("android.resource://" + getActivity().getPackageName() + "/" + R.raw.intro_video));

        video.setMediaController(new MediaController(rootView.getContext()));
        video.start();
        video.requestFocus();
        return rootView;
    }
}