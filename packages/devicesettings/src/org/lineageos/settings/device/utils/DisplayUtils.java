package org.lineageos.settings.device.utils;

import android.content.Context;
import android.content.Intent;
import android.content.ContentResolver;
import android.os.UserHandle;
import android.provider.Settings;

import org.lineageos.settings.device.Constants;
import org.lineageos.settings.device.utils.FileUtils;

public class DisplayUtils {
    public static void setDcDimmingStatus(boolean enabled) {
        FileUtils.writeLine(Constants.DC_DIMMING_NODE, enabled ? "1" : "0");
    }
}
