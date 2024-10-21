package com.uk.chatkar;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.zegocloud.uikit.prebuilt.call.invite.widget.ZegoSendCallInvitationButton;
import com.zegocloud.uikit.service.defines.ZegoUIKitUser;

import java.util.Collections;

public class profile extends AppCompatActivity {

    TextView caller;
    EditText targetuser;
    ZegoSendCallInvitationButton callbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_profile);

        caller = findViewById(R.id.textView);
        targetuser = findViewById(R.id.editId);
        callbtn = findViewById(R.id.callBtn);

        caller.setText("You are: " + getIntent().getStringExtra("caller"));

        targetuser.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                startvideocall(targetuser.getText().toString().trim());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }

    public void startvideocall(String targetuserid){
        callbtn.setIsVideoCall(true);
        callbtn.setResourceID("zego_uikit_call"); // Please fill in the resource ID name that has been configured in the ZEGOCLOUD's console here.
        callbtn.setInvitees(Collections.singletonList(new ZegoUIKitUser(targetuserid,targetuserid)));
    }

}