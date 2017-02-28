#调整当前播放

##更新播放
传送要播放的节目

* PUT /mobile/apps_configs/fm_play

requestHeaders
```
Access-Token: <your-access-token>
UUID: <your-device-uuid>
```

requestBody
```json
{
  "play": {"<some parameters>"}
}
```
