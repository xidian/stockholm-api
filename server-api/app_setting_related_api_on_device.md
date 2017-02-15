# 设备端设置app

[第二部分API](#user-content-第二部分设备端)默认调用者为设备端

* [安装app](#user-content-设备请求安装app)
* [更新app设置](#user-content-更新app设置)
* [查询app的config](#user-content-查询app的config)

----

## 第二部分：设备端

### 获取某已安装app的配置
设备端下载app的配置

* GET /device/app

requestHeaders

```
	UUID: <your-device-uuid>
	PackageName: <your-package-name>
```

responseBody["data"]
```json
{"config": "{}"}
```

### 查询某设备的所有apps

* GET /device/apps

requestHeaders:

```
	UUID: <your-device-uuid>
```
