// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user.proto

package com.example.grpclib;

public final class UserProto {
  private UserProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hobe_UserRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_hobe_UserRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hobe_UserResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_hobe_UserResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nuser.proto\022\010com.hobe\032\034google/api/annot" +
      "ations.proto\"\031\n\013UserRequest\022\n\n\002id\030\001 \001(\005\"" +
      "5\n\014UserResponse\022\n\n\002id\030\001 \001(\005\022\014\n\004name\030\002 \001(" +
      "\t\022\013\n\003age\030\003 \001(\0052S\n\004User\022K\n\007getUser\022\025.com." +
      "hobe.UserRequest\032\026.com.hobe.UserResponse" +
      "\"\021\202\323\344\223\002\013\022\t/get/{id}B\"\n\023com.example.grpcl" +
      "ibB\tUserProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_com_hobe_UserRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_hobe_UserRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_hobe_UserRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_com_hobe_UserResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_hobe_UserResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_hobe_UserResponse_descriptor,
        new java.lang.String[] { "Id", "Name", "Age", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
