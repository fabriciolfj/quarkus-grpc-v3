package pl.piomin.quarkus.grpc.model;

import java.util.function.BiFunction;
import io.quarkus.grpc.MutinyClient;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: person.proto")
public class PersonsServiceClient implements PersonsService, MutinyClient<MutinyPersonsServiceGrpc.MutinyPersonsServiceStub> {

    private final MutinyPersonsServiceGrpc.MutinyPersonsServiceStub stub;

    public PersonsServiceClient(String name, io.grpc.Channel channel, BiFunction<String, MutinyPersonsServiceGrpc.MutinyPersonsServiceStub, MutinyPersonsServiceGrpc.MutinyPersonsServiceStub> stubConfigurator) {
        this.stub = stubConfigurator.apply(name, MutinyPersonsServiceGrpc.newMutinyStub(channel));
    }

    private PersonsServiceClient(MutinyPersonsServiceGrpc.MutinyPersonsServiceStub stub) {
        this.stub = stub;
    }

    public PersonsServiceClient newInstanceWithStub(MutinyPersonsServiceGrpc.MutinyPersonsServiceStub stub) {
        return new PersonsServiceClient(stub);
    }

    @Override
    public MutinyPersonsServiceGrpc.MutinyPersonsServiceStub getStub() {
        return stub;
    }

    @Override
    public io.smallrye.mutiny.Uni<pl.piomin.quarkus.grpc.model.PersonProto.Persons> findByName(com.google.protobuf.StringValue request) {
        return stub.findByName(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<pl.piomin.quarkus.grpc.model.PersonProto.Persons> findByAge(com.google.protobuf.Int32Value request) {
        return stub.findByAge(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<pl.piomin.quarkus.grpc.model.PersonProto.Person> findById(com.google.protobuf.Int64Value request) {
        return stub.findById(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<pl.piomin.quarkus.grpc.model.PersonProto.Persons> findAll(com.google.protobuf.Empty request) {
        return stub.findAll(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<pl.piomin.quarkus.grpc.model.PersonProto.Person> addPerson(pl.piomin.quarkus.grpc.model.PersonProto.Person request) {
        return stub.addPerson(request);
    }
}
