package com.example.movingimages;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    //Screen Size
    //variables
    private int screenWidth;
    private int screenHeight;
    private int lives;
    //Images
    private ImageView real;
    private ImageView f1;
    private ImageView f2;
    private ImageView f3;
    private ImageView f4;
    private ImageView f5;
    private ImageView f6;
    private ImageView f7;
    private ImageView f8;
    private ImageView f9;
    private ImageView f10;
    private ImageView f11;
    private ImageView f12;
    private ImageView f13;
    private ImageView f14;
    private ImageView f15;
    private ImageView f16;
    private ImageView f17;
    private ImageView f18;
    private ImageView f19;
    private ImageView f20;
    private ImageView f21;
    private ImageView f22;
    private ImageView f23;
    private ImageView f24;
    private ImageView f25;
    private ImageView f26;
    private ImageView f27;
    private ImageView f28;
    private ImageView f29;
    private ImageView f30;
    private ImageView f31;
    private ImageView f32;
    private ImageView f33;
    private ImageView f34;
    private ImageView f35;
    private ImageView f36;
    private ImageView f37;
    private ImageView f38;
    private ImageView f39;

    //Position
    private float realx;
    private float f1x;
    private float f2x;
    private float f3x;
    private float f4x;
    private float f5x;
    private float f6x;
    private float f7x;
    private float f8x;
    private float f9x;
    private float f10x;
    private float f11x;
    private float f12x;
    private float f13x;
    private float f14x;
    private float f15x;
    private float f16x;
    private float f17x;
    private float f18x;
    private float f19x;
    private float f20x;
    private float f21x;
    private float f22x;
    private float f23x;
    private float f24x;
    private float f25x;
    private float f26x;
    private float f27x;
    private float f28x;
    private float f29x;
    private float f30x;
    private float f31x;
    private float f32x;
    private float f33x;
    private float f34x;
    private float f35x;
    private float f36x;
    private float f37x;
    private float f38x;
    private float f39x;
    private float realy;
    private float f1y;
    private float f2y;
    private float f3y;
    private float f4y;
    private float f5y;
    private float f6y;
    private float f7y;
    private float f8y;
    private float f9y;
    private float f10y;
    private float f11y;
    private float f12y;
    private float f13y;
    private float f14y;
    private float f15y;
    private float f16y;
    private float f17y;
    private float f18y;
    private float f19y;
    private float f20y;
    private float f21y;
    private float f22y;
    private float f23y;
    private float f24y;
    private float f25y;
    private float f26y;
    private float f27y;
    private float f28y;
    private float f29y;
    private float f30y;
    private float f31y;
    private float f32y;
    private float f33y;
    private float f34y;
    private float f35y;
    private float f36y;
    private float f37y;
    private float f38y;
    private float f39y;

    //Initialize Class
    private Handler handler;
    private Timer timer;

    //swathi
    private static final long START_TIME = 30000;
    private TextView CountDown;
    private TextView Lives;
    private Button myButton;
    private SoundPlayer sound;
    private CountDownTimer myCountDownTimer;
    private boolean myTimerRunning;
    private long myTimeLeft = START_TIME;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        handler = new Handler();
        timer = new Timer();

        lives = 3;

        real = findViewById(R.id.GEOFF);
        f1 = findViewById(R.id.fakegeoff1);
        f2 = findViewById(R.id.fakegeoff2);
        f3 = findViewById(R.id.fakegeoff3);
        f4 = findViewById(R.id.fakegeoff4);
        f5 = findViewById(R.id.fakegeoff5);
        f6 = findViewById(R.id.fakegeoff6);
        f7 = findViewById(R.id.fakegeoff7);
        f8 = findViewById(R.id.fakegeoff8);
        f9 = findViewById(R.id.fakegeoff9);
        f10 = findViewById(R.id.fakegeoff10);
        f11 = findViewById(R.id.fakegeoff11);
        f12 = findViewById(R.id.fakegeoff12);
        f13 = findViewById(R.id.fakegeoff13);
        f14 = findViewById(R.id.fakegeoff14);
        f15 = findViewById(R.id.fakegeoff15);
        f16 = findViewById(R.id.fakegeoff16);
        f17 = findViewById(R.id.fakegeoff17);
        f18 = findViewById(R.id.fakegeoff18);
        f19 = findViewById(R.id.fakegeoff19);
        f20 = findViewById(R.id.fakegeoff20);
        f21 = findViewById(R.id.fakegeoff21);
        f22 = findViewById(R.id.fakegeoff22);
        f23 = findViewById(R.id.fakegeoff23);
        f24 = findViewById(R.id.fakegeoff24);
        f25 = findViewById(R.id.fakegeoff25);
        f26 = findViewById(R.id.fakegeoff26);
        f27 = findViewById(R.id.fakegeoff27);
        f28 = findViewById(R.id.fakegeoff28);
        f29 = findViewById(R.id.fakegeoff29);
        f30 = findViewById(R.id.fakegeoff30);
        f31 = findViewById(R.id.fakegeoff31);
        f32 = findViewById(R.id.fakegeoff32);
        f33 = findViewById(R.id.fakegeoff33);
        f34 = findViewById(R.id.fakegeoff34);
        f35 = findViewById(R.id.fakegeoff35);
        f36 = findViewById(R.id.fakegeoff36);
        f37 = findViewById(R.id.fakegeoff37);
        f38 = findViewById(R.id.fakegeoff38);
        f39 = findViewById(R.id.fakegeoff39);

        //Get Screen Size
        WindowManager wm = getWindowManager();
        Display disp = wm.getDefaultDisplay();
        Point size = new Point();
        disp.getSize(size);
        screenWidth = size.x;
        screenHeight = size.y;

        //Move to out of screen;
        //f1.setX(-80.0f);
        //f1.setY(-80.0f);

        //Start the timer.
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        changePos();
                    }
                });
            }
        },0 ,20);
        CountDown = findViewById(R.id.text_view_countdown);
        Lives = findViewById(R.id.text_view_lives);
        sound = new SoundPlayer(this);
        touchCheck();
        setLives();
        startTimer();
    }

    public void changePos() {
        //Up
        //1,7,15,22,28,35,38,17,20,27
        f1y -= 5;
        if (f1.getY() + f1.getHeight() < 0) {
            f1x = (float)Math.floor(Math.random() * (screenWidth - f1.getWidth()));
            f1y = screenHeight + 100.0f;
        }
        f1.setX(f1x);
        f1.setY(f1y);

        f7y -= 10;
        if (f7.getY() + f7.getHeight() < 0) {
            f7x = (float)Math.floor(Math.random() * (screenWidth - f7.getWidth()));
            f7y = screenHeight + 100.0f;
        }
        f7.setX(f7x);
        f7.setY(f7y);

        f15y -= 15;
        if (f15.getY() + f15.getHeight() < 0) {
            f15x = (float)Math.floor(Math.random() * (screenWidth - f15.getWidth()));
            f15y = screenHeight + 100.0f;
        }
        f15.setX(f15x);
        f15.setY(f15y);

        f22y -= 20;
        if (f22.getY() + f22.getHeight() < 0) {
            f22x = (float)Math.floor(Math.random() * (screenWidth - f22.getWidth()));
            f22y = screenHeight + 100.0f;
        }
        f22.setX(f22x);
        f22.setY(f22y);

        f28y -= 25;
        if (f28.getY() + f28.getHeight() < 0) {
            f28x = (float)Math.floor(Math.random() * (screenWidth - f28.getWidth()));
            f28y = screenHeight + 100.0f;
        }
        f28.setX(f28x);
        f28.setY(f28y);

        f35y -= 30;
        if (f35.getY() + f35.getHeight() < 0) {
            f35x = (float)Math.floor(Math.random() * (screenWidth - f35.getWidth()));
            f35y = screenHeight + 100.0f;
        }
        f35.setX(f35x);
        f35.setY(f35y);

        f38y -= 25;
        if (f38.getY() + f38.getHeight() < 0) {
            f38x = (float)Math.floor(Math.random() * (screenWidth - f38.getWidth()));
            f38y = screenHeight + 100.0f;
        }
        f38.setX(f38x);
        f38.setY(f38y);

        f17y -= 20;
        if (f17.getY() + f17.getHeight() < 0) {
            f17x = (float)Math.floor(Math.random() * (screenWidth - f17.getWidth()));
            f17y = screenHeight + 100.0f;
        }
        f17.setX(f17x);
        f17.setY(f17y);

        f20y -= 15;
        if (f20.getY() + f20.getHeight() < 0) {
            f20x = (float)Math.floor(Math.random() * (screenWidth - f20.getWidth()));
            f20y = screenHeight + 100.0f;
        }
        f20.setX(f20x);
        f20.setY(f20y);

        f27y -= 35;
        if (f27.getY() + f27.getHeight() < 0) {
            f27x = (float)Math.floor(Math.random() * (screenWidth - f27.getWidth()));
            f27y = screenHeight + 100.0f;
        }
        f27.setX(f27x);
        f27.setY(f27y);

        //Down
        //36,40(GEOFF),32,26,18,3,10,16,24,31
        f36y += 5;
        if (f36.getY() > screenHeight) {
            f36x = (float)Math.floor(Math.random() * (screenWidth - f36.getWidth()));
            f36y = - 100.0f;
        }
        f36.setX(f36x);
        f36.setY(f36y);

        //40
        realy += 30;
        if (real.getY() > screenHeight) {
            realx = (float)Math.floor(Math.random() * (screenWidth - real.getWidth()));
            realy = - 100.0f;
        }
        real.setX(realx);
        real.setY(realy);

        //32
        f32y += 15;
        if (f32.getY() > screenHeight) {
            f32x = (float)Math.floor(Math.random() * (screenWidth - f32.getWidth()));
            f32y = - 100.0f;
        }
        f32.setX(f32x);
        f32.setY(f32y);

        //26
        f26y += 20;
        if (f26.getY() > screenHeight) {
            f26x = (float)Math.floor(Math.random() * (screenWidth - f26.getWidth()));
            f26y = - 100.0f;
        }
        f26.setX(f26x);
        f26.setY(f26y);

        //18
        f18y += 25;
        if (f18.getY() > screenHeight) {
            f18x = (float)Math.floor(Math.random() * (screenWidth - f18.getWidth()));
            f18y = - 100.0f;
        }
        f18.setX(f18x);
        f18.setY(f18y);

        //10
        f10y += 30;
        if (f10.getY() > screenHeight) {
            f10x = (float)Math.floor(Math.random() * (screenWidth - f10.getWidth()));
            f10y = - 100.0f;
        }
        f10.setX(f10x);
        f10.setY(f10y);

        //16
        f16y += 25;
        if (f16.getY() > screenHeight) {
            f16x = (float)Math.floor(Math.random() * (screenWidth - f16.getWidth()));
            f16y = - 100.0f;
        }
        f16.setX(f16x);
        f16.setY(f16y);

        //24
        f24y += 20;
        if (f24.getY() > screenHeight) {
            f24x = (float)Math.floor(Math.random() * (screenWidth - f24.getWidth()));
            f24y = - 100.0f;
        }
        f24.setX(f24x);
        f24.setY(f24y);

        //31
        f31y += 15;
        if (f31.getY() > screenHeight) {
            f31x = (float)Math.floor(Math.random() * (screenWidth - f31.getWidth()));
            f31y = - 100.0f;
        }
        f31.setX(f31x);
        f31.setY(f31y);


        //Left
        //3
        f3x -= 10;
        if (f3.getX() + f3.getWidth() < 0) {
            f3x = screenWidth + 100.0f;
            f3y = (float)Math.floor(Math.random() * (screenHeight - f3.getHeight()));
        }
        f3.setX(f3x);
        f3.setY(f3y);

        //34
        f34x -= 35;
        if (f34.getX() + f34.getWidth() < 0) {
            f34x = screenWidth + 100.0f;
            f34y = (float)Math.floor(Math.random() * (screenHeight - f34.getHeight()));
        }
        f34.setX(f34x);
        f34.setY(f34y);

        // 33
        f33x -= 5;
        if (f33.getX() + f33.getWidth() < 0) {
            f33x = screenWidth + 100.0f;
            f33y = (float)Math.floor(Math.random() * (screenHeight - f33.getHeight()));
        }
        f33.setX(f33x);
        f33.setY(f33y);

        // 29
        f29x -= 26;
        if (f29.getX() + f29.getWidth() < 0) {
            f29x = screenWidth + 100.0f;
            f29y = (float)Math.floor(Math.random() * (screenHeight - f29.getHeight()));
        }
        f29.setX(f29x);
        f29.setY(f29y);

        // 19,
        f19x -= 24;
        if (f19.getX() + f19.getWidth() < 0) {
            f19x = screenWidth + 100.0f;
            f19y = (float)Math.floor(Math.random() * (screenHeight - f19.getHeight()));
        }
        f19.setX(f19x);
        f19.setY(f19y);

        // 9,
        f9x -= 32;
        if (f9.getX() + f9.getWidth() < 0) {
            f9x = screenWidth + 100.0f;
            f9y = (float)Math.floor(Math.random() * (screenHeight - f9.getHeight()));
        }
        f9.setX(f9x);
        f9.setY(f9y);

        // 11
        f11x -= 12;
        if (f11.getX() + f11.getWidth() < 0) {
            f11x = screenWidth + 100.0f;
            f11y = (float)Math.floor(Math.random() * (screenHeight - f11.getHeight()));
        }
        f11.setX(f11x);
        f11.setY(f11y);

        // ,5,
        f5x -= 15;
        if (f5.getX() + f5.getWidth() < 0) {
            f5x = screenWidth + 100.0f;
            f5y = (float)Math.floor(Math.random() * (screenHeight - f5.getHeight()));
        }
        f5.setX(f5x);
        f5.setY(f5y);

        // 6,
        f6x -= 18;
        if (f6.getX() + f6.getWidth() < 0) {
            f6x = screenWidth + 100.0f;
            f6y = (float)Math.floor(Math.random() * (screenHeight - f6.getHeight()));
        }
        f6.setX(f6x);
        f6.setY(f6y);

        // 2,
        f2x -= 4;
        if (f2.getX() + f2.getWidth() < 0) {
            f2x = screenWidth + 100.0f;
            f2y = (float)Math.floor(Math.random() * (screenHeight - f2.getHeight()));
        }
        f2.setX(f2x);
        f2.setY(f2y);

        // 13
        f13x -= 3;
        if (f13.getX() + f13.getWidth() < 0) {
            f13x = screenWidth + 100.0f;
            f13y = (float)Math.floor(Math.random() * (screenHeight - f13.getHeight()));
        }
        f13.setX(f13x);
        f13.setY(f13y);

        //Right
        //12
        f12x += 6;
        if (f12.getX() > screenWidth) {
            f12x = -100.0f;
            f12y = (float)Math.floor(Math.random() * (screenHeight - f12.getHeight()));
        }
        f12.setX(f12x);
        f12.setY(f12y);
        // 21
        f21x += 19;
        if (f21.getX() > screenWidth) {
            f21x = -100.0f;
            f21y = (float)Math.floor(Math.random() * (screenHeight - f21.getHeight()));
        }
        f21.setX(f21x);
        f21.setY(f21y);
        // 25
        f25x += 34;
        if (f25.getX() > screenWidth) {
            f25x = -100.0f;
            f25y = (float)Math.floor(Math.random() * (screenHeight - f25.getHeight()));
        }
        f25.setX(f25x);
        f25.setY(f25y);
        // 37
        f37x += 29;
        if (f37.getX() > screenWidth) {
            f37x = -100.0f;
            f37y = (float)Math.floor(Math.random() * (screenHeight - f37.getHeight()));
        }
        f37.setX(f37x);
        f37.setY(f37y);
        // 39
        f39x += 25;
        if (f39.getX() > screenWidth) {
            f39x = -100.0f;
            f39y = (float)Math.floor(Math.random() * (screenHeight - f39.getHeight()));
        }
        f39.setX(f39x);
        f39.setY(f39y);
        // 4
        f4x += 16;
        if (f4.getX() > screenWidth) {
            f4x = -100.0f;
            f4y = (float)Math.floor(Math.random() * (screenHeight - f4.getHeight()));
        }
        f4.setX(f4x);
        f4.setY(f4y);
        // 8
        f8x += 30;
        if (f8.getX() > screenWidth) {
            f8x = -100.0f;
            f8y = (float)Math.floor(Math.random() * (screenHeight - f8.getHeight()));
        }
        f8.setX(f8x);
        f8.setY(f8y);
        // 14
        f14x += 35;
        if (f14.getX() > screenWidth) {
            f14x = -100.0f;
            f14y = (float)Math.floor(Math.random() * (screenHeight - f14.getHeight()));
        }
        f14.setX(f14x);
        f14.setY(f14y);
        // 23
        f23x += 25;
        if (f23.getX() > screenWidth) {
            f23x = -100.0f;
            f23y = (float)Math.floor(Math.random() * (screenHeight - f23.getHeight()));
        }
        f23.setX(f23x);
        f23.setY(f23y);
        // 30
        f30x += 20;
        if (f30.getX() > screenWidth) {
            f30x = -100.0f;
            f30y = (float)Math.floor(Math.random() * (screenHeight - f30.getHeight()));
        }
        f30.setX(f30x);
        f30.setY(f30y);
    }
    public void startTimer() {
        myCountDownTimer = new CountDownTimer(myTimeLeft, 1000) {
            @Override
            public void onTick(long sUntilFinished) {
                myTimeLeft = sUntilFinished;
                CountDown.setText("Time Left: " + sUntilFinished / 1000);
            }
            public void onFinish() {
                CountDown.setText("game over");
                endGame();
            }
        }.start();
    }
    public void setLives() {
        Lives.setText("Lives Left: " + lives);
    }
    public void touchCheck() {
        //set sound to geoff heads and incorrect heads
        //are objects of view
        real.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound.playRightSound();
                winner();
            }
        });
        f1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound.playWrongSound();
                lives--;
                update();
            }
        });
        f2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound.playWrongSound();
                lives--;
                update();
            }
        });
        f3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound.playWrongSound();
                lives--;
                update();
            }
        });
        f4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound.playWrongSound();
            }
        });
        f5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound.playWrongSound();
                lives--;
                update();
            }
        });
        f6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound.playWrongSound();
                lives--;
                update();
            }
        });
        f7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound.playWrongSound();
                lives--;
                update();
            }
        });
        f8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound.playWrongSound();
                lives--;
                update();
            }
        });
        f9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound.playWrongSound();
                lives--;
                update();
            }
        });
        f10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound.playWrongSound();
                lives--;
                update();
            }
        });
        f11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound.playWrongSound();
                lives--;
                update();
            }
        });
        f12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound.playWrongSound();
                lives--;
                update();
            }
        });
        f13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound.playWrongSound();
                lives--;
                update();
            }
        });
        f14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound.playWrongSound();
                lives--;
                update();
            }
        });
        f15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound.playWrongSound();
                lives--;
                update();
            }
        });
        f16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound.playWrongSound();
                lives--;
                update();
            }
        });
        f17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound.playWrongSound();
                lives--;
                update();
            }
        });
        f18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound.playWrongSound();
                lives--;
                update();
            }
        });
        f19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound.playWrongSound();
                lives--;
                update();
            }
        });
        f20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound.playWrongSound();
                lives--;
                update();
            }
        });
        f21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound.playWrongSound();
                lives--;
                update();
            }
        });
        f22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound.playWrongSound();
                lives--;
                update();
            }
        });
        f23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound.playWrongSound();
                lives--;
                update();
            }
        });
        f24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound.playWrongSound();
                lives--;
                update();
            }
        });
        f25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound.playWrongSound();
                lives--;
                update();
            }
        });
        f26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound.playWrongSound();
                lives--;
                update();
            }
        });
        f27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound.playWrongSound();
                lives--;
                update();
            }
        });
        f28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound.playWrongSound();
                lives--;
                update();
            }
        });
        f29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound.playWrongSound();
                lives--;
                update();
            }
        });
        f30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound.playWrongSound();
                lives--;
                update();
            }
        });
        f31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound.playWrongSound();
                lives--;
                update();
            }
        });
        f32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound.playWrongSound();
                lives--;
                update();
            }
        });
        f33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound.playWrongSound();
                lives--;
                update();
            }
        });
        f34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound.playWrongSound();
                lives--;
                update();
            }
        });
        f35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound.playWrongSound();
                lives--;
                update();
            }
        });
        f36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound.playWrongSound();
                lives--;
                update();
            }
        });
        f37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound.playWrongSound();
                lives--;
                update();
            }
        });
        f38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound.playWrongSound();
                lives--;
                update();
            }
        });
        f39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound.playWrongSound();
                lives--;
                update();
            }
        });
    }
    private void endGame() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("GAME OVER");
        builder.setPositiveButton("Try Again", (unused1, unused2) ->startActivity(new Intent(this, MainActivity.class)));
        builder.setNegativeButton("Finish", (unused3, unused4)-> startActivity(new Intent(this, GameActivity.class)));
        builder.create().show();
    }
    private void winner() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("YOU WIN :D");
        builder.setPositiveButton("Play Again", (unused1, unused2) ->startActivity(new Intent(this, MainActivity.class)));
        builder.setNegativeButton("Finish", (unused3, unused4)-> startActivity(new Intent(this, GameActivity.class)));
        builder.create().show();
    }
    private void update() {
        setLives();
        if (lives <= 0) {
            endGame();
        }
    }
}
