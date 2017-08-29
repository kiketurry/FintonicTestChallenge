package com.fintonic.fintonictestchallenge;

import android.support.test.espresso.ViewInteraction;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.fintonic.fintonictestchallenge.ui.features.list.ListMarvelSuperHeroesActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isAssignableFrom;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withParent;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.core.AllOf.allOf;

/**
 * Created by Kiketurry on 30/08/2017.
 */

@RunWith(AndroidJUnit4.class)
@LargeTest
public class ListMarvelSuperheroesActivityTest {
    @Rule
    public ActivityTestRule<ListMarvelSuperHeroesActivity> mActivityRule = new ActivityTestRule<>(ListMarvelSuperHeroesActivity.class);
    
    @Test
    public void toolbarTitle() {
        CharSequence title = "Marvel Super Heroes";
        matchToolbarTitle(title);
    }
    
    @Test
    public void recyclerViewIsVisible() {
        onView(withId(R.id.rv_marvel_super_heroes)).check(matches(isDisplayed()));
    }
    
    private static ViewInteraction matchToolbarTitle(
            CharSequence title) {
        return onView(
                allOf(
                        isAssignableFrom(TextView.class),
                        withParent(isAssignableFrom(Toolbar.class))))
                .check(matches(withText(title.toString())));
    }
}
