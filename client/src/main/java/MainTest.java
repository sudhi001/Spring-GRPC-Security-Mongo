import com.nullsafety.general.lib.HelloReply;
import com.nullsafety.general.lib.HelloRequest;
import com.nullsafety.general.lib.SimpleGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class MainTest {

    public static void main(String[] args) throws InterruptedException {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 7080)
                .usePlaintext()
                .build();
        SimpleGrpc.SimpleBlockingStub stub =
                SimpleGrpc.newBlockingStub(channel);

        HelloReply helloResponse = stub.sayHello(
                HelloRequest.newBuilder()
                        .setName("Ray")
                        .build());
        System.out.println(helloResponse);
        channel.shutdown();
    }
}
