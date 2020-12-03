package com.example.client;


import com.example.grpclib.UserGrpc;
import com.example.grpclib.UserRequest;
import com.example.grpclib.UserResponse;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 客户端
 * </p>
 *
 * @author Aohongzhu
 * @since 2020年12月03日
 */
@Service
public class UserClientService {
	
	@GrpcClient("grpc-server")
	private UserGrpc.UserBlockingStub stub;
	
	public String get(int id) {
		UserResponse user = stub.getUser(UserRequest.newBuilder().setId(id).build());
		System.out.println(user.getName());
		return user.getName();
	}

}
