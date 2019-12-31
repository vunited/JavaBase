//
//  Created by  fred on 2017/1/12.
//  Copyright © 2016年 Alibaba. All rights reserved.
//

package gupiao;
import org.junit.Test;

import com.alibaba.cloudapi.sdk.client.ApacheHttpClient;
import com.alibaba.cloudapi.sdk.enums.Scheme;
import com.alibaba.cloudapi.sdk.enums.HttpMethod;
import com.alibaba.cloudapi.sdk.model.ApiRequest;
import com.alibaba.cloudapi.sdk.model.ApiResponse;
import com.alibaba.cloudapi.sdk.model.ApiCallback;
import com.alibaba.cloudapi.sdk.model.HttpClientBuilderParams;
import com.alibaba.cloudapi.sdk.enums.ParamPosition;
import com.alibaba.cloudapi.sdk.enums.WebSocketApiType;
import com.alibaba.fastjson.JSONObject;


public class HttpApiClient股票查询_免费版 extends ApacheHttpClient{
    public final static String HOST = "stock.market.alicloudapi.com";
    static HttpApiClient股票查询_免费版 instance = new HttpApiClient股票查询_免费版();
    public static HttpApiClient股票查询_免费版 getInstance(){return instance;}

    public void init(HttpClientBuilderParams httpClientBuilderParams){
        httpClientBuilderParams.setScheme(Scheme.HTTP);
        httpClientBuilderParams.setHost(HOST);
        super.init(httpClientBuilderParams);
    }




    public void 根据名称或编码查询股票信息(String code , String name , ApiCallback callback) {
        String path = "/name-to-stockinfo";
        ApiRequest request = new ApiRequest(HttpMethod.GET , path);
        request.addParam("code" , code , ParamPosition.QUERY , false);
        request.addParam("name" , name , ParamPosition.QUERY , false);



        sendAsyncRequest(request , callback);
    }

    public ApiResponse 根据名称或编码查询股票信息SyncMode(String code , String name) {
        String path = "/name-to-stockinfo";
        ApiRequest request = new ApiRequest(HttpMethod.GET , path);
        request.addParam("code" , code , ParamPosition.QUERY , false);
        request.addParam("name" , name , ParamPosition.QUERY , false);



        return sendSyncRequest(request);
    }
    public void 香港股票历史行情(String begin , String end , String code , ApiCallback callback) {
        String path = "/hk-stock-history";
        ApiRequest request = new ApiRequest(HttpMethod.GET , path);
        request.addParam("begin" , begin , ParamPosition.QUERY , true);
        request.addParam("end" , end , ParamPosition.QUERY , true);
        request.addParam("code" , code , ParamPosition.QUERY , true);



        sendAsyncRequest(request , callback);
    }

    public ApiResponse 香港股票历史行情SyncMode(String begin , String end , String code) {
        String path = "/hk-stock-history";
        ApiRequest request = new ApiRequest(HttpMethod.GET , path);
        request.addParam("begin" , begin , ParamPosition.QUERY , true);
        request.addParam("end" , end , ParamPosition.QUERY , true);
        request.addParam("code" , code , ParamPosition.QUERY , true);



        return sendSyncRequest(request);
    }
    public void 沪深港股票历史行情(String begin , String end , String code , ApiCallback callback) {
        String path = "/sz-sh-stock-history";
        ApiRequest request = new ApiRequest(HttpMethod.GET , path);
        request.addParam("begin" , begin , ParamPosition.QUERY , true);
        request.addParam("end" , end , ParamPosition.QUERY , true);
        request.addParam("code" , code , ParamPosition.QUERY , true);



        sendAsyncRequest(request , callback);
    }

    public ApiResponse 沪深港股票历史行情SyncMode(String begin , String end , String code) {
        String path = "/sz-sh-stock-history";
        ApiRequest request = new ApiRequest(HttpMethod.GET , path);
        request.addParam("begin" , begin , ParamPosition.QUERY , true);
        request.addParam("end" , end , ParamPosition.QUERY , true);
        request.addParam("code" , code , ParamPosition.QUERY , true);



        return sendSyncRequest(request);
    }

}