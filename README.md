# AliyunSVideoPro
阿里云短视频pro Cordova插件 
支持平台：Android

### 1.插件安装
    ionic cordova plugin add https://github.com/hellomooning/AliyunSVideoPro.git

插件较大，如因网络问题安装失败，可以下载到本地再安装：
    
    ionic cordova plugin add 本地目录

### 2.调用

    declare let cordova: any;

#### 视频拍摄
    cordova.plugins.AliyunSVideoPro.startRecord();

#### 视频裁剪
    cordova.plugins.AliyunSVideoPro.startCrop();

#### 视频编辑
    cordova.plugins.AliyunSVideoPro.startEdit();

### 3.Demo
https://github.com/hellomooning/AliyunSVideoProDemo
