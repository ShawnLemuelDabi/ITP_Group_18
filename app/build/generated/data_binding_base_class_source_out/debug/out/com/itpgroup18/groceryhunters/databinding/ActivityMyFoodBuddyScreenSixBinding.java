// Generated by data binding compiler. Do not edit!
package com.itpgroup18.groceryhunters.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.itpgroup18.groceryhunters.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityMyFoodBuddyScreenSixBinding extends ViewDataBinding {
  @NonNull
  public final EditText textResult;

  protected ActivityMyFoodBuddyScreenSixBinding(Object _bindingComponent, View _root,
      int _localFieldCount, EditText textResult) {
    super(_bindingComponent, _root, _localFieldCount);
    this.textResult = textResult;
  }

  @NonNull
  public static ActivityMyFoodBuddyScreenSixBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_my_food_buddy_screen_six, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMyFoodBuddyScreenSixBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityMyFoodBuddyScreenSixBinding>inflateInternal(inflater, R.layout.activity_my_food_buddy_screen_six, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityMyFoodBuddyScreenSixBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_my_food_buddy_screen_six, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMyFoodBuddyScreenSixBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityMyFoodBuddyScreenSixBinding>inflateInternal(inflater, R.layout.activity_my_food_buddy_screen_six, null, false, component);
  }

  public static ActivityMyFoodBuddyScreenSixBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityMyFoodBuddyScreenSixBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ActivityMyFoodBuddyScreenSixBinding)bind(component, view, R.layout.activity_my_food_buddy_screen_six);
  }
}
