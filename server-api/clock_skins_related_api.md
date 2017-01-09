# 设置clock（app）的皮肤

## 查看某个设备所有可用的皮肤

* GET /mobile/apps_configs/skins

requestHeaders

  Access-Token: <your-access-token>
  UUID: <your-device-uuid>

## 绑定用户和皮肤

* POST /mobile/apps_configs/skins/bind

requestHeaders

  Access-Token: <your-access-token>

requestBody

```json
"clockSkinId": <your-clock_skin-id>
```
