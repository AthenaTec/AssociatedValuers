// Generated code from Butter Knife. Do not modify!
package com.realappraiser.associatedvaluers.activities;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.Toolbar;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.google.android.material.tabs.TabLayout;
import com.realappraiser.associatedvaluers.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class PhotoLatLngTab_ViewBinding implements Unbinder {
  private PhotoLatLngTab target;

  @UiThread
  public PhotoLatLngTab_ViewBinding(PhotoLatLngTab target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public PhotoLatLngTab_ViewBinding(PhotoLatLngTab target, View source) {
    this.target = target;

    target.tabLayout = Utils.findRequiredViewAsType(source, R.id.tabLayout, "field 'tabLayout'", TabLayout.class);
    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    target.parentLay = Utils.findRequiredViewAsType(source, R.id.parentLay, "field 'parentLay'", LinearLayout.class);
    target.username = Utils.findRequiredViewAsType(source, R.id.username, "field 'username'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    PhotoLatLngTab target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tabLayout = null;
    target.toolbar = null;
    target.parentLay = null;
    target.username = null;
  }
}
