# SimulateGps

语言：Java

工具：Eclipse

版本：1.0.0

手机定位方式目前有4种：基站定位，WIFI定位，GPS定位，AGPS定位。

目前比较稳定的思路就是使用hook，用它对app_process进行注入，找到定位的方法，然后进行修改，但此方法需要root权限。参考：http://www.jianshu.com/p/91e312faa6c3

我这里方法是利用手机自带的"模拟位置"功能实现运行时修改LocationManager结果，原理：使用android自带的调试api，模拟gps provider的结果。
LocationManager.setTestProviderLocation(Provider, Location);
此不稳定，特征明显，容易按特征嗅探到（有反作弊机制的游戏基本都能查出来），需要打开开发者的允许模拟位置选项。

# 重要说明
运行之前

* 请先打开android手机-设置-开发者选项-允许模拟位置，打钩。
* 修改定位方法成仅限GPS，三星设置：设置-位置-模式-仅限GPS。
* 修改AndroidManifest.xml中的，使用你自己的百度地图key，申请地址：http://lbsyun.baidu.com/apiconsole/key

#问题反馈
在使用中有任何问题，欢迎反馈给我，可以用以下联系方式跟我交流

* 作者: 陈恒飞
* 邮件(122560007@qq.com)
