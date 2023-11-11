# quarkus-grpc-v3

- para fazer uso das classes geradas pelo proto, utilize o plugin:
```
            <plugin>
                <groupId>org.codehaus.mojo</groupId>
                <artifactId>build-helper-maven-plugin</artifactId>
                <executions>
                    <execution>
                        <id>add-source</id>
                        <phase>generate-sources</phase>
                        <goals>
                            <goal>add-source</goal>
                        </goals>
                        <configuration>
                            <sources>
                                <source>target/generated-sources/grpc</source>
                            </sources>
                        </configuration>
                    </execution>
                </executions>
            </plugin>
```