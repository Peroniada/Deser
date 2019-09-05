public interface Deser {
  <T> T deserialize(String data, Interpreter parser, Class<T> clazz);
}
