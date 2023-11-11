package pl.piomin.quarkus.grpc.model;

import io.grpc.BindableService;
import io.quarkus.grpc.GrpcService;
import io.quarkus.grpc.MutinyBean;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: person.proto")
public class PersonsServiceBean extends MutinyPersonsServiceGrpc.PersonsServiceImplBase implements BindableService, MutinyBean {

    private final PersonsService delegate;

    PersonsServiceBean(@GrpcService PersonsService delegate) {
        this.delegate = delegate;
    }

    @Override
    public io.smallrye.mutiny.Uni<pl.piomin.quarkus.grpc.model.PersonProto.Persons> findByName(com.google.protobuf.StringValue request) {
        try {
            return delegate.findByName(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<pl.piomin.quarkus.grpc.model.PersonProto.Persons> findByAge(com.google.protobuf.Int32Value request) {
        try {
            return delegate.findByAge(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<pl.piomin.quarkus.grpc.model.PersonProto.Person> findById(com.google.protobuf.Int64Value request) {
        try {
            return delegate.findById(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<pl.piomin.quarkus.grpc.model.PersonProto.Persons> findAll(com.google.protobuf.Empty request) {
        try {
            return delegate.findAll(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<pl.piomin.quarkus.grpc.model.PersonProto.Person> addPerson(pl.piomin.quarkus.grpc.model.PersonProto.Person request) {
        try {
            return delegate.addPerson(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }
}
