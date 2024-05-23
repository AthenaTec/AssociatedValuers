// Generated code from Butter Knife. Do not modify!
package com.realappraiser.gharvalue.activities;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.realappraiser.gharvalue.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LoginActivity_ViewBinding implements Unbinder {
  private LoginActivity target;

  @UiThread
  public LoginActivity_ViewBinding(LoginActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public LoginActivity_ViewBinding(LoginActivity target, View source) {
    this.target = target;

    target.forgotpassword = Utils.findRequiredViewAsType(source, R.id.forgotpassword, "field 'forgotpassword'", TextView.class);
    target.seturl = Utils.findRequiredViewAsType(source, R.id.seturl, "field 'seturl'", TextView.class);
    target.login = Utils.findRequiredViewAsType(source, R.id.login, "field 'login'", TextView.class);
    target.txt = Utils.findRequiredViewAsType(source, R.id.txt, "field 'txt'", TextView.class);
    target.email_input = Utils.findRequiredViewAsType(source, R.id.email_input, "field 'email_input'", TextView.class);
    target.pwd_input = Utils.findRequiredViewAsType(source, R.id.pwd_input, "field 'pwd_input'", TextView.class);
    target.loginBtn = Utils.findRequiredViewAsType(source, R.id.loginBtn, "field 'loginBtn'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    LoginActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.forgotpassword = null;
    target.seturl = null;
    target.login = null;
    target.txt = null;
    target.email_input = null;
    target.pwd_input = null;
    target.loginBtn = null;
  }
}
