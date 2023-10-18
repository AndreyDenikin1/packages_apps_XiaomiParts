package org.lineageos.settings.device;

import java.util.UUID;

public class Constants {
    /* Intent Actions and Extras */
    public static final String ACTION_DCDIMMING_SETTING_CHANGED = "devicesettings.intent.action.dcdimming_setting_changed";
    public static final String DCDIMMING_STATE = "devicesettings.extra.dcdimming.STATE";

    /* DC Dimming */
    public static final String KEY_DC_DIMMING = "pref_dc_dimming";
    public static final String DC_DIMMING_NODE = "/sys/devices/platform/soc/soc:qcom,dsi-display/anti_flicker";

    /* Clear Speaker */
    public static final String KEY_CLEAR_SPEAKER = "clear_speaker_pref";

    /* Thermal Profiles */
    public static final String THERMAL_SCONFIG = "/sys/class/thermal/thermal_message/sconfig";

    public static final int TOUCH_GAME_MODE = 0;
    public static final int TOUCH_PERF_LEVEL = 1;
    public static final int TOUCH_RESPONSE = 2;
    public static final int TOUCH_SENSITIVITY = 3;
    public static final int TOUCH_RESISTANT = 4;

    public static final String PROP_TOUCH_PERF_LEVEL = "sys.performance.level";
    public static final int MODE_TOUCH_GAME_MODE = 0;
    public static final int MODE_TOUCH_UP_THRESHOLD = 2;
    public static final int MODE_TOUCH_TOLERANCE = 3;
    public static final int MODE_TOUCH_EDGE_FILTER = 7;

    public static final String KEY_TOUCH_GAME_MODE = "touch_game_mode";
    public static final String KEY_TOUCH_PERF_LEVEL = "touch_perf_level";
    public static final String KEY_TOUCH_RESISTANT = "touch_resistant";
    public static final String KEY_TOUCH_RESPONSE = "touch_response";
    public static final String KEY_TOUCH_SENSITIVITY = "touch_sensitivity";

    public static final String THERMAL_CONTROL = "thermal_control";

    public static final int STATE_DEFAULT = 0;
    public static final int STATE_BENCHMARK = 1;
    public static final int STATE_BROWSER = 2;
    public static final int STATE_CAMERA = 3;
    public static final int STATE_DIALER = 4;
    public static final int STATE_GAMING = 5;
    public static final int STATE_NAVIGATION = 6;
    public static final int STATE_STREAMING = 7;
    public static final int STATE_VIDEO = 8;

    public static final String THERMAL_STATE_DEFAULT = "0";
    public static final String THERMAL_STATE_BENCHMARK = "10";
    public static final String THERMAL_STATE_BROWSER = "11";
    public static final String THERMAL_STATE_CAMERA = "12";
    public static final String THERMAL_STATE_DIALER = "8";
    public static final String THERMAL_STATE_GAMING = "13";
    public static final String THERMAL_STATE_NAVIGATION = "19";
    public static final String THERMAL_STATE_STREAMING = "14";
    public static final String THERMAL_STATE_VIDEO = "21";

    public static final String THERMAL_BENCHMARK = "thermal.benchmark=";
    public static final String THERMAL_BROWSER = "thermal.browser=";
    public static final String THERMAL_CAMERA = "thermal.camera=";
    public static final String THERMAL_DIALER = "thermal.dialer=";
    public static final String THERMAL_GAMING = "thermal.gaming=";
    public static final String THERMAL_NAVIGATION = "thermal.navigation=";
    public static final String THERMAL_STREAMING = "thermal.streaming=";
    public static final String THERMAL_VIDEO = "thermal.video=";

    /* Tile Entry Activity */
    public static final String DCDIMMING_TILE = "org.lineageos.settings.device.DcDimmingTileService";
}
