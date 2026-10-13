import java.util.HashMap;
import java.util.Map;

public class SandraEngine implements SandraInterface {

    Map<ByteArray, byte[]> map;

    public SandraEngine() {
        map = new HashMap<>();
    }

    @Override
    public void put(byte[] key, byte[] value) {
        map.put(new ByteArray(key), value);
    }

    @Override
    public byte[] get(byte[] key) {
        return map.get(new ByteArray(key));
    }

    @Override
    public void delete(byte[] key) {
        map.remove(new ByteArray(key));
    }
}
