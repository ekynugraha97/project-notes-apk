// Generated by view binder compiler. Do not edit!
package com.eky.tugasuts.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.eky.tugasuts.R;
import java.lang.NullPointerException;
import java.lang.Override;

public final class ActivityWelcome2Binding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  private ActivityWelcome2Binding(@NonNull RelativeLayout rootView) {
    this.rootView = rootView;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityWelcome2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityWelcome2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_welcome2, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityWelcome2Binding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    return new ActivityWelcome2Binding((RelativeLayout) rootView);
  }
}
