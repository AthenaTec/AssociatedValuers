// Generated code from Butter Knife. Do not modify!
package com.realappraiser.associatedvaluers.fragments;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.realappraiser.associatedvaluers.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class FragmentValuationLand_ka_ViewBinding implements Unbinder {
  private FragmentValuationLand_ka target;

  @UiThread
  public FragmentValuationLand_ka_ViewBinding(FragmentValuationLand_ka target, View source) {
    this.target = target;

    target.id_radiogroup_considerforvaluation_land = Utils.findRequiredViewAsType(source, R.id.id_radiogroup_considerforvaluation_land, "field 'id_radiogroup_considerforvaluation_land'", RadioGroup.class);
    target.id_radio_considerforvaluation_permissiblearea_land = Utils.findRequiredViewAsType(source, R.id.id_radio_considerforvaluation_permissiblearea_land, "field 'id_radio_considerforvaluation_permissiblearea_land'", RadioButton.class);
    target.id_radio_considerforvaluation_actualarea_land = Utils.findRequiredViewAsType(source, R.id.id_radio_considerforvaluation_actualarea_land, "field 'id_radio_considerforvaluation_actualarea_land'", RadioButton.class);
    target.linear_permissiblearea = Utils.findRequiredViewAsType(source, R.id.linear_permissiblearea, "field 'linear_permissiblearea'", LinearLayout.class);
    target.linear_actualarea = Utils.findRequiredViewAsType(source, R.id.linear_actualarea, "field 'linear_actualarea'", LinearLayout.class);
    target.spinner_ft_meter = Utils.findRequiredViewAsType(source, R.id.spinner_ft_meter, "field 'spinner_ft_meter'", Spinner.class);
    target.textview_landvaluation = Utils.findRequiredViewAsType(source, R.id.textview_landvaluation, "field 'textview_landvaluation'", TextView.class);
    target.textview_unit_land = Utils.findRequiredViewAsType(source, R.id.textview_unit_land, "field 'textview_unit_land'", TextView.class);
    target.textview_totalpropertyvalue = Utils.findRequiredViewAsType(source, R.id.textview_totalpropertyvalue, "field 'textview_totalpropertyvalue'", TextView.class);
    target.textview_proposedvaluation = Utils.findRequiredViewAsType(source, R.id.textview_proposedvaluation, "field 'textview_proposedvaluation'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    FragmentValuationLand_ka target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.id_radiogroup_considerforvaluation_land = null;
    target.id_radio_considerforvaluation_permissiblearea_land = null;
    target.id_radio_considerforvaluation_actualarea_land = null;
    target.linear_permissiblearea = null;
    target.linear_actualarea = null;
    target.spinner_ft_meter = null;
    target.textview_landvaluation = null;
    target.textview_unit_land = null;
    target.textview_totalpropertyvalue = null;
    target.textview_proposedvaluation = null;
  }
}
