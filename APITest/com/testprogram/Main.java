package com.testprogram;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.ecs.model.v20140526.*;
public class Main {
    public static void main(String[] args) {
        // Create and initialize a DefaultAcsClient instance
        DefaultProfile profile = DefaultProfile.getProfile(
            "<your-region-id>",          // The region ID
            "<your-access-key-id>",      // The AccessKey ID of the RAM account
            "<your-access-key-secret>"); // The AccessKey Secret of the RAM account
        IAcsClient client = new DefaultAcsClient(profile);
        // Create an API request and set parameters
        DescribeInstancesRequest request = new DescribeInstancesRequest();
        request.setPageSize(10);
        // Initiate the request and handle the response or exceptions
        DescribeInstancesResponse response;
        try {
            response = client.getAcsResponse(request);
            for (DescribeInstancesResponse.Instance instance:response.getInstances()) {
                System.out.println(instance.getPublicIpAddress());
            }
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }
    }
}