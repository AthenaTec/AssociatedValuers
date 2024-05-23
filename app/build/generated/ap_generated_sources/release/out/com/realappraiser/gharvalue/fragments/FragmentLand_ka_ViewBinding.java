// Generated code from Butter Knife. Do not modify!
package com.realappraiser.gharvalue.fragments;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.realappraiser.gharvalue.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class FragmentLand_ka_ViewBinding implements Unbinder {
  private FragmentLand_ka target;

  @UiThread
  public FragmentLand_ka_ViewBinding(FragmentLand_ka target, View source) {
    this.target = target;

    target.textview_measurement_doc = Utils.findRequiredViewAsType(source, R.id.textview_land_measurement_land, "field 'textview_measurement_doc'", TextView.class);
    target.textview_land_measurement_land = Utils.findRequiredViewAsType(source, R.id.textview_measurement_doc, "field 'textview_land_measurement_land'", TextView.class);
    target.open_calc_compound = Utils.findRequiredViewAsType(source, R.id.open_calc_compound, "field 'open_calc_compound'", ImageView.class);
    target.open_calc_measurment = Utils.findRequiredViewAsType(source, R.id.open_calc_measurment, "field 'open_calc_measurment'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    FragmentLand_ka target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.textview_measurement_doc = null;
    target.textview_land_measurement_land = null;
    target.open_calc_compound = null;
    target.open_calc_measurment = null;
  }
}
