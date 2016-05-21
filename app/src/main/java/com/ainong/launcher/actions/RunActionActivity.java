package com.ainong.launcher.actions;

import android.app.Activity;
import android.os.Bundle;

public class RunActionActivity extends Activity {

	public static final String ACTION_LAUNCHERACTION = "com.ainong.launcher.ACTION_LAUNCHERACTION";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		LauncherActions.getInstance().launch(getIntent());
		finish();
	}
}
