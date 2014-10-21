package espresso;

import android.test.ActivityInstrumentationTestCase2;

import com.marcthomas.testrobolectric.MyActivity;
import com.marcthomas.testrobolectric.R;

import static com.google.android.apps.common.testing.ui.espresso.Espresso.onView;
import static com.google.android.apps.common.testing.ui.espresso.assertion.ViewAssertions.matches;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.withId;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.withText;

public class EspressoTest extends ActivityInstrumentationTestCase2<MyActivity> {

    @SuppressWarnings("deprecation")
    public EspressoTest() {
        // This constructor was deprecated - but we want to support lower API levels.
        super("com.marcthomas.testrobolectric", MyActivity.class);
    }
    @Override
    public void setUp() throws Exception {
        super.setUp();
        // Espresso will not launch our activity for us, we must launch it via getActivity().
        getActivity();
    }

    public void testCheckText() {
        onView(withId(R.id.text))
                .check(matches(withText("Hello world!")));
    }
}
