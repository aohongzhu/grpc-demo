package com.example.server;


import com.example.grpclib.UserGrpc;
import com.example.grpclib.UserRequest;
import com.example.grpclib.UserResponse;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
/**
 * <p>
 * 服务端
 * </p>
 *
 * @author Aohongzhu
 * @since 2020年12月03日
 */
@GrpcService()
public class UserServerService extends UserGrpc.UserImplBase{

	@Override
	public void getUser(UserRequest request, StreamObserver<UserResponse> responseObserver) {
		UserResponse uResponse = null;
		if(request.getId() == 1) {
			uResponse = UserResponse.newBuilder().setId(1).setAge(23).setName("管理员").build();
		}else {
			uResponse = UserResponse.newBuilder().setId(0).setAge(0).setName("普通用户").build();
		}
		responseObserver.onNext(uResponse);
		responseObserver.onCompleted();
	}

}
