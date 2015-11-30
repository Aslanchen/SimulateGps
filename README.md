# SimulateGps

语言：Java

工具：Eclipse

版本：1.0.0

android模拟位置程序,俗称GPS欺骗，只能修改采用GPS定位的软件。
手机定位方式目前有4种：基站定位，WIFI定位，GPS定位，AGPS定位，本方法，只能修改采用GPS定位方式。如果想要修改其他方式，目前研究思路采用root方式，然后进行线程注入，然后修改定位数据能实现，具体代码，还在研究中。

# 重要说明
运行之前

* 请先打开android手机-设置-开发者选项-允许模拟位置，打钩。
* 修改定位方法成仅限GPS，三星设置：设置-位置-模式-仅限GPS。
* 修改AndroidManifest.xml中的，使用你自己的百度地图key，申请地址：http://lbsyun.baidu.com/apiconsole/key

#问题反馈
在使用中有任何问题，欢迎反馈给我，可以用以下联系方式跟我交流

* 作者: 陈恒飞
* 邮件(122560007@qq.com)
* QQ: 122560007
* 新浪微博: [@Aslan_theOne](http://weibo.com/alsnahcne)
