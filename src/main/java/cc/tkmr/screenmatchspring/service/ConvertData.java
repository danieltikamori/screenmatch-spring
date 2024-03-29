package cc.tkmr.screenmatchspring.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertData implements IConvertData{
    private ObjectMapper mapper = new ObjectMapper();


    @Override
    public <T> T getData(String json, Class<T> iclass) {
        try {
            return mapper.readValue(json, iclass);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
