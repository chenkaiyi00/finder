package com.example.chen.finder.ui;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.chen.finder.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link loginFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link loginFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class loginFragment extends Fragment {
    private Button log_in;
    private Button sign_up;
    private Button swipe;
    private OnFragmentInteractionListener mListener;
    private RelativeLayout mainLayout;
    private EditText username;
    private EditText password;
    private EditText firstname;
    private EditText lastemame;
    private EditText Email;
    private EditText password_signup;
    private TextView forgetpwd;
    public    boolean inmain;
    public  boolean inlog;
    public   boolean insignup;


    public static  loginFragment newInstance(){
        return new loginFragment();
    }

    public loginFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        final ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_login, container, false);
        mainLayout = (RelativeLayout) rootView.findViewById(R.id.main_layout);
        log_in = (Button)rootView.findViewById(R.id.login);
        sign_up=(Button)rootView.findViewById(R.id.signup);
        swipe=(Button)rootView.findViewById(R.id.swipe);
        inmain=true;
        insignup=false;
        inlog=false;
        // when login button clicked, show username and passord,edit text, set other invisible
        log_in.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
            @Override
            public void onClick(View v) {
                sign_up.setVisibility(View.INVISIBLE );
                log_in.setVisibility(View.INVISIBLE );
                swipe.setVisibility(View.INVISIBLE);

                WindowManager wm=(WindowManager) mainLayout.getContext().getSystemService(Context.WINDOW_SERVICE);
                Display display = wm.getDefaultDisplay();
                int width = (int)(display.getWidth()*0.7);

                //add username edit text
                username=new EditText(mainLayout.getContext()); // ?????
                username.setId(View.generateViewId());
                RelativeLayout.LayoutParams params1=new RelativeLayout.LayoutParams(
                        width,
                        RelativeLayout.LayoutParams.WRAP_CONTENT);
                params1.setMargins(0, 50, 0, 0);;
                params1.addRule(RelativeLayout.CENTER_IN_PARENT);
                params1.addRule(RelativeLayout.BELOW, R.id.logo_contatiner);
                username.setHint("Email or Username");
                username.setTextSize(16);
                mainLayout.addView(username, params1); // done username

                password=new EditText(mainLayout.getContext());
                password.setId(View.generateViewId());
                RelativeLayout.LayoutParams params2=new RelativeLayout.LayoutParams(
                        width,
                        RelativeLayout.LayoutParams.WRAP_CONTENT);
                params2.setMargins(0, 15, 0, 0);
                params2.addRule(RelativeLayout.CENTER_IN_PARENT);
                params2.addRule(RelativeLayout.BELOW, username.getId());
                password.setHint("Password");
                password.setTextSize(16);
                mainLayout.addView(password, params2);//done pwd

                forgetpwd=new TextView(mainLayout.getContext());
                forgetpwd.setId(View.generateViewId());
                RelativeLayout.LayoutParams params3=new RelativeLayout.LayoutParams(
                        RelativeLayout.LayoutParams.WRAP_CONTENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT);
                params3.setMargins(0,40, 0, 0);
                params3.addRule(RelativeLayout.CENTER_IN_PARENT);
                params3.addRule(RelativeLayout.BELOW, password.getId());
                forgetpwd.setText("Forgot your password?");
                forgetpwd.setTextSize(14);
                forgetpwd.setTypeface(Typeface.DEFAULT_BOLD);
                mainLayout.addView(forgetpwd, params3);
                username.setVisibility(View.VISIBLE);
                password.setVisibility(View.VISIBLE);
                forgetpwd.setVisibility(View.VISIBLE);
                inlog=true;
                inmain=false;
                insignup=false;
            }
        });

        sign_up.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
            @Override
            public void onClick(View v) {
                sign_up.setVisibility(View.INVISIBLE);
                log_in.setVisibility(View.INVISIBLE);
                swipe.setVisibility(View.INVISIBLE);
                WindowManager wm = (WindowManager) mainLayout.getContext().getSystemService(Context.WINDOW_SERVICE);
                Display display = wm.getDefaultDisplay();
                int width = (int) (display.getWidth() * 0.7);
                //add first name EditText
                firstname = new EditText(mainLayout.getContext());
                firstname.setId(View.generateViewId());
                RelativeLayout.LayoutParams params1 = new RelativeLayout.LayoutParams(
                        width,
                        RelativeLayout.LayoutParams.WRAP_CONTENT);
                params1.setMargins(0, 50, 0, 0);
                params1.addRule(RelativeLayout.CENTER_IN_PARENT);
                params1.addRule(RelativeLayout.BELOW, R.id.logo_contatiner);
                firstname.setHint("First name");
                firstname.setTextSize(16);
                mainLayout.addView(firstname, params1);//done first name

                lastemame = new EditText(mainLayout.getContext());
                lastemame.setId(View.generateViewId());
                RelativeLayout.LayoutParams params2 = new RelativeLayout.LayoutParams(
                        width,
                        RelativeLayout.LayoutParams.WRAP_CONTENT);
                params2.setMargins(0, 15, 0, 0);
                params2.addRule(RelativeLayout.CENTER_IN_PARENT);
                params2.addRule(RelativeLayout.BELOW, firstname.getId());
                lastemame.setHint("Last name");
                lastemame.setTextSize(16);
                mainLayout.addView(lastemame, params2);//done last name

                Email = new EditText(mainLayout.getContext());
                Email.setId(View.generateViewId());
                RelativeLayout.LayoutParams params3 = new RelativeLayout.LayoutParams(
                        width,
                        RelativeLayout.LayoutParams.WRAP_CONTENT);
                params3.setMargins(0, 15, 0, 0);
                params3.addRule(RelativeLayout.CENTER_IN_PARENT);
                params3.addRule(RelativeLayout.BELOW, lastemame.getId());
                Email.setHint("Email");
                Email.setTextSize(16);
                mainLayout.addView(Email, params3);//done Email

                password_signup = new EditText(mainLayout.getContext());
                password_signup.setId(View.generateViewId());
                RelativeLayout.LayoutParams params4 = new RelativeLayout.LayoutParams(
                        width,
                        RelativeLayout.LayoutParams.WRAP_CONTENT);
                params4.setMargins(0, 15, 0, 0);
                params4.addRule(RelativeLayout.CENTER_IN_PARENT);
                params4.addRule(RelativeLayout.BELOW, Email.getId());
                password_signup.setHint("Password");
                password_signup.setTextSize(16);
                mainLayout.addView(password_signup, params4);//done password_signup
                insignup=true;
                inmain=false;
                inlog=false;
            }
        });
        return  rootView;
    }
    public void showmainfromloin(){
        sign_up.setVisibility(View.VISIBLE );
        log_in.setVisibility(View.VISIBLE );
        swipe.setVisibility(View.VISIBLE);
        username.setVisibility(View.INVISIBLE);
        password.setVisibility(View.INVISIBLE);
        forgetpwd.setVisibility(View.INVISIBLE);

    }
    public void showmainfromsignup(){

        sign_up.setVisibility(View.VISIBLE );
        log_in.setVisibility(View.VISIBLE );
        swipe.setVisibility(View.VISIBLE);
        firstname.setVisibility(View.INVISIBLE);
        lastemame.setVisibility(View.INVISIBLE);
        Email.setVisibility(View.INVISIBLE);
        password_signup.setVisibility(View.INVISIBLE);
    }
    public void showsignup(){
        firstname.setVisibility(View.VISIBLE);
        lastemame.setVisibility(View.VISIBLE);
        Email.setVisibility(View.VISIBLE);
        password_signup.setVisibility(View.VISIBLE);
        forgetpwd.setVisibility(View.INVISIBLE);
        username.setVisibility(View.INVISIBLE);
        password.setVisibility(View.INVISIBLE);
        sign_up.setVisibility(View.INVISIBLE );
        log_in.setVisibility(View.INVISIBLE );
        swipe.setVisibility(View.INVISIBLE);
    }
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        // activity is the container activity, here is main activity
        // This makes sure that the container activity has implemented
        // the callback interface. If not, it throws an exception

    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        public void onFragmentInteraction(Uri uri);
    }

}
