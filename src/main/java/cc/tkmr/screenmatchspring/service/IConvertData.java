package cc.tkmr.screenmatchspring.service;

public interface IConvertData {
    <T> T getData(String json, Class<T> iclass);
}
