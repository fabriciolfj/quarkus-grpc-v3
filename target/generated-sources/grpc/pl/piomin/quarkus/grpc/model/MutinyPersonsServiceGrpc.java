package pl.piomin.quarkus.grpc.model;

import static pl.piomin.quarkus.grpc.model.PersonsServiceGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: person.proto")
public final class MutinyPersonsServiceGrpc implements io.quarkus.grpc.MutinyGrpc {

    private MutinyPersonsServiceGrpc() {
    }

    public static MutinyPersonsServiceStub newMutinyStub(io.grpc.Channel channel) {
        return new MutinyPersonsServiceStub(channel);
    }

    /**
     * <pre>
     *  (2)
     * </pre>
     */
    public static class MutinyPersonsServiceStub extends io.grpc.stub.AbstractStub<MutinyPersonsServiceStub> implements io.quarkus.grpc.MutinyStub {

        private PersonsServiceGrpc.PersonsServiceStub delegateStub;

        private MutinyPersonsServiceStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = PersonsServiceGrpc.newStub(channel);
        }

        private MutinyPersonsServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = PersonsServiceGrpc.newStub(channel).build(channel, callOptions);
        }

        @Override
        protected MutinyPersonsServiceStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MutinyPersonsServiceStub(channel, callOptions);
        }

        public io.smallrye.mutiny.Uni<pl.piomin.quarkus.grpc.model.PersonProto.Persons> findByName(com.google.protobuf.StringValue request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::findByName);
        }

        public io.smallrye.mutiny.Uni<pl.piomin.quarkus.grpc.model.PersonProto.Persons> findByAge(com.google.protobuf.Int32Value request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::findByAge);
        }

        public io.smallrye.mutiny.Uni<pl.piomin.quarkus.grpc.model.PersonProto.Person> findById(com.google.protobuf.Int64Value request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::findById);
        }

        public io.smallrye.mutiny.Uni<pl.piomin.quarkus.grpc.model.PersonProto.Persons> findAll(com.google.protobuf.Empty request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::findAll);
        }

        public io.smallrye.mutiny.Uni<pl.piomin.quarkus.grpc.model.PersonProto.Person> addPerson(pl.piomin.quarkus.grpc.model.PersonProto.Person request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::addPerson);
        }
    }

    /**
     * <pre>
     *  (2)
     * </pre>
     */
    public static abstract class PersonsServiceImplBase implements io.grpc.BindableService {

        private String compression;

        /**
         * Set whether the server will try to use a compressed response.
         *
         * @param compression the compression, e.g {@code gzip}
         */
        public PersonsServiceImplBase withCompression(String compression) {
            this.compression = compression;
            return this;
        }

        public io.smallrye.mutiny.Uni<pl.piomin.quarkus.grpc.model.PersonProto.Persons> findByName(com.google.protobuf.StringValue request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<pl.piomin.quarkus.grpc.model.PersonProto.Persons> findByAge(com.google.protobuf.Int32Value request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<pl.piomin.quarkus.grpc.model.PersonProto.Person> findById(com.google.protobuf.Int64Value request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<pl.piomin.quarkus.grpc.model.PersonProto.Persons> findAll(com.google.protobuf.Empty request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<pl.piomin.quarkus.grpc.model.PersonProto.Person> addPerson(pl.piomin.quarkus.grpc.model.PersonProto.Person request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override
        public io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor()).addMethod(pl.piomin.quarkus.grpc.model.PersonsServiceGrpc.getFindByNameMethod(), asyncUnaryCall(new MethodHandlers<com.google.protobuf.StringValue, pl.piomin.quarkus.grpc.model.PersonProto.Persons>(this, METHODID_FIND_BY_NAME, compression))).addMethod(pl.piomin.quarkus.grpc.model.PersonsServiceGrpc.getFindByAgeMethod(), asyncUnaryCall(new MethodHandlers<com.google.protobuf.Int32Value, pl.piomin.quarkus.grpc.model.PersonProto.Persons>(this, METHODID_FIND_BY_AGE, compression))).addMethod(pl.piomin.quarkus.grpc.model.PersonsServiceGrpc.getFindByIdMethod(), asyncUnaryCall(new MethodHandlers<com.google.protobuf.Int64Value, pl.piomin.quarkus.grpc.model.PersonProto.Person>(this, METHODID_FIND_BY_ID, compression))).addMethod(pl.piomin.quarkus.grpc.model.PersonsServiceGrpc.getFindAllMethod(), asyncUnaryCall(new MethodHandlers<com.google.protobuf.Empty, pl.piomin.quarkus.grpc.model.PersonProto.Persons>(this, METHODID_FIND_ALL, compression))).addMethod(pl.piomin.quarkus.grpc.model.PersonsServiceGrpc.getAddPersonMethod(), asyncUnaryCall(new MethodHandlers<pl.piomin.quarkus.grpc.model.PersonProto.Person, pl.piomin.quarkus.grpc.model.PersonProto.Person>(this, METHODID_ADD_PERSON, compression))).build();
        }
    }

    private static final int METHODID_FIND_BY_NAME = 0;

    private static final int METHODID_FIND_BY_AGE = 1;

    private static final int METHODID_FIND_BY_ID = 2;

    private static final int METHODID_FIND_ALL = 3;

    private static final int METHODID_ADD_PERSON = 4;

    private static final class MethodHandlers<Req, Resp> implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>, io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>, io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>, io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {

        private final PersonsServiceImplBase serviceImpl;

        private final int methodId;

        private final String compression;

        MethodHandlers(PersonsServiceImplBase serviceImpl, int methodId, String compression) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
            this.compression = compression;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch(methodId) {
                case METHODID_FIND_BY_NAME:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.google.protobuf.StringValue) request, (io.grpc.stub.StreamObserver<pl.piomin.quarkus.grpc.model.PersonProto.Persons>) responseObserver, compression, serviceImpl::findByName);
                    break;
                case METHODID_FIND_BY_AGE:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.google.protobuf.Int32Value) request, (io.grpc.stub.StreamObserver<pl.piomin.quarkus.grpc.model.PersonProto.Persons>) responseObserver, compression, serviceImpl::findByAge);
                    break;
                case METHODID_FIND_BY_ID:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.google.protobuf.Int64Value) request, (io.grpc.stub.StreamObserver<pl.piomin.quarkus.grpc.model.PersonProto.Person>) responseObserver, compression, serviceImpl::findById);
                    break;
                case METHODID_FIND_ALL:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.google.protobuf.Empty) request, (io.grpc.stub.StreamObserver<pl.piomin.quarkus.grpc.model.PersonProto.Persons>) responseObserver, compression, serviceImpl::findAll);
                    break;
                case METHODID_ADD_PERSON:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((pl.piomin.quarkus.grpc.model.PersonProto.Person) request, (io.grpc.stub.StreamObserver<pl.piomin.quarkus.grpc.model.PersonProto.Person>) responseObserver, compression, serviceImpl::addPerson);
                    break;
                default:
                    throw new java.lang.AssertionError();
            }
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch(methodId) {
                default:
                    throw new java.lang.AssertionError();
            }
        }
    }
}
