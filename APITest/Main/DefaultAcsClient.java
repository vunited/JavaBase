package Main;

import com.aliyuncs.AcsRequest;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.auth.Credential;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.HttpResponse;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;

public class DefaultAcsClient implements IAcsClient {

	public DefaultAcsClient(DefaultProfile profile) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public <T extends AcsResponse> HttpResponse doAction(AcsRequest<T> request)
			throws ClientException, ServerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends AcsResponse> HttpResponse doAction(AcsRequest<T> request, boolean autoRetry, int maxRetryCounts)
			throws ClientException, ServerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends AcsResponse> HttpResponse doAction(AcsRequest<T> request, IClientProfile profile)
			throws ClientException, ServerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends AcsResponse> HttpResponse doAction(AcsRequest<T> request, String regionId, Credential credential)
			throws ClientException, ServerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends AcsResponse> T getAcsResponse(AcsRequest<T> request) throws ServerException, ClientException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends AcsResponse> T getAcsResponse(AcsRequest<T> request, boolean autoRetry, int maxRetryCounts)
			throws ServerException, ClientException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends AcsResponse> T getAcsResponse(AcsRequest<T> request, IClientProfile profile)
			throws ServerException, ClientException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends AcsResponse> T getAcsResponse(AcsRequest<T> request, String regionId, Credential credential)
			throws ServerException, ClientException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends AcsResponse> T getAcsResponse(AcsRequest<T> request, String regionId)
			throws ServerException, ClientException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CommonResponse getCommonResponse(CommonRequest request) throws ServerException, ClientException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends AcsResponse> HttpResponse doAction(AcsRequest<T> request, boolean autoRetry, int maxRetryCounts,
			IClientProfile profile) throws ClientException, ServerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void restoreSSLCertificate() {
		// TODO Auto-generated method stub

	}

	@Override
	public void ignoreSSLCertificate() {
		// TODO Auto-generated method stub

	}

	@Override
	public void shutdown() {
		// TODO Auto-generated method stub

	}

}
