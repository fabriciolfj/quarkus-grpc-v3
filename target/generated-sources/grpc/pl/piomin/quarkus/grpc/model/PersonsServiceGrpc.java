package pl.piomin.quarkus.grpc.model;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * (2)
 * </pre>
 */
@io.quarkus.Generated(value = "by gRPC proto compiler (version 1.57.2)", comments = "Source: person.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PersonsServiceGrpc {

    private PersonsServiceGrpc() {
    }

    public static final java.lang.String SERVICE_NAME = "model.PersonsService";

    // Static method descriptors that strictly reflect the proto.
    private static volatile io.grpc.MethodDescriptor<com.google.protobuf.StringValue, pl.piomin.quarkus.grpc.model.PersonProto.Persons> getFindByNameMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "FindByName", requestType = com.google.protobuf.StringValue.class, responseType = pl.piomin.quarkus.grpc.model.PersonProto.Persons.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<com.google.protobuf.StringValue, pl.piomin.quarkus.grpc.model.PersonProto.Persons> getFindByNameMethod() {
        io.grpc.MethodDescriptor<com.google.protobuf.StringValue, pl.piomin.quarkus.grpc.model.PersonProto.Persons> getFindByNameMethod;
        if ((getFindByNameMethod = PersonsServiceGrpc.getFindByNameMethod) == null) {
            synchronized (PersonsServiceGrpc.class) {
                if ((getFindByNameMethod = PersonsServiceGrpc.getFindByNameMethod) == null) {
                    PersonsServiceGrpc.getFindByNameMethod = getFindByNameMethod = io.grpc.MethodDescriptor.<com.google.protobuf.StringValue, pl.piomin.quarkus.grpc.model.PersonProto.Persons>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.UNARY).setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindByName")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.StringValue.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(pl.piomin.quarkus.grpc.model.PersonProto.Persons.getDefaultInstance())).setSchemaDescriptor(new PersonsServiceMethodDescriptorSupplier("FindByName")).build();
                }
            }
        }
        return getFindByNameMethod;
    }

    private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Int32Value, pl.piomin.quarkus.grpc.model.PersonProto.Persons> getFindByAgeMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "FindByAge", requestType = com.google.protobuf.Int32Value.class, responseType = pl.piomin.quarkus.grpc.model.PersonProto.Persons.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<com.google.protobuf.Int32Value, pl.piomin.quarkus.grpc.model.PersonProto.Persons> getFindByAgeMethod() {
        io.grpc.MethodDescriptor<com.google.protobuf.Int32Value, pl.piomin.quarkus.grpc.model.PersonProto.Persons> getFindByAgeMethod;
        if ((getFindByAgeMethod = PersonsServiceGrpc.getFindByAgeMethod) == null) {
            synchronized (PersonsServiceGrpc.class) {
                if ((getFindByAgeMethod = PersonsServiceGrpc.getFindByAgeMethod) == null) {
                    PersonsServiceGrpc.getFindByAgeMethod = getFindByAgeMethod = io.grpc.MethodDescriptor.<com.google.protobuf.Int32Value, pl.piomin.quarkus.grpc.model.PersonProto.Persons>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.UNARY).setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindByAge")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Int32Value.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(pl.piomin.quarkus.grpc.model.PersonProto.Persons.getDefaultInstance())).setSchemaDescriptor(new PersonsServiceMethodDescriptorSupplier("FindByAge")).build();
                }
            }
        }
        return getFindByAgeMethod;
    }

    private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Int64Value, pl.piomin.quarkus.grpc.model.PersonProto.Person> getFindByIdMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "FindById", requestType = com.google.protobuf.Int64Value.class, responseType = pl.piomin.quarkus.grpc.model.PersonProto.Person.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<com.google.protobuf.Int64Value, pl.piomin.quarkus.grpc.model.PersonProto.Person> getFindByIdMethod() {
        io.grpc.MethodDescriptor<com.google.protobuf.Int64Value, pl.piomin.quarkus.grpc.model.PersonProto.Person> getFindByIdMethod;
        if ((getFindByIdMethod = PersonsServiceGrpc.getFindByIdMethod) == null) {
            synchronized (PersonsServiceGrpc.class) {
                if ((getFindByIdMethod = PersonsServiceGrpc.getFindByIdMethod) == null) {
                    PersonsServiceGrpc.getFindByIdMethod = getFindByIdMethod = io.grpc.MethodDescriptor.<com.google.protobuf.Int64Value, pl.piomin.quarkus.grpc.model.PersonProto.Person>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.UNARY).setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindById")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Int64Value.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(pl.piomin.quarkus.grpc.model.PersonProto.Person.getDefaultInstance())).setSchemaDescriptor(new PersonsServiceMethodDescriptorSupplier("FindById")).build();
                }
            }
        }
        return getFindByIdMethod;
    }

    private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty, pl.piomin.quarkus.grpc.model.PersonProto.Persons> getFindAllMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "FindAll", requestType = com.google.protobuf.Empty.class, responseType = pl.piomin.quarkus.grpc.model.PersonProto.Persons.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<com.google.protobuf.Empty, pl.piomin.quarkus.grpc.model.PersonProto.Persons> getFindAllMethod() {
        io.grpc.MethodDescriptor<com.google.protobuf.Empty, pl.piomin.quarkus.grpc.model.PersonProto.Persons> getFindAllMethod;
        if ((getFindAllMethod = PersonsServiceGrpc.getFindAllMethod) == null) {
            synchronized (PersonsServiceGrpc.class) {
                if ((getFindAllMethod = PersonsServiceGrpc.getFindAllMethod) == null) {
                    PersonsServiceGrpc.getFindAllMethod = getFindAllMethod = io.grpc.MethodDescriptor.<com.google.protobuf.Empty, pl.piomin.quarkus.grpc.model.PersonProto.Persons>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.UNARY).setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindAll")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(pl.piomin.quarkus.grpc.model.PersonProto.Persons.getDefaultInstance())).setSchemaDescriptor(new PersonsServiceMethodDescriptorSupplier("FindAll")).build();
                }
            }
        }
        return getFindAllMethod;
    }

    private static volatile io.grpc.MethodDescriptor<pl.piomin.quarkus.grpc.model.PersonProto.Person, pl.piomin.quarkus.grpc.model.PersonProto.Person> getAddPersonMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "AddPerson", requestType = pl.piomin.quarkus.grpc.model.PersonProto.Person.class, responseType = pl.piomin.quarkus.grpc.model.PersonProto.Person.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<pl.piomin.quarkus.grpc.model.PersonProto.Person, pl.piomin.quarkus.grpc.model.PersonProto.Person> getAddPersonMethod() {
        io.grpc.MethodDescriptor<pl.piomin.quarkus.grpc.model.PersonProto.Person, pl.piomin.quarkus.grpc.model.PersonProto.Person> getAddPersonMethod;
        if ((getAddPersonMethod = PersonsServiceGrpc.getAddPersonMethod) == null) {
            synchronized (PersonsServiceGrpc.class) {
                if ((getAddPersonMethod = PersonsServiceGrpc.getAddPersonMethod) == null) {
                    PersonsServiceGrpc.getAddPersonMethod = getAddPersonMethod = io.grpc.MethodDescriptor.<pl.piomin.quarkus.grpc.model.PersonProto.Person, pl.piomin.quarkus.grpc.model.PersonProto.Person>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.UNARY).setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddPerson")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(pl.piomin.quarkus.grpc.model.PersonProto.Person.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(pl.piomin.quarkus.grpc.model.PersonProto.Person.getDefaultInstance())).setSchemaDescriptor(new PersonsServiceMethodDescriptorSupplier("AddPerson")).build();
                }
            }
        }
        return getAddPersonMethod;
    }

    /**
     * Creates a new async stub that supports all call types for the service
     */
    public static PersonsServiceStub newStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<PersonsServiceStub> factory = new io.grpc.stub.AbstractStub.StubFactory<PersonsServiceStub>() {

            @java.lang.Override
            public PersonsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new PersonsServiceStub(channel, callOptions);
            }
        };
        return PersonsServiceStub.newStub(factory, channel);
    }

    /**
     * Creates a new blocking-style stub that supports unary and streaming output calls on the service
     */
    public static PersonsServiceBlockingStub newBlockingStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<PersonsServiceBlockingStub> factory = new io.grpc.stub.AbstractStub.StubFactory<PersonsServiceBlockingStub>() {

            @java.lang.Override
            public PersonsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new PersonsServiceBlockingStub(channel, callOptions);
            }
        };
        return PersonsServiceBlockingStub.newStub(factory, channel);
    }

    /**
     * Creates a new ListenableFuture-style stub that supports unary calls on the service
     */
    public static PersonsServiceFutureStub newFutureStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<PersonsServiceFutureStub> factory = new io.grpc.stub.AbstractStub.StubFactory<PersonsServiceFutureStub>() {

            @java.lang.Override
            public PersonsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new PersonsServiceFutureStub(channel, callOptions);
            }
        };
        return PersonsServiceFutureStub.newStub(factory, channel);
    }

    /**
     * <pre>
     * (2)
     * </pre>
     */
    public interface AsyncService {

        /**
         */
        default void findByName(com.google.protobuf.StringValue request, io.grpc.stub.StreamObserver<pl.piomin.quarkus.grpc.model.PersonProto.Persons> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindByNameMethod(), responseObserver);
        }

        /**
         */
        default void findByAge(com.google.protobuf.Int32Value request, io.grpc.stub.StreamObserver<pl.piomin.quarkus.grpc.model.PersonProto.Persons> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindByAgeMethod(), responseObserver);
        }

        /**
         */
        default void findById(com.google.protobuf.Int64Value request, io.grpc.stub.StreamObserver<pl.piomin.quarkus.grpc.model.PersonProto.Person> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindByIdMethod(), responseObserver);
        }

        /**
         */
        default void findAll(com.google.protobuf.Empty request, io.grpc.stub.StreamObserver<pl.piomin.quarkus.grpc.model.PersonProto.Persons> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindAllMethod(), responseObserver);
        }

        /**
         */
        default void addPerson(pl.piomin.quarkus.grpc.model.PersonProto.Person request, io.grpc.stub.StreamObserver<pl.piomin.quarkus.grpc.model.PersonProto.Person> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddPersonMethod(), responseObserver);
        }
    }

    /**
     * Base class for the server implementation of the service PersonsService.
     * <pre>
     * (2)
     * </pre>
     */
    public static abstract class PersonsServiceImplBase implements io.grpc.BindableService, AsyncService {

        @java.lang.Override
        public io.grpc.ServerServiceDefinition bindService() {
            return PersonsServiceGrpc.bindService(this);
        }
    }

    /**
     * A stub to allow clients to do asynchronous rpc calls to service PersonsService.
     * <pre>
     * (2)
     * </pre>
     */
    public static class PersonsServiceStub extends io.grpc.stub.AbstractAsyncStub<PersonsServiceStub> {

        private PersonsServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected PersonsServiceStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new PersonsServiceStub(channel, callOptions);
        }

        /**
         */
        public void findByName(com.google.protobuf.StringValue request, io.grpc.stub.StreamObserver<pl.piomin.quarkus.grpc.model.PersonProto.Persons> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getFindByNameMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void findByAge(com.google.protobuf.Int32Value request, io.grpc.stub.StreamObserver<pl.piomin.quarkus.grpc.model.PersonProto.Persons> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getFindByAgeMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void findById(com.google.protobuf.Int64Value request, io.grpc.stub.StreamObserver<pl.piomin.quarkus.grpc.model.PersonProto.Person> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getFindByIdMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void findAll(com.google.protobuf.Empty request, io.grpc.stub.StreamObserver<pl.piomin.quarkus.grpc.model.PersonProto.Persons> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getFindAllMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void addPerson(pl.piomin.quarkus.grpc.model.PersonProto.Person request, io.grpc.stub.StreamObserver<pl.piomin.quarkus.grpc.model.PersonProto.Person> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getAddPersonMethod(), getCallOptions()), request, responseObserver);
        }
    }

    /**
     * A stub to allow clients to do synchronous rpc calls to service PersonsService.
     * <pre>
     * (2)
     * </pre>
     */
    public static class PersonsServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PersonsServiceBlockingStub> {

        private PersonsServiceBlockingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected PersonsServiceBlockingStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new PersonsServiceBlockingStub(channel, callOptions);
        }

        /**
         */
        public pl.piomin.quarkus.grpc.model.PersonProto.Persons findByName(com.google.protobuf.StringValue request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getFindByNameMethod(), getCallOptions(), request);
        }

        /**
         */
        public pl.piomin.quarkus.grpc.model.PersonProto.Persons findByAge(com.google.protobuf.Int32Value request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getFindByAgeMethod(), getCallOptions(), request);
        }

        /**
         */
        public pl.piomin.quarkus.grpc.model.PersonProto.Person findById(com.google.protobuf.Int64Value request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getFindByIdMethod(), getCallOptions(), request);
        }

        /**
         */
        public pl.piomin.quarkus.grpc.model.PersonProto.Persons findAll(com.google.protobuf.Empty request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getFindAllMethod(), getCallOptions(), request);
        }

        /**
         */
        public pl.piomin.quarkus.grpc.model.PersonProto.Person addPerson(pl.piomin.quarkus.grpc.model.PersonProto.Person request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getAddPersonMethod(), getCallOptions(), request);
        }
    }

    /**
     * A stub to allow clients to do ListenableFuture-style rpc calls to service PersonsService.
     * <pre>
     * (2)
     * </pre>
     */
    public static class PersonsServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PersonsServiceFutureStub> {

        private PersonsServiceFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected PersonsServiceFutureStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new PersonsServiceFutureStub(channel, callOptions);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<pl.piomin.quarkus.grpc.model.PersonProto.Persons> findByName(com.google.protobuf.StringValue request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getFindByNameMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<pl.piomin.quarkus.grpc.model.PersonProto.Persons> findByAge(com.google.protobuf.Int32Value request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getFindByAgeMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<pl.piomin.quarkus.grpc.model.PersonProto.Person> findById(com.google.protobuf.Int64Value request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getFindByIdMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<pl.piomin.quarkus.grpc.model.PersonProto.Persons> findAll(com.google.protobuf.Empty request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getFindAllMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<pl.piomin.quarkus.grpc.model.PersonProto.Person> addPerson(pl.piomin.quarkus.grpc.model.PersonProto.Person request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getAddPersonMethod(), getCallOptions()), request);
        }
    }

    private static final int METHODID_FIND_BY_NAME = 0;

    private static final int METHODID_FIND_BY_AGE = 1;

    private static final int METHODID_FIND_BY_ID = 2;

    private static final int METHODID_FIND_ALL = 3;

    private static final int METHODID_ADD_PERSON = 4;

    private static final class MethodHandlers<Req, Resp> implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>, io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>, io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>, io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {

        private final AsyncService serviceImpl;

        private final int methodId;

        MethodHandlers(AsyncService serviceImpl, int methodId) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch(methodId) {
                case METHODID_FIND_BY_NAME:
                    serviceImpl.findByName((com.google.protobuf.StringValue) request, (io.grpc.stub.StreamObserver<pl.piomin.quarkus.grpc.model.PersonProto.Persons>) responseObserver);
                    break;
                case METHODID_FIND_BY_AGE:
                    serviceImpl.findByAge((com.google.protobuf.Int32Value) request, (io.grpc.stub.StreamObserver<pl.piomin.quarkus.grpc.model.PersonProto.Persons>) responseObserver);
                    break;
                case METHODID_FIND_BY_ID:
                    serviceImpl.findById((com.google.protobuf.Int64Value) request, (io.grpc.stub.StreamObserver<pl.piomin.quarkus.grpc.model.PersonProto.Person>) responseObserver);
                    break;
                case METHODID_FIND_ALL:
                    serviceImpl.findAll((com.google.protobuf.Empty) request, (io.grpc.stub.StreamObserver<pl.piomin.quarkus.grpc.model.PersonProto.Persons>) responseObserver);
                    break;
                case METHODID_ADD_PERSON:
                    serviceImpl.addPerson((pl.piomin.quarkus.grpc.model.PersonProto.Person) request, (io.grpc.stub.StreamObserver<pl.piomin.quarkus.grpc.model.PersonProto.Person>) responseObserver);
                    break;
                default:
                    throw new AssertionError();
            }
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch(methodId) {
                default:
                    throw new AssertionError();
            }
        }
    }

    public static io.grpc.ServerServiceDefinition bindService(AsyncService service) {
        return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor()).addMethod(getFindByNameMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(new MethodHandlers<com.google.protobuf.StringValue, pl.piomin.quarkus.grpc.model.PersonProto.Persons>(service, METHODID_FIND_BY_NAME))).addMethod(getFindByAgeMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(new MethodHandlers<com.google.protobuf.Int32Value, pl.piomin.quarkus.grpc.model.PersonProto.Persons>(service, METHODID_FIND_BY_AGE))).addMethod(getFindByIdMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(new MethodHandlers<com.google.protobuf.Int64Value, pl.piomin.quarkus.grpc.model.PersonProto.Person>(service, METHODID_FIND_BY_ID))).addMethod(getFindAllMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(new MethodHandlers<com.google.protobuf.Empty, pl.piomin.quarkus.grpc.model.PersonProto.Persons>(service, METHODID_FIND_ALL))).addMethod(getAddPersonMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(new MethodHandlers<pl.piomin.quarkus.grpc.model.PersonProto.Person, pl.piomin.quarkus.grpc.model.PersonProto.Person>(service, METHODID_ADD_PERSON))).build();
    }

    private static abstract class PersonsServiceBaseDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {

        PersonsServiceBaseDescriptorSupplier() {
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
            return pl.piomin.quarkus.grpc.model.PersonProto.getDescriptor();
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
            return getFileDescriptor().findServiceByName("PersonsService");
        }
    }

    private static final class PersonsServiceFileDescriptorSupplier extends PersonsServiceBaseDescriptorSupplier {

        PersonsServiceFileDescriptorSupplier() {
        }
    }

    private static final class PersonsServiceMethodDescriptorSupplier extends PersonsServiceBaseDescriptorSupplier implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {

        private final java.lang.String methodName;

        PersonsServiceMethodDescriptorSupplier(java.lang.String methodName) {
            this.methodName = methodName;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
            return getServiceDescriptor().findMethodByName(methodName);
        }
    }

    private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

    public static io.grpc.ServiceDescriptor getServiceDescriptor() {
        io.grpc.ServiceDescriptor result = serviceDescriptor;
        if (result == null) {
            synchronized (PersonsServiceGrpc.class) {
                result = serviceDescriptor;
                if (result == null) {
                    serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME).setSchemaDescriptor(new PersonsServiceFileDescriptorSupplier()).addMethod(getFindByNameMethod()).addMethod(getFindByAgeMethod()).addMethod(getFindByIdMethod()).addMethod(getFindAllMethod()).addMethod(getAddPersonMethod()).build();
                }
            }
        }
        return result;
    }
}
