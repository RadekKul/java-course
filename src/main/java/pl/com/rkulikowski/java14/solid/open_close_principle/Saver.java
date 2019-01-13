package pl.com.rkulikowski.java14.solid.open_close_principle;

public interface Saver<T> {
// zrobimy generic bo w dwoch roznych classach go uzyjemy do tego samego
    void save(T secret);
}
