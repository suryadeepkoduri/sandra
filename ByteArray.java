import java.util.Arrays;

public final class ByteArray {

    public final byte[] data;

    public ByteArray(byte[] data) {
        this.data = data.clone();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof ByteArray)) return false;

        ByteArray other = (ByteArray) obj;
        return Arrays.equals(this.data, other.data);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(data);
    }
}
