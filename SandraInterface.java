public interface SandraInterface {
    public void put(byte[] key, byte[] value);
    public byte[] get(byte[] key);
    public void delete(byte[] key);
}
