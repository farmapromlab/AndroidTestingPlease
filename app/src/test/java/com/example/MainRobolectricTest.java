package com.example;

import android.support.v4.app.Fragment;
import android.widget.TextView;
import com.example.R;
import com.example.MainActivity;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static junit.framework.TestCase.assertEquals;

@RunWith(RobolectricTestRunner.class)
@Config(emulateSdk = 18, manifest = "././src/main/AndroidManifest.xml")
public class MainRobolectricTest {

    private MainActivity mActivity;

    @Before
    public void setUp() throws Exception {
        mActivity = Robolectric.buildActivity(MainActivity.class).create().start().get();
    }

    @Test
    public void testFragment() throws Exception {
        Fragment fragment = mActivity.getSupportFragmentManager().findFragmentById(R.id.container);
        assertEquals("Hello Espresso!", ((TextView) fragment.getView().findViewById(R.id.text)).getText());
    }
}
