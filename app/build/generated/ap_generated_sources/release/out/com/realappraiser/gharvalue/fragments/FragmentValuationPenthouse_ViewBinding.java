// Generated code from Butter Knife. Do not modify!
package com.realappraiser.gharvalue.fragments;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.realappraiser.gharvalue.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class FragmentValuationPenthouse_ViewBinding implements Unbinder {
  private FragmentValuationPenthouse target;

  @UiThread
  public FragmentValuationPenthouse_ViewBinding(FragmentValuationPenthouse target, View source) {
    this.target = target;

    target.linear_penthouse_terrace_row = Utils.findRequiredViewAsType(source, R.id.linear_penthouse_terrace_row, "field 'linear_penthouse_terrace_row'", LinearLayout.class);
    target.textview_area_measurment = Utils.findRequiredViewAsType(source, R.id.textview_area_measurment, "field 'textview_area_measurment'", TextView.class);
    target.textview_current_fair = Utils.findRequiredViewAsType(source, R.id.textview_current_fair, "field 'textview_current_fair'", TextView.class);
    target.textview_areatype_heading = Utils.findRequiredViewAsType(source, R.id.textview_areatype_heading, "field 'textview_areatype_heading'", TextView.class);
    target.textview_currentarea_heading = Utils.findRequiredViewAsType(source, R.id.textview_currentarea_heading, "field 'textview_currentarea_heading'", TextView.class);
    target.textview_marketrate_heading = Utils.findRequiredViewAsType(source, R.id.textview_marketrate_heading, "field 'textview_marketrate_heading'", TextView.class);
    target.textview_marketvalue_heading = Utils.findRequiredViewAsType(source, R.id.textview_marketvalue_heading, "field 'textview_marketvalue_heading'", TextView.class);
    target.textview_terrace = Utils.findRequiredViewAsType(source, R.id.textview_terrace, "field 'textview_terrace'", TextView.class);
    target.textview_terrace_total_head = Utils.findRequiredViewAsType(source, R.id.textview_terrace_total_head, "field 'textview_terrace_total_head'", TextView.class);
    target.textview_insurance = Utils.findRequiredViewAsType(source, R.id.textview_insurance, "field 'textview_insurance'", TextView.class);
    target.textview_area_sub_heading = Utils.findRequiredViewAsType(source, R.id.textview_area_sub_heading, "field 'textview_area_sub_heading'", TextView.class);
    target.textview_dlcrate_heading = Utils.findRequiredViewAsType(source, R.id.textview_dlcrate_heading, "field 'textview_dlcrate_heading'", TextView.class);
    target.textview_governmentvalue_head = Utils.findRequiredViewAsType(source, R.id.textview_governmentvalue_head, "field 'textview_governmentvalue_head'", TextView.class);
    target.textview_governmentvalue_subhead = Utils.findRequiredViewAsType(source, R.id.textview_governmentvalue_subhead, "field 'textview_governmentvalue_subhead'", TextView.class);
    target.textview_realizable_head = Utils.findRequiredViewAsType(source, R.id.textview_realizable_head, "field 'textview_realizable_head'", TextView.class);
    target.textview_realizable_distress_heading = Utils.findRequiredViewAsType(source, R.id.textview_realizable_distress_heading, "field 'textview_realizable_distress_heading'", TextView.class);
    target.textview_value_subheading = Utils.findRequiredViewAsType(source, R.id.textview_value_subheading, "field 'textview_value_subheading'", TextView.class);
    target.textview_realizable_value_head = Utils.findRequiredViewAsType(source, R.id.textview_realizable_value_head, "field 'textview_realizable_value_head'", TextView.class);
    target.textview_distress_head = Utils.findRequiredViewAsType(source, R.id.textview_distress_head, "field 'textview_distress_head'", TextView.class);
    target.textview_aspercompletion = Utils.findRequiredViewAsType(source, R.id.textview_aspercompletion, "field 'textview_aspercompletion'", TextView.class);
    target.textview_proposedvaluation = Utils.findRequiredViewAsType(source, R.id.textview_proposedvaluation, "field 'textview_proposedvaluation'", TextView.class);
    target.tvRatePopup = Utils.findRequiredViewAsType(source, R.id.tvRatePopup, "field 'tvRatePopup'", TextView.class);
    target.tvCompareRate = Utils.findRequiredViewAsType(source, R.id.tvCompareRate, "field 'tvCompareRate'", TextView.class);
    target.textview_areatypetvalue = Utils.findRequiredViewAsType(source, R.id.textview_areatype, "field 'textview_areatypetvalue'", TextView.class);
    target.textview_loadingoverbuildup = Utils.findRequiredViewAsType(source, R.id.textview_loadingoverbuildup, "field 'textview_loadingoverbuildup'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    FragmentValuationPenthouse target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.linear_penthouse_terrace_row = null;
    target.textview_area_measurment = null;
    target.textview_current_fair = null;
    target.textview_areatype_heading = null;
    target.textview_currentarea_heading = null;
    target.textview_marketrate_heading = null;
    target.textview_marketvalue_heading = null;
    target.textview_terrace = null;
    target.textview_terrace_total_head = null;
    target.textview_insurance = null;
    target.textview_area_sub_heading = null;
    target.textview_dlcrate_heading = null;
    target.textview_governmentvalue_head = null;
    target.textview_governmentvalue_subhead = null;
    target.textview_realizable_head = null;
    target.textview_realizable_distress_heading = null;
    target.textview_value_subheading = null;
    target.textview_realizable_value_head = null;
    target.textview_distress_head = null;
    target.textview_aspercompletion = null;
    target.textview_proposedvaluation = null;
    target.tvRatePopup = null;
    target.tvCompareRate = null;
    target.textview_areatypetvalue = null;
    target.textview_loadingoverbuildup = null;
  }
}
