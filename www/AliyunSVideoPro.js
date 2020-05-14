var exec = require('cordova/exec');

exports.test = function (arg0, success, error) {
    exec(success, error, 'AliyunSVideoPro', 'test', [arg0]);
};

exports.startRecord = function (arg0, success, error) {
    exec(success, error, 'AliyunSVideoPro', 'startRecord', [arg0]);
};

exports.startRecordSetting = function (arg0, success, error) {
    exec(success, error, 'AliyunSVideoPro', 'startRecordSetting', [arg0]);
};

exports.startCropSetting = function (arg0, success, error) {
    exec(success, error, 'AliyunSVideoPro', 'startCropSetting', [arg0]);
};

exports.startEditSetting = function (arg0, success, error) {
    exec(success, error, 'AliyunSVideoPro', 'startEditSetting', [arg0]);
};

exports.startBeauty = function (arg0, success, error) {
    exec(success, error, 'AliyunSVideoPro', 'startBeauty', [arg0]);
};