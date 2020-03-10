var exec = require('cordova/exec');

exports.test = function (arg0, success, error) {
    exec(success, error, 'AliyunSVideoPro', 'test', [arg0]);
};

exports.startRecord = function (arg0, success, error) {
    exec(success, error, 'AliyunSVideoPro', 'startRecord', [arg0]);
};

exports.startCrop = function (arg0, success, error) {
    exec(success, error, 'AliyunSVideoPro', 'startCrop', [arg0]);
};

exports.startEdit = function (arg0, success, error) {
    exec(success, error, 'AliyunSVideoPro', 'startEdit', [arg0]);
};