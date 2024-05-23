// Generated code from Butter Knife. Do not modify!
package com.realappraiser.gharvalue.fragments;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.realappraiser.gharvalue.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class PhotoLatLong_ViewBinding implements Unbinder {
  private PhotoLatLong target;

  @UiThread
  public PhotoLatLong_ViewBinding(PhotoLatLong target, View source) {
    this.target = target;

    target.setlatlng = Utils.findRequiredViewAsType(source, R.id.setlatlng, "field 'setlatlng'", RelativeLayout.class);
    target.locationimage = Utils.findRequiredViewAsType(source, R.id.locationimage, "field 'locationimage'", RecyclerView.class);
    target.textview_latlng = Utils.findRequiredViewAsType(source, R.id.textview_latlng, "field 'textview_latlng'", TextView.class);
    target.textview_addimage = Utils.findRequiredViewAsType(source, R.id.textview_addimage, "field 'textview_addimage'", TextView.class);
    target.textview_next = Utils.findRequiredViewAsType(source, R.id.textview_next, "field 'textview_next'", TextView.class);
    target.textview_error_photo = Utils.findRequiredViewAsType(source, R.id.textview_error_photo, "field 'textview_error_photo'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    PhotoLatLong target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.setlatlng = null;
    target.locationimage = null;
    target.textview_latlng = null;
    target.textview_addimage = null;
    target.textview_next = null;
    target.textview_error_photo = null;
  }
}
