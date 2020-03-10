package org.apache.cordova.aliyunsvideopro;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import android.app.Activity;
import android.content.Intent;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.aliyun.alivcsolution.setting.AlivcCropSettingActivity;
import com.aliyun.alivcsolution.setting.AlivcEditorSettingActivity;
import com.aliyun.alivcsolution.setting.AlivcRecordSettingActivity;

/**
 * This class echoes a string called from JavaScript.
 */
public class AliyunSVideoPro extends CordovaPlugin {
    /**
     *  判断是编辑模块进入还是通过社区模块的编辑功能进入
     *
     */
    private static final String INTENT_PARAM_KEY_ENTRANCE = "entrance";

    /**
     *  判断是编辑模块进入还是通过社区模块的编辑功能进入
     *  svideo: 短视频
     *  community: 社区
     */
    private static final String INTENT_PARAM_KEY_VALUE = "svideo";

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("test")) {
            String message = args.getString(0);
            this.showToast(message, callbackContext);
            return true;
        } else if (action.equals("startRecord")) {
            startRecord(cordova.getActivity());
            return true;
        } else if (action.equals("startCrop")) {
            startCrop(cordova.getActivity());
            return true;
        } else if (action.equals("startEdit")) {
            startEdit(cordova.getActivity());
            return true;
        }
        return false;
    }

    private void showToast(String message, CallbackContext callbackContext) {
        if (message != null && message.length() > 0) {
            Activity activity = this.cordova.getActivity();
            android.widget.Toast.makeText(activity, message, android.widget.Toast.LENGTH_SHORT).show();
            callbackContext.success(message);
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }

    private static void startRecord(Activity activity){
        // 视频拍摄
        Intent record = new Intent(activity, AlivcRecordSettingActivity.class);
        //判断是编辑模块进入还是通过社区模块的编辑功能进入
        //svideo: 短视频
        //community: 社区
        record.putExtra(INTENT_PARAM_KEY_ENTRANCE, INTENT_PARAM_KEY_VALUE);
        activity.startActivity(record);
    }

    private static void startEdit(Activity activity){
        // 视频编辑
        Intent edit = new Intent(activity, AlivcEditorSettingActivity.class);
        //判断是编辑模块进入还是通过社区模块的编辑功能进入
        //svideo: 短视频
        //community: 社区
        edit.putExtra(INTENT_PARAM_KEY_ENTRANCE, INTENT_PARAM_KEY_VALUE);
        activity.startActivity(edit);
    }

    private static void startCrop(Activity activity){
        // 视频裁剪
        Intent crop = new Intent(activity, AlivcCropSettingActivity.class);
        activity.startActivity(crop);
    }
}