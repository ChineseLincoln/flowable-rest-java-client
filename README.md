# Flowable Client SDK

Flowable Client SDK 是对基于restful架构的flowable流程引擎的api接口封装

## 版本对应

<table>
<thead>
<tr>
  <th>SDK Version</th>
  <th>Flowable Version</th>
</tr>
</thead>
<tbody>
<tr>
  <td>1.0.0</td>
  <td>6.2.1.0</td>
</tr>
</tbody>
</table>

## Maven 依赖

    <dependency>
    	<groupId>com.toucan</groupId>
    	<artifactId>flowable-bpmn-client</artifactId>
    	<version>1.0-SNAPSHOT</version>
    </dependency>

## 使用方式

    // 获取Client实例
    FlowableClient client = FlowableClient.getInstance();
	// 调用connect方法配置连接地址、用户名、密码
	client.connect(Constants.EndPoint, Constants.USERNAME, Constants.PASSWORD)
	// 通过FlowableClient实例获取对应的API对象
	EngineAPI engineAPI = client.getEngineAPI();
	// 使用具体的API方法获取数据
	EngineInfo engineInfo = engineAPI.getEngineInfo();


**可以使用链式语法获取API实例**

    EngineAPI engineAPI = FlowableClient.getInstance().connect(Constants.EndPoint, Constants.USERNAME, Constants.PASSWORD).getEngineAPI();

## Filter 说明

## Query 说明

## Request 说明
