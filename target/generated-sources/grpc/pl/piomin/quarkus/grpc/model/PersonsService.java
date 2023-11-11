package pl.piomin.quarkus.grpc.model;

import io.quarkus.grpc.MutinyService;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: person.proto")
public interface PersonsService extends MutinyService {

    io.smallrye.mutiny.Uni<pl.piomin.quarkus.grpc.model.PersonProto.Persons> findByName(com.google.protobuf.StringValue request);

    io.smallrye.mutiny.Uni<pl.piomin.quarkus.grpc.model.PersonProto.Persons> findByAge(com.google.protobuf.Int32Value request);

    io.smallrye.mutiny.Uni<pl.piomin.quarkus.grpc.model.PersonProto.Person> findById(com.google.protobuf.Int64Value request);

    io.smallrye.mutiny.Uni<pl.piomin.quarkus.grpc.model.PersonProto.Persons> findAll(com.google.protobuf.Empty request);

    io.smallrye.mutiny.Uni<pl.piomin.quarkus.grpc.model.PersonProto.Person> addPerson(pl.piomin.quarkus.grpc.model.PersonProto.Person request);
}
