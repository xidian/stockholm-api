# 创建、管理apps和devices的API

## 创建device
在数据库中加入一条设备记录。表端发送uuid，到服务器上创建记录。

* POST /clocks

requestBody:

	{
		"uuid": "123123"
	}

## 更新app的可用设置项

* POST /app_available_configs

requestBody

要求参数：`packageName`, `config`

```json
{
	"packageName": "com.1",
	"config": {
		"channel":[
			{"id": 1, "name": "Sport"},
			{"id": 2, "name": "Finance"}
			]
	}
}
```

## 创建clock（app）皮肤

* POST /mobile/apps_configs/skins

requestBody

```json
{
	"name": "<your-clock_skin-name>",
	"url": "<your-clock_skin-url>"
}
```
