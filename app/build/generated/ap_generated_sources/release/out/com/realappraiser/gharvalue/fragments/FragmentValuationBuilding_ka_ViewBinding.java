// Generated code from Butter Knife. Do not modify!
package com.realappraiser.gharvalue.fragments;

import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.realappraiser.gharvalue.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class FragmentValuationBuilding_ka_ViewBinding implements Unbinder {
  private FragmentValuationBuilding_ka target;

  @UiThread
  public FragmentValuationBuilding_ka_ViewBinding(FragmentValuationBuilding_ka target,
      View source) {
    this.target = target;

    target.id_radiogroup_considerforvaluation_land = Utils.findRequiredViewAsType(source, R.id.id_radiogroup_considerforvaluation_land, "field 'id_radiogroup_considerforvaluation_land'", RadioGroup.class);
    target.id_radio_considerforvaluation_permissiblearea_land = Utils.findRequiredViewAsType(source, R.id.id_radio_considerforvaluation_permissiblearea_land, "field 'id_radio_considerforvaluation_permissiblearea_land'", RadioButton.class);
    target.id_radio_considerforvaluation_actualarea_land = Utils.findRequiredViewAsType(source, R.id.id_radio_considerforvaluation_actualarea_land, "field 'id_radio_considerforvaluation_actualarea_land'", RadioButton.class);
    target.id_radiogroup_considerforvaluation_construction = Utils.findRequiredViewAsType(source, R.id.id_radiogroup_considerforvaluation_construction, "field 'id_radiogroup_considerforvaluation_construction'", RadioGroup.class);
    target.id_radio_considerforvaluation_permissiblearea_construction = Utils.findRequiredViewAsType(source, R.id.id_radio_considerforvaluation_permissiblearea_construction, "field 'id_radio_considerforvaluation_permissiblearea_construction'", RadioButton.class);
    target.id_radio_considerforvaluation_actualarea_construction = Utils.findRequiredViewAsType(source, R.id.id_radio_considerforvaluation_actualarea_construction, "field 'id_radio_considerforvaluation_actualarea_construction'", RadioButton.class);
    target.linear_permissiblearea = Utils.findRequiredViewAsType(source, R.id.linear_permissiblearea, "field 'linear_permissiblearea'", LinearLayout.class);
    target.linear_actualarea = Utils.findRequiredViewAsType(source, R.id.linear_actualarea, "field 'linear_actualarea'", LinearLayout.class);
    target.linear_permissiblearea_row = Utils.findRequiredViewAsType(source, R.id.linear_permissiblearea_row, "field 'linear_permissiblearea_row'", LinearLayout.class);
    target.linear_actual_row = Utils.findRequiredViewAsType(source, R.id.linear_actual_row, "field 'linear_actual_row'", LinearLayout.class);
    target.textview_landvaluation = Utils.findRequiredViewAsType(source, R.id.textview_landvaluation, "field 'textview_landvaluation'", TextView.class);
    target.textview_unit_land = Utils.findRequiredViewAsType(source, R.id.textview_unit_land, "field 'textview_unit_land'", TextView.class);
    target.textview_constructionvaluation = Utils.findRequiredViewAsType(source, R.id.textview_constructionvaluation, "field 'textview_constructionvaluation'", TextView.class);
    target.textview_unit_construction = Utils.findRequiredViewAsType(source, R.id.textview_unit_construction, "field 'textview_unit_construction'", TextView.class);
    target.textview_floor_head = Utils.findRequiredViewAsType(source, R.id.textview_floor_head, "field 'textview_floor_head'", TextView.class);
    target.textview_permissiblearea_head = Utils.findRequiredViewAsType(source, R.id.textview_permissiblearea_head, "field 'textview_permissiblearea_head'", TextView.class);
    target.textview_value_head = Utils.findRequiredViewAsType(source, R.id.textview_value_head, "field 'textview_value_head'", TextView.class);
    target.textview_dep_per = Utils.findRequiredViewAsType(source, R.id.textview_dep_per, "field 'textview_dep_per'", TextView.class);
    target.textview_depvalue = Utils.findRequiredViewAsType(source, R.id.textview_depvalue, "field 'textview_depvalue'", TextView.class);
    target.textview_permissiblearea_floor = Utils.findRequiredViewAsType(source, R.id.textview_permissiblearea_floor, "field 'textview_permissiblearea_floor'", TextView.class);
    target.textview_permissiblearea_unit = Utils.findRequiredViewAsType(source, R.id.textview_permissiblearea_unit, "field 'textview_permissiblearea_unit'", TextView.class);
    target.textview_permissiblearea_value = Utils.findRequiredViewAsType(source, R.id.textview_permissiblearea_value, "field 'textview_permissiblearea_value'", TextView.class);
    target.textview_permissiblearea_dep_value = Utils.findRequiredViewAsType(source, R.id.textview_permissiblearea_dep_value, "field 'textview_permissiblearea_dep_value'", TextView.class);
    target.textview_actual_floor = Utils.findRequiredViewAsType(source, R.id.textview_actual_floor, "field 'textview_actual_floor'", TextView.class);
    target.textview_actual_unit = Utils.findRequiredViewAsType(source, R.id.textview_actual_unit, "field 'textview_actual_unit'", TextView.class);
    target.textview_actual_value = Utils.findRequiredViewAsType(source, R.id.textview_actual_value, "field 'textview_actual_value'", TextView.class);
    target.textview_actual_dep_value = Utils.findRequiredViewAsType(source, R.id.textview_actual_dep_value, "field 'textview_actual_dep_value'", TextView.class);
    target.textview_totalconstructionvalue = Utils.findRequiredViewAsType(source, R.id.textview_totalconstructionvalue, "field 'textview_totalconstructionvalue'", TextView.class);
    target.textview_totalpropertyvalue = Utils.findRequiredViewAsType(source, R.id.textview_totalpropertyvalue, "field 'textview_totalpropertyvalue'", TextView.class);
    target.textview_insurancevaluepe = Utils.findRequiredViewAsType(source, R.id.textview_insurancevaluepe, "field 'textview_insurancevaluepe'", TextView.class);
    target.textview_proposedvaluation = Utils.findRequiredViewAsType(source, R.id.textview_proposedvaluation, "field 'textview_proposedvaluation'", TextView.class);
    target.textview_realizable_per = Utils.findRequiredViewAsType(source, R.id.textview_realizable_per, "field 'textview_realizable_per'", TextView.class);
    target.textview_distress_per = Utils.findRequiredViewAsType(source, R.id.textview_distress_per, "field 'textview_distress_per'", TextView.class);
    target.textview_carpet_per = Utils.findRequiredViewAsType(source, R.id.textview_carpet_per, "field 'textview_carpet_per'", TextView.class);
    target.textview_select = Utils.findRequiredViewAsType(source, R.id.textview_select, "field 'textview_select'", TextView.class);
    target.edittext_permissiblearea_rate = Utils.findRequiredViewAsType(source, R.id.edittext_permissiblearea_rate, "field 'edittext_permissiblearea_rate'", EditText.class);
    target.edittext_permissiblearea_dep_per = Utils.findRequiredViewAsType(source, R.id.edittext_permissiblearea_dep_per, "field 'edittext_permissiblearea_dep_per'", EditText.class);
    target.edittext_actual_rate = Utils.findRequiredViewAsType(source, R.id.edittext_actual_rate, "field 'edittext_actual_rate'", EditText.class);
    target.edittext_actual_dep_per = Utils.findRequiredViewAsType(source, R.id.edittext_actual_dep_per, "field 'edittext_actual_dep_per'", EditText.class);
    target.spinner_ft_meter = Utils.findRequiredViewAsType(source, R.id.spinner_ft_meter, "field 'spinner_ft_meter'", Spinner.class);
    target.spinner_ft_meter_construction = Utils.findRequiredViewAsType(source, R.id.spinner_ft_meter_construction, "field 'spinner_ft_meter_construction'", Spinner.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    FragmentValuationBuilding_ka target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.id_radiogroup_considerforvaluation_land = null;
    target.id_radio_considerforvaluation_permissiblearea_land = null;
    target.id_radio_considerforvaluation_actualarea_land = null;
    target.id_radiogroup_considerforvaluation_construction = null;
    target.id_radio_considerforvaluation_permissiblearea_construction = null;
    target.id_radio_considerforvaluation_actualarea_construction = null;
    target.linear_permissiblearea = null;
    target.linear_actualarea = null;
    target.linear_permissiblearea_row = null;
    target.linear_actual_row = null;
    target.textview_landvaluation = null;
    target.textview_unit_land = null;
    target.textview_constructionvaluation = null;
    target.textview_unit_construction = null;
    target.textview_floor_head = null;
    target.textview_permissiblearea_head = null;
    target.textview_value_head = null;
    target.textview_dep_per = null;
    target.textview_depvalue = null;
    target.textview_permissiblearea_floor = null;
    target.textview_permissiblearea_unit = null;
    target.textview_permissiblearea_value = null;
    target.textview_permissiblearea_dep_value = null;
    target.textview_actual_floor = null;
    target.textview_actual_unit = null;
    target.textview_actual_value = null;
    target.textview_actual_dep_value = null;
    target.textview_totalconstructionvalue = null;
    target.textview_totalpropertyvalue = null;
    target.textview_insurancevaluepe = null;
    target.textview_proposedvaluation = null;
    target.textview_realizable_per = null;
    target.textview_distress_per = null;
    target.textview_carpet_per = null;
    target.textview_select = null;
    target.edittext_permissiblearea_rate = null;
    target.edittext_permissiblearea_dep_per = null;
    target.edittext_actual_rate = null;
    target.edittext_actual_dep_per = null;
    target.spinner_ft_meter = null;
    target.spinner_ft_meter_construction = null;
  }
}
