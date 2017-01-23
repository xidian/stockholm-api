#检测设备是否在线

##连接指令

* POST /mobile/clock/check_device_alive

requestHeader
```
Access-Token: <your-access-token>
UUID: <your-device-uuid>
```

##断开指令

* POST /mobile/clock/end_device_connection

requestHeader
```
Access-Token: <your-access-token>
UUID: <your-device-uuid>
```

##设备端连接

WebSocket通信

* ws://YOUR-DOMAIN/ws

requestBody
```
{"command":"subscribe","identifier":"{\"channel\":\"DeviceChannel\",\"uuid\":\"<your-device-uuid>\",\"phoneNumber\":\"<your-phone-number>\"}"}
```
